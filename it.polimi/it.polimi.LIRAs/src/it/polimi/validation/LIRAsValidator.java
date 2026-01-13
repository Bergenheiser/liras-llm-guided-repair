
package it.polimi.validation;


import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.Human;
import it.polimi.lIRAs.Robot;
import it.polimi.lIRAs.Location;
import it.polimi.lIRAs.Model;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Pattern;
import it.polimi.lIRAs.Resource;
import it.polimi.lIRAs.Sequence;
import it.polimi.lIRAs.SubSequence;
import it.polimi.lIRAs.Target;
import it.polimi.lIRAs.Relation;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class LIRAsValidator extends AbstractLIRAsValidator {
	
	// ==============================================================================
	// Check that subsequences start from 1 and are in crescent order
	// ==============================================================================
	
	// Variable initialization
    int previousI = 0; // Needed to check that a sub-sequence has a number grater than the previous one
    Sequence previousSequence = null; // Initialize the variable to check when we change sequence and reset the value of previousI

    @Check
    public void checkSubSequenceIValue(SubSequence subSequence) {
        if (subSequence.getI() < 1) {
            error("The value of 'i' must be greater than 0.", LIRAsPackage.Literals.SUB_SEQUENCE__I);
        }

        // Check if the current sequence is different from the previous one
        if (subSequence.eContainer() != null && subSequence.eContainer() instanceof Sequence) {
            Sequence currentSequence = (Sequence) subSequence.eContainer();

            // If previousSequence is not null and the currentSequence is different, reset previousI
            if (previousSequence != null && !currentSequence.equals(previousSequence)) {
                previousI = 0;
            }

            // Update previousSequence with the current sequence
            previousSequence = currentSequence;
        }

        // Check if the current 'i' value is less than or equal to the previous one
        if (subSequence.getI() <= previousI) {
            error("The value of 'i' must be greater than the previous one.", LIRAsPackage.Literals.SUB_SEQUENCE__I);
        }

        // Check if the value of 'j' is lower than 'i' in the continuation
        if (subSequence.getJ() != 0 && subSequence.getI() >= subSequence.getJ()) {
            error("'i' value must be less than 'j' value if both are specified.", LIRAsPackage.Literals.SUB_SEQUENCE__I);
        }

        // Check the value of 'i' when 'j' is specified in the above line
        if (subSequence.getJ() != 0 && subSequence.eContainer() instanceof Sequence) {
            Sequence sequence = (Sequence) subSequence.eContainer();
            EList<SubSequence> subSequences = sequence.getSubSequence();
            int currentIndex = subSequences.indexOf(subSequence);

            if (currentIndex < subSequences.size() - 1) {
                SubSequence nextSubSequence = subSequences.get(currentIndex + 1);
                int nextStart = nextSubSequence.getI();

                if (nextStart <= subSequence.getJ()) {
                    error("The 'i' value in the next line must be greater than 'j' value of the previous line.", LIRAsPackage.Literals.SUB_SEQUENCE__I);
                }
            }
        }

        // Update previousI with the current 'i' value
        previousI = subSequence.getI();
    }     
    
    // ==============================================================================
    // Check that action parameters are equal to the one pass to the pattern 
    // ==============================================================================
    
    // Sets to store names of agents, locations, and resources specified in the pattern
    private Set<String> patternAgents = new HashSet<>();
    private Set<String> patternLocations = new HashSet<>();
    private Set<String> patternResources = new HashSet<>();


    @Check
    public void checkPatternInputs(Model model) {
        patternAgents.clear();
        patternLocations.clear();
        patternResources.clear();

        Pattern pattern = model.getPattern();
        if (pattern != null) {
        	// Collect agent names from the pattern (both humans and robots)
            EList<Human> humans = pattern.getHuman();
            for (Human human : humans) {
                patternAgents.add(human.getName());
            }

            EList<Robot> robots = pattern.getRobot();
            for (Robot robot : robots) {
            	patternAgents.add(robot.getName());
            }

            // Collect location names from the pattern
            EList<Location> locations = pattern.getLocations();
            for (Location location : locations) {
                patternLocations.add(location.getName());
            }

            // Collect resource names from the pattern
            EList<Resource> resources = pattern.getResources();
            for (Resource resource : resources) {
                patternResources.add(resource.getName());
            }
        }
    }

    // Method to check if the agent in a sequence is one of the names specified in the pattern
    @Check
    public void checkSequenceAgent(Sequence sequence) {
        Agent agent = sequence.getAgent();
        if (agent != null && !patternAgents.contains(agent.getName())) {
            error("Agent name must be one of the names specified in the pattern.", agent, null, 0);
        }
    }

    // Method to check if the target in an action is one of the names specified in the pattern (Agent, Location, or Resource)
    @Check
    public void checkActionTarget(Target target) {
        String targetName = target.getName();
        if (targetName != null &&
                !patternAgents.contains(targetName) &&
                !patternLocations.contains(targetName) &&
                !patternResources.contains(targetName)) {
            error("Target name must be one of the names specified in the pattern (Agent, Location, or Resource).", target, null, 0);
        }
    }

    // Method to check if the agent in an action is one of the names specified in the pattern
    @Check
    public void checkActionAgent(Agent agent) {
        if (agent != null && !patternAgents.contains(agent.getName())) {
            error("Agent name must be one of the names specified in the pattern.", agent, null, 0);
        }
    }

    // Method to check if the resource in an action is one of the names specified in the pattern
    @Check
    public void checkActionResource(Resource resource) {
        if (resource != null && !patternResources.contains(resource.getName())) {
            error("Resource name must be one of the names specified in the pattern.", resource, null, 0);
        }
    }

    // Method to check if the location in an action is one of the names specified in the pattern
    @Check
    public void checkActionLocation(Location location) {
        if (location != null && !patternLocations.contains(location.getName())) {
            error("Location name must be one of the names specified in the pattern.", location, null, 0);
        }
    }
    
    // ==============================================================================
    // Check that the parameters of the 'dist' relation are not equal
    // ==============================================================================

    @Check
    public void checkDistinctAgentsInRelation(Relation relation) {
        if (relation.getAgent().size() == 2) {
            Agent agent1 = relation.getAgent().get(0);
            Agent agent2 = relation.getAgent().get(1);

            if (agent1.getName().equals(agent2.getName())) {
                error("The two agents in the dist parameters must be distinct.", LIRAsPackage.Literals.RELATION__AGENT, 0);
            }
        }
    }
    
    // check that two sequence has not the same agent 
    
    @Check
    public void checkDistinctAgentsInSequences(Sequence sequence) {
        Agent currentAgent = sequence.getAgent();
        EObject container = sequence.eContainer();
        
        if (container instanceof Model) {
            Model model = (Model) container;
            for (Sequence otherSequence : model.getSequence()) {
                if (otherSequence != sequence) {
                    Agent otherAgent = otherSequence.getAgent();
                    if (otherAgent != null && otherAgent.getName() != null && otherAgent.getName().equals(currentAgent.getName())) {
                        error("The same agent cannot be used in more than one sequence..", LIRAsPackage.Literals.SEQUENCE__AGENT, 0);
                        return;
                    }
                }
            }
        }
    }
    
}