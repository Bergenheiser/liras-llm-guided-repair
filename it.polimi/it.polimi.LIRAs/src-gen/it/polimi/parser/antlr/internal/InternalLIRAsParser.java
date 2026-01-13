package it.polimi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.services.LIRAsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLIRAsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'agents:'", "'Humans:'", "','", "'Robots:'", "'locations:'", "'resources:'", "'default'", "':'", "'-'", "'success:'", "'failure:'", "'skip'", "'all'", "'if'", "'restart'", "'until'", "'else'", "'wait'", "'stop'", "'moveTo'", "'fetch'", "'deliver'", "'leave'", "'follow'", "'('", "')'", "'receiveFrom'", "'!'", "'&&'", "'||'", "'tired'", "'time'", "'position'", "'possess'", "'busy'", "'still'", "'dist'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'soc'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_NL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLIRAsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLIRAsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLIRAsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLIRAs.g"; }



     	private LIRAsGrammarAccess grammarAccess;

        public InternalLIRAsParser(TokenStream input, LIRAsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LIRAsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLIRAs.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLIRAs.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalLIRAs.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLIRAs.g:71:1: ruleModel returns [EObject current=null] : ( (this_NL_0= RULE_NL )* ( (lv_pattern_1_0= rulePattern ) ) ( (lv_sequence_2_0= ruleSequence ) )* ( (lv_conclusion_3_0= ruleConclusion ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_NL_0=null;
        EObject lv_pattern_1_0 = null;

        EObject lv_sequence_2_0 = null;

        EObject lv_conclusion_3_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:77:2: ( ( (this_NL_0= RULE_NL )* ( (lv_pattern_1_0= rulePattern ) ) ( (lv_sequence_2_0= ruleSequence ) )* ( (lv_conclusion_3_0= ruleConclusion ) )? ) )
            // InternalLIRAs.g:78:2: ( (this_NL_0= RULE_NL )* ( (lv_pattern_1_0= rulePattern ) ) ( (lv_sequence_2_0= ruleSequence ) )* ( (lv_conclusion_3_0= ruleConclusion ) )? )
            {
            // InternalLIRAs.g:78:2: ( (this_NL_0= RULE_NL )* ( (lv_pattern_1_0= rulePattern ) ) ( (lv_sequence_2_0= ruleSequence ) )* ( (lv_conclusion_3_0= ruleConclusion ) )? )
            // InternalLIRAs.g:79:3: (this_NL_0= RULE_NL )* ( (lv_pattern_1_0= rulePattern ) ) ( (lv_sequence_2_0= ruleSequence ) )* ( (lv_conclusion_3_0= ruleConclusion ) )?
            {
            // InternalLIRAs.g:79:3: (this_NL_0= RULE_NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLIRAs.g:80:4: this_NL_0= RULE_NL
            	    {
            	    this_NL_0=(Token)match(input,RULE_NL,FOLLOW_3); 

            	    				newLeafNode(this_NL_0, grammarAccess.getModelAccess().getNLTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLIRAs.g:85:3: ( (lv_pattern_1_0= rulePattern ) )
            // InternalLIRAs.g:86:4: (lv_pattern_1_0= rulePattern )
            {
            // InternalLIRAs.g:86:4: (lv_pattern_1_0= rulePattern )
            // InternalLIRAs.g:87:5: lv_pattern_1_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPatternPatternParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_pattern_1_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_1_0,
            						"it.polimi.LIRAs.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLIRAs.g:104:3: ( (lv_sequence_2_0= ruleSequence ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLIRAs.g:105:4: (lv_sequence_2_0= ruleSequence )
            	    {
            	    // InternalLIRAs.g:105:4: (lv_sequence_2_0= ruleSequence )
            	    // InternalLIRAs.g:106:5: lv_sequence_2_0= ruleSequence
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sequence_2_0=ruleSequence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sequence",
            	    						lv_sequence_2_0,
            	    						"it.polimi.LIRAs.Sequence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalLIRAs.g:123:3: ( (lv_conclusion_3_0= ruleConclusion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLIRAs.g:124:4: (lv_conclusion_3_0= ruleConclusion )
                    {
                    // InternalLIRAs.g:124:4: (lv_conclusion_3_0= ruleConclusion )
                    // InternalLIRAs.g:125:5: lv_conclusion_3_0= ruleConclusion
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getConclusionConclusionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conclusion_3_0=ruleConclusion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"conclusion",
                    						lv_conclusion_3_0,
                    						"it.polimi.LIRAs.Conclusion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePattern"
    // InternalLIRAs.g:146:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalLIRAs.g:146:48: (iv_rulePattern= rulePattern EOF )
            // InternalLIRAs.g:147:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalLIRAs.g:153:1: rulePattern returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_NL_1= RULE_NL )+ ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )* ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_NL_1=null;
        Token otherlv_2=null;
        Token this_NL_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_NL_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_NL_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token this_NL_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token this_NL_23=null;
        EObject lv_human_5_0 = null;

        EObject lv_human_7_0 = null;

        EObject lv_robot_10_0 = null;

        EObject lv_robot_12_0 = null;

        EObject lv_locations_15_0 = null;

        EObject lv_locations_17_0 = null;

        EObject lv_resources_20_0 = null;

        EObject lv_resources_22_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:159:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_NL_1= RULE_NL )+ ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )* ) )
            // InternalLIRAs.g:160:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_NL_1= RULE_NL )+ ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )* )
            {
            // InternalLIRAs.g:160:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_NL_1= RULE_NL )+ ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )* )
            // InternalLIRAs.g:161:3: ( (lv_name_0_0= RULE_ID ) ) (this_NL_1= RULE_NL )+ ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )*
            {
            // InternalLIRAs.g:161:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:162:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:162:4: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:163:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLIRAs.g:179:3: (this_NL_1= RULE_NL )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NL) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLIRAs.g:180:4: this_NL_1= RULE_NL
            	    {
            	    this_NL_1=(Token)match(input,RULE_NL,FOLLOW_6); 

            	    				newLeafNode(this_NL_1, grammarAccess.getPatternAccess().getNLTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalLIRAs.g:185:3: ( (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? ) | (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ ) | (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ ) )*
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt20=1;
                    }
                    break;
                case 16:
                    {
                    alt20=2;
                    }
                    break;
                case 17:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalLIRAs.g:186:4: (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? )
            	    {
            	    // InternalLIRAs.g:186:4: (otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )? )
            	    // InternalLIRAs.g:187:5: otherlv_2= 'agents:' (this_NL_3= RULE_NL )+ (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )? (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )?
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0());
            	    				
            	    // InternalLIRAs.g:191:5: (this_NL_3= RULE_NL )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_NL) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalLIRAs.g:192:6: this_NL_3= RULE_NL
            	    	    {
            	    	    this_NL_3=(Token)match(input,RULE_NL,FOLLOW_7); 

            	    	    						newLeafNode(this_NL_3, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalLIRAs.g:197:5: (otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+ )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==13) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalLIRAs.g:198:6: otherlv_4= 'Humans:' ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )? (this_NL_8= RULE_NL )+
            	            {
            	            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0());
            	            					
            	            // InternalLIRAs.g:202:6: ( ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )* )?
            	            int alt7=2;
            	            int LA7_0 = input.LA(1);

            	            if ( (LA7_0==RULE_ID) ) {
            	                alt7=1;
            	            }
            	            switch (alt7) {
            	                case 1 :
            	                    // InternalLIRAs.g:203:7: ( (lv_human_5_0= ruleHuman ) ) (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )*
            	                    {
            	                    // InternalLIRAs.g:203:7: ( (lv_human_5_0= ruleHuman ) )
            	                    // InternalLIRAs.g:204:8: (lv_human_5_0= ruleHuman )
            	                    {
            	                    // InternalLIRAs.g:204:8: (lv_human_5_0= ruleHuman )
            	                    // InternalLIRAs.g:205:9: lv_human_5_0= ruleHuman
            	                    {

            	                    									newCompositeNode(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_0_0());
            	                    								
            	                    pushFollow(FOLLOW_8);
            	                    lv_human_5_0=ruleHuman();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPatternRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"human",
            	                    										lv_human_5_0,
            	                    										"it.polimi.LIRAs.Human");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }

            	                    // InternalLIRAs.g:222:7: (otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) ) )*
            	                    loop6:
            	                    do {
            	                        int alt6=2;
            	                        int LA6_0 = input.LA(1);

            	                        if ( (LA6_0==14) ) {
            	                            alt6=1;
            	                        }


            	                        switch (alt6) {
            	                    	case 1 :
            	                    	    // InternalLIRAs.g:223:8: otherlv_6= ',' ( (lv_human_7_0= ruleHuman ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

            	                    	    								newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getCommaKeyword_2_0_2_1_1_0());
            	                    	    							
            	                    	    // InternalLIRAs.g:227:8: ( (lv_human_7_0= ruleHuman ) )
            	                    	    // InternalLIRAs.g:228:9: (lv_human_7_0= ruleHuman )
            	                    	    {
            	                    	    // InternalLIRAs.g:228:9: (lv_human_7_0= ruleHuman )
            	                    	    // InternalLIRAs.g:229:10: lv_human_7_0= ruleHuman
            	                    	    {

            	                    	    										newCompositeNode(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_1_1_0());
            	                    	    									
            	                    	    pushFollow(FOLLOW_8);
            	                    	    lv_human_7_0=ruleHuman();

            	                    	    state._fsp--;


            	                    	    										if (current==null) {
            	                    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	                    	    										}
            	                    	    										add(
            	                    	    											current,
            	                    	    											"human",
            	                    	    											lv_human_7_0,
            	                    	    											"it.polimi.LIRAs.Human");
            	                    	    										afterParserOrEnumRuleCall();
            	                    	    									

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop6;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            // InternalLIRAs.g:248:6: (this_NL_8= RULE_NL )+
            	            int cnt8=0;
            	            loop8:
            	            do {
            	                int alt8=2;
            	                int LA8_0 = input.LA(1);

            	                if ( (LA8_0==RULE_NL) ) {
            	                    alt8=1;
            	                }


            	                switch (alt8) {
            	            	case 1 :
            	            	    // InternalLIRAs.g:249:7: this_NL_8= RULE_NL
            	            	    {
            	            	    this_NL_8=(Token)match(input,RULE_NL,FOLLOW_10); 

            	            	    							newLeafNode(this_NL_8, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2());
            	            	    						

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt8 >= 1 ) break loop8;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(8, input);
            	                        throw eee;
            	                }
            	                cnt8++;
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // InternalLIRAs.g:255:5: (otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+ )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==15) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalLIRAs.g:256:6: otherlv_9= 'Robots:' ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )? (this_NL_13= RULE_NL )+
            	            {
            	            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	            						newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0());
            	            					
            	            // InternalLIRAs.g:260:6: ( ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )* )?
            	            int alt11=2;
            	            int LA11_0 = input.LA(1);

            	            if ( (LA11_0==RULE_ID) ) {
            	                alt11=1;
            	            }
            	            switch (alt11) {
            	                case 1 :
            	                    // InternalLIRAs.g:261:7: ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )*
            	                    {
            	                    // InternalLIRAs.g:261:7: ( (lv_robot_10_0= ruleRobot ) )
            	                    // InternalLIRAs.g:262:8: (lv_robot_10_0= ruleRobot )
            	                    {
            	                    // InternalLIRAs.g:262:8: (lv_robot_10_0= ruleRobot )
            	                    // InternalLIRAs.g:263:9: lv_robot_10_0= ruleRobot
            	                    {

            	                    									newCompositeNode(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_0_0());
            	                    								
            	                    pushFollow(FOLLOW_8);
            	                    lv_robot_10_0=ruleRobot();

            	                    state._fsp--;


            	                    									if (current==null) {
            	                    										current = createModelElementForParent(grammarAccess.getPatternRule());
            	                    									}
            	                    									add(
            	                    										current,
            	                    										"robot",
            	                    										lv_robot_10_0,
            	                    										"it.polimi.LIRAs.Robot");
            	                    									afterParserOrEnumRuleCall();
            	                    								

            	                    }


            	                    }

            	                    // InternalLIRAs.g:280:7: (otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) ) )*
            	                    loop10:
            	                    do {
            	                        int alt10=2;
            	                        int LA10_0 = input.LA(1);

            	                        if ( (LA10_0==14) ) {
            	                            alt10=1;
            	                        }


            	                        switch (alt10) {
            	                    	case 1 :
            	                    	    // InternalLIRAs.g:281:8: otherlv_11= ',' ( (lv_robot_12_0= ruleRobot ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,14,FOLLOW_9); 

            	                    	    								newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getCommaKeyword_2_0_3_1_1_0());
            	                    	    							
            	                    	    // InternalLIRAs.g:285:8: ( (lv_robot_12_0= ruleRobot ) )
            	                    	    // InternalLIRAs.g:286:9: (lv_robot_12_0= ruleRobot )
            	                    	    {
            	                    	    // InternalLIRAs.g:286:9: (lv_robot_12_0= ruleRobot )
            	                    	    // InternalLIRAs.g:287:10: lv_robot_12_0= ruleRobot
            	                    	    {

            	                    	    										newCompositeNode(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_1_1_0());
            	                    	    									
            	                    	    pushFollow(FOLLOW_8);
            	                    	    lv_robot_12_0=ruleRobot();

            	                    	    state._fsp--;


            	                    	    										if (current==null) {
            	                    	    											current = createModelElementForParent(grammarAccess.getPatternRule());
            	                    	    										}
            	                    	    										add(
            	                    	    											current,
            	                    	    											"robot",
            	                    	    											lv_robot_12_0,
            	                    	    											"it.polimi.LIRAs.Robot");
            	                    	    										afterParserOrEnumRuleCall();
            	                    	    									

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop10;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            // InternalLIRAs.g:306:6: (this_NL_13= RULE_NL )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==RULE_NL) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalLIRAs.g:307:7: this_NL_13= RULE_NL
            	            	    {
            	            	    this_NL_13=(Token)match(input,RULE_NL,FOLLOW_6); 

            	            	    							newLeafNode(this_NL_13, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2());
            	            	    						

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt12 >= 1 ) break loop12;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(12, input);
            	                        throw eee;
            	                }
            	                cnt12++;
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLIRAs.g:315:4: (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ )
            	    {
            	    // InternalLIRAs.g:315:4: (otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+ )
            	    // InternalLIRAs.g:316:5: otherlv_14= 'locations:' ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )? (this_NL_18= RULE_NL )+
            	    {
            	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_14, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0());
            	    				
            	    // InternalLIRAs.g:320:5: ( ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )* )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_ID) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalLIRAs.g:321:6: ( (lv_locations_15_0= ruleLocation ) ) (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )*
            	            {
            	            // InternalLIRAs.g:321:6: ( (lv_locations_15_0= ruleLocation ) )
            	            // InternalLIRAs.g:322:7: (lv_locations_15_0= ruleLocation )
            	            {
            	            // InternalLIRAs.g:322:7: (lv_locations_15_0= ruleLocation )
            	            // InternalLIRAs.g:323:8: lv_locations_15_0= ruleLocation
            	            {

            	            								newCompositeNode(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_0_0());
            	            							
            	            pushFollow(FOLLOW_8);
            	            lv_locations_15_0=ruleLocation();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPatternRule());
            	            								}
            	            								add(
            	            									current,
            	            									"locations",
            	            									lv_locations_15_0,
            	            									"it.polimi.LIRAs.Location");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalLIRAs.g:340:6: (otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) ) )*
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==14) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // InternalLIRAs.g:341:7: otherlv_16= ',' ( (lv_locations_17_0= ruleLocation ) )
            	            	    {
            	            	    otherlv_16=(Token)match(input,14,FOLLOW_9); 

            	            	    							newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_1_0());
            	            	    						
            	            	    // InternalLIRAs.g:345:7: ( (lv_locations_17_0= ruleLocation ) )
            	            	    // InternalLIRAs.g:346:8: (lv_locations_17_0= ruleLocation )
            	            	    {
            	            	    // InternalLIRAs.g:346:8: (lv_locations_17_0= ruleLocation )
            	            	    // InternalLIRAs.g:347:9: lv_locations_17_0= ruleLocation
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_1_1_0());
            	            	    								
            	            	    pushFollow(FOLLOW_8);
            	            	    lv_locations_17_0=ruleLocation();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getPatternRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"locations",
            	            	    										lv_locations_17_0,
            	            	    										"it.polimi.LIRAs.Location");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop14;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // InternalLIRAs.g:366:5: (this_NL_18= RULE_NL )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_NL) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalLIRAs.g:367:6: this_NL_18= RULE_NL
            	    	    {
            	    	    this_NL_18=(Token)match(input,RULE_NL,FOLLOW_6); 

            	    	    						newLeafNode(this_NL_18, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLIRAs.g:374:4: (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ )
            	    {
            	    // InternalLIRAs.g:374:4: (otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+ )
            	    // InternalLIRAs.g:375:5: otherlv_19= 'resources:' ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )? (this_NL_23= RULE_NL )+
            	    {
            	    otherlv_19=(Token)match(input,17,FOLLOW_3); 

            	    					newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0());
            	    				
            	    // InternalLIRAs.g:379:5: ( ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )* )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_ID) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalLIRAs.g:380:6: ( (lv_resources_20_0= ruleResource ) ) (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )*
            	            {
            	            // InternalLIRAs.g:380:6: ( (lv_resources_20_0= ruleResource ) )
            	            // InternalLIRAs.g:381:7: (lv_resources_20_0= ruleResource )
            	            {
            	            // InternalLIRAs.g:381:7: (lv_resources_20_0= ruleResource )
            	            // InternalLIRAs.g:382:8: lv_resources_20_0= ruleResource
            	            {

            	            								newCompositeNode(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_0_0());
            	            							
            	            pushFollow(FOLLOW_8);
            	            lv_resources_20_0=ruleResource();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getPatternRule());
            	            								}
            	            								add(
            	            									current,
            	            									"resources",
            	            									lv_resources_20_0,
            	            									"it.polimi.LIRAs.Resource");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalLIRAs.g:399:6: (otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) ) )*
            	            loop17:
            	            do {
            	                int alt17=2;
            	                int LA17_0 = input.LA(1);

            	                if ( (LA17_0==14) ) {
            	                    alt17=1;
            	                }


            	                switch (alt17) {
            	            	case 1 :
            	            	    // InternalLIRAs.g:400:7: otherlv_21= ',' ( (lv_resources_22_0= ruleResource ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,14,FOLLOW_9); 

            	            	    							newLeafNode(otherlv_21, grammarAccess.getPatternAccess().getCommaKeyword_2_2_1_1_0());
            	            	    						
            	            	    // InternalLIRAs.g:404:7: ( (lv_resources_22_0= ruleResource ) )
            	            	    // InternalLIRAs.g:405:8: (lv_resources_22_0= ruleResource )
            	            	    {
            	            	    // InternalLIRAs.g:405:8: (lv_resources_22_0= ruleResource )
            	            	    // InternalLIRAs.g:406:9: lv_resources_22_0= ruleResource
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_1_1_0());
            	            	    								
            	            	    pushFollow(FOLLOW_8);
            	            	    lv_resources_22_0=ruleResource();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getPatternRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"resources",
            	            	    										lv_resources_22_0,
            	            	    										"it.polimi.LIRAs.Resource");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop17;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // InternalLIRAs.g:425:5: (this_NL_23= RULE_NL )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_NL) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalLIRAs.g:426:6: this_NL_23= RULE_NL
            	    	    {
            	    	    this_NL_23=(Token)match(input,RULE_NL,FOLLOW_6); 

            	    	    						newLeafNode(this_NL_23, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleSequence"
    // InternalLIRAs.g:437:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalLIRAs.g:437:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalLIRAs.g:438:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalLIRAs.g:444:1: ruleSequence returns [EObject current=null] : ( ( (lv_agent_0_0= ruleAgent ) ) (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )? otherlv_3= ':' (this_NL_4= RULE_NL )+ ( (lv_subSequence_5_0= ruleSubSequence ) )* ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NL_4=null;
        EObject lv_agent_0_0 = null;

        EObject lv_action_2_0 = null;

        EObject lv_subSequence_5_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:450:2: ( ( ( (lv_agent_0_0= ruleAgent ) ) (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )? otherlv_3= ':' (this_NL_4= RULE_NL )+ ( (lv_subSequence_5_0= ruleSubSequence ) )* ) )
            // InternalLIRAs.g:451:2: ( ( (lv_agent_0_0= ruleAgent ) ) (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )? otherlv_3= ':' (this_NL_4= RULE_NL )+ ( (lv_subSequence_5_0= ruleSubSequence ) )* )
            {
            // InternalLIRAs.g:451:2: ( ( (lv_agent_0_0= ruleAgent ) ) (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )? otherlv_3= ':' (this_NL_4= RULE_NL )+ ( (lv_subSequence_5_0= ruleSubSequence ) )* )
            // InternalLIRAs.g:452:3: ( (lv_agent_0_0= ruleAgent ) ) (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )? otherlv_3= ':' (this_NL_4= RULE_NL )+ ( (lv_subSequence_5_0= ruleSubSequence ) )*
            {
            // InternalLIRAs.g:452:3: ( (lv_agent_0_0= ruleAgent ) )
            // InternalLIRAs.g:453:4: (lv_agent_0_0= ruleAgent )
            {
            // InternalLIRAs.g:453:4: (lv_agent_0_0= ruleAgent )
            // InternalLIRAs.g:454:5: lv_agent_0_0= ruleAgent
            {

            					newCompositeNode(grammarAccess.getSequenceAccess().getAgentAgentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_agent_0_0=ruleAgent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceRule());
            					}
            					set(
            						current,
            						"agent",
            						lv_agent_0_0,
            						"it.polimi.LIRAs.Agent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLIRAs.g:471:3: (otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLIRAs.g:472:4: otherlv_1= 'default' ( (lv_action_2_0= ruleAction ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getDefaultKeyword_1_0());
                    			
                    // InternalLIRAs.g:476:4: ( (lv_action_2_0= ruleAction ) )
                    // InternalLIRAs.g:477:5: (lv_action_2_0= ruleAction )
                    {
                    // InternalLIRAs.g:477:5: (lv_action_2_0= ruleAction )
                    // InternalLIRAs.g:478:6: lv_action_2_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getSequenceAccess().getActionActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_action_2_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_2_0,
                    							"it.polimi.LIRAs.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getColonKeyword_2());
            		
            // InternalLIRAs.g:500:3: (this_NL_4= RULE_NL )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_NL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLIRAs.g:501:4: this_NL_4= RULE_NL
            	    {
            	    this_NL_4=(Token)match(input,RULE_NL,FOLLOW_14); 

            	    				newLeafNode(this_NL_4, grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalLIRAs.g:506:3: ( (lv_subSequence_5_0= ruleSubSequence ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLIRAs.g:507:4: (lv_subSequence_5_0= ruleSubSequence )
            	    {
            	    // InternalLIRAs.g:507:4: (lv_subSequence_5_0= ruleSubSequence )
            	    // InternalLIRAs.g:508:5: lv_subSequence_5_0= ruleSubSequence
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceAccess().getSubSequenceSubSequenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_subSequence_5_0=ruleSubSequence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subSequence",
            	    						lv_subSequence_5_0,
            	    						"it.polimi.LIRAs.SubSequence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleSubSequence"
    // InternalLIRAs.g:529:1: entryRuleSubSequence returns [EObject current=null] : iv_ruleSubSequence= ruleSubSequence EOF ;
    public final EObject entryRuleSubSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSequence = null;


        try {
            // InternalLIRAs.g:529:52: (iv_ruleSubSequence= ruleSubSequence EOF )
            // InternalLIRAs.g:530:2: iv_ruleSubSequence= ruleSubSequence EOF
            {
             newCompositeNode(grammarAccess.getSubSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubSequence=ruleSubSequence();

            state._fsp--;

             current =iv_ruleSubSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSequence"


    // $ANTLR start "ruleSubSequence"
    // InternalLIRAs.g:536:1: ruleSubSequence returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )? otherlv_3= ':' ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+ ) ;
    public final EObject ruleSubSequence() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_j_2_0=null;
        Token otherlv_3=null;
        Token this_NL_7=null;
        EObject lv_loop_4_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_conditionalStatement_6_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:542:2: ( ( ( (lv_i_0_0= RULE_INT ) ) (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )? otherlv_3= ':' ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+ ) )
            // InternalLIRAs.g:543:2: ( ( (lv_i_0_0= RULE_INT ) ) (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )? otherlv_3= ':' ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+ )
            {
            // InternalLIRAs.g:543:2: ( ( (lv_i_0_0= RULE_INT ) ) (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )? otherlv_3= ':' ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+ )
            // InternalLIRAs.g:544:3: ( (lv_i_0_0= RULE_INT ) ) (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )? otherlv_3= ':' ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+
            {
            // InternalLIRAs.g:544:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalLIRAs.g:545:4: (lv_i_0_0= RULE_INT )
            {
            // InternalLIRAs.g:545:4: (lv_i_0_0= RULE_INT )
            // InternalLIRAs.g:546:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_i_0_0, grammarAccess.getSubSequenceAccess().getIINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalLIRAs.g:562:3: (otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLIRAs.g:563:4: otherlv_1= '-' ( (lv_j_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubSequenceAccess().getHyphenMinusKeyword_1_0());
                    			
                    // InternalLIRAs.g:567:4: ( (lv_j_2_0= RULE_INT ) )
                    // InternalLIRAs.g:568:5: (lv_j_2_0= RULE_INT )
                    {
                    // InternalLIRAs.g:568:5: (lv_j_2_0= RULE_INT )
                    // InternalLIRAs.g:569:6: lv_j_2_0= RULE_INT
                    {
                    lv_j_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_j_2_0, grammarAccess.getSubSequenceAccess().getJINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubSequenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"j",
                    							lv_j_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSubSequenceAccess().getColonKeyword_2());
            		
            // InternalLIRAs.g:590:3: ( ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_2 = input.LA(2);

                    if ( ((LA27_2>=RULE_NL && LA27_2<=RULE_ID)||LA27_2==25||LA27_2==27||LA27_2==29||(LA27_2>=32 && LA27_2<=34)) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==RULE_NL||LA27_0==23||LA27_0==26||(LA27_0>=30 && LA27_0<=35)||LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLIRAs.g:591:4: ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )? this_NL_7= RULE_NL
            	    {
            	    // InternalLIRAs.g:591:4: ( ( (lv_loop_4_0= ruleLoop ) ) | ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? ) )?
            	    int alt26=3;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==23||LA26_0==26) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==RULE_ID||(LA26_0>=30 && LA26_0<=35)||LA26_0==38) ) {
            	        alt26=2;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalLIRAs.g:592:5: ( (lv_loop_4_0= ruleLoop ) )
            	            {
            	            // InternalLIRAs.g:592:5: ( (lv_loop_4_0= ruleLoop ) )
            	            // InternalLIRAs.g:593:6: (lv_loop_4_0= ruleLoop )
            	            {
            	            // InternalLIRAs.g:593:6: (lv_loop_4_0= ruleLoop )
            	            // InternalLIRAs.g:594:7: lv_loop_4_0= ruleLoop
            	            {

            	            							newCompositeNode(grammarAccess.getSubSequenceAccess().getLoopLoopParserRuleCall_3_0_0_0());
            	            						
            	            pushFollow(FOLLOW_5);
            	            lv_loop_4_0=ruleLoop();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSubSequenceRule());
            	            							}
            	            							add(
            	            								current,
            	            								"loop",
            	            								lv_loop_4_0,
            	            								"it.polimi.LIRAs.Loop");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLIRAs.g:612:5: ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? )
            	            {
            	            // InternalLIRAs.g:612:5: ( ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )? )
            	            // InternalLIRAs.g:613:6: ( (lv_action_5_0= ruleAction ) ) ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )?
            	            {
            	            // InternalLIRAs.g:613:6: ( (lv_action_5_0= ruleAction ) )
            	            // InternalLIRAs.g:614:7: (lv_action_5_0= ruleAction )
            	            {
            	            // InternalLIRAs.g:614:7: (lv_action_5_0= ruleAction )
            	            // InternalLIRAs.g:615:8: lv_action_5_0= ruleAction
            	            {

            	            								newCompositeNode(grammarAccess.getSubSequenceAccess().getActionActionParserRuleCall_3_0_1_0_0());
            	            							
            	            pushFollow(FOLLOW_19);
            	            lv_action_5_0=ruleAction();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getSubSequenceRule());
            	            								}
            	            								add(
            	            									current,
            	            									"action",
            	            									lv_action_5_0,
            	            									"it.polimi.LIRAs.Action");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }

            	            // InternalLIRAs.g:632:6: ( (lv_conditionalStatement_6_0= ruleConditionalStatement ) )?
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==25||LA25_0==27||LA25_0==29) ) {
            	                alt25=1;
            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // InternalLIRAs.g:633:7: (lv_conditionalStatement_6_0= ruleConditionalStatement )
            	                    {
            	                    // InternalLIRAs.g:633:7: (lv_conditionalStatement_6_0= ruleConditionalStatement )
            	                    // InternalLIRAs.g:634:8: lv_conditionalStatement_6_0= ruleConditionalStatement
            	                    {

            	                    								newCompositeNode(grammarAccess.getSubSequenceAccess().getConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0());
            	                    							
            	                    pushFollow(FOLLOW_5);
            	                    lv_conditionalStatement_6_0=ruleConditionalStatement();

            	                    state._fsp--;


            	                    								if (current==null) {
            	                    									current = createModelElementForParent(grammarAccess.getSubSequenceRule());
            	                    								}
            	                    								add(
            	                    									current,
            	                    									"conditionalStatement",
            	                    									lv_conditionalStatement_6_0,
            	                    									"it.polimi.LIRAs.ConditionalStatement");
            	                    								afterParserOrEnumRuleCall();
            	                    							

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    this_NL_7=(Token)match(input,RULE_NL,FOLLOW_20); 

            	    				newLeafNode(this_NL_7, grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubSequence"


    // $ANTLR start "entryRuleConclusion"
    // InternalLIRAs.g:662:1: entryRuleConclusion returns [EObject current=null] : iv_ruleConclusion= ruleConclusion EOF ;
    public final EObject entryRuleConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConclusion = null;


        try {
            // InternalLIRAs.g:662:51: (iv_ruleConclusion= ruleConclusion EOF )
            // InternalLIRAs.g:663:2: iv_ruleConclusion= ruleConclusion EOF
            {
             newCompositeNode(grammarAccess.getConclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConclusion=ruleConclusion();

            state._fsp--;

             current =iv_ruleConclusion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConclusion"


    // $ANTLR start "ruleConclusion"
    // InternalLIRAs.g:669:1: ruleConclusion returns [EObject current=null] : (otherlv_0= 'success:' ( (lv_condition_1_0= ruleCondition ) ) (this_NL_2= RULE_NL )* otherlv_3= 'failure:' ( (lv_condition_4_0= ruleCondition ) ) (this_NL_5= RULE_NL )* ) ;
    public final EObject ruleConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_NL_2=null;
        Token otherlv_3=null;
        Token this_NL_5=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:675:2: ( (otherlv_0= 'success:' ( (lv_condition_1_0= ruleCondition ) ) (this_NL_2= RULE_NL )* otherlv_3= 'failure:' ( (lv_condition_4_0= ruleCondition ) ) (this_NL_5= RULE_NL )* ) )
            // InternalLIRAs.g:676:2: (otherlv_0= 'success:' ( (lv_condition_1_0= ruleCondition ) ) (this_NL_2= RULE_NL )* otherlv_3= 'failure:' ( (lv_condition_4_0= ruleCondition ) ) (this_NL_5= RULE_NL )* )
            {
            // InternalLIRAs.g:676:2: (otherlv_0= 'success:' ( (lv_condition_1_0= ruleCondition ) ) (this_NL_2= RULE_NL )* otherlv_3= 'failure:' ( (lv_condition_4_0= ruleCondition ) ) (this_NL_5= RULE_NL )* )
            // InternalLIRAs.g:677:3: otherlv_0= 'success:' ( (lv_condition_1_0= ruleCondition ) ) (this_NL_2= RULE_NL )* otherlv_3= 'failure:' ( (lv_condition_4_0= ruleCondition ) ) (this_NL_5= RULE_NL )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConclusionAccess().getSuccessKeyword_0());
            		
            // InternalLIRAs.g:681:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalLIRAs.g:682:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalLIRAs.g:682:4: (lv_condition_1_0= ruleCondition )
            // InternalLIRAs.g:683:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConclusionRule());
            					}
            					add(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"it.polimi.LIRAs.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLIRAs.g:700:3: (this_NL_2= RULE_NL )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_NL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLIRAs.g:701:4: this_NL_2= RULE_NL
            	    {
            	    this_NL_2=(Token)match(input,RULE_NL,FOLLOW_22); 

            	    				newLeafNode(this_NL_2, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getConclusionAccess().getFailureKeyword_3());
            		
            // InternalLIRAs.g:710:3: ( (lv_condition_4_0= ruleCondition ) )
            // InternalLIRAs.g:711:4: (lv_condition_4_0= ruleCondition )
            {
            // InternalLIRAs.g:711:4: (lv_condition_4_0= ruleCondition )
            // InternalLIRAs.g:712:5: lv_condition_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_condition_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConclusionRule());
            					}
            					add(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"it.polimi.LIRAs.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLIRAs.g:729:3: (this_NL_5= RULE_NL )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_NL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLIRAs.g:730:4: this_NL_5= RULE_NL
            	    {
            	    this_NL_5=(Token)match(input,RULE_NL,FOLLOW_23); 

            	    				newLeafNode(this_NL_5, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConclusion"


    // $ANTLR start "entryRuleLoop"
    // InternalLIRAs.g:739:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalLIRAs.g:739:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalLIRAs.g:740:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalLIRAs.g:746:1: ruleLoop returns [EObject current=null] : ( (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) ) | (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:752:2: ( ( (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) ) | (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) ) ) )
            // InternalLIRAs.g:753:2: ( (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) ) | (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) ) )
            {
            // InternalLIRAs.g:753:2: ( (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) ) | (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            else if ( (LA32_0==26) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalLIRAs.g:754:3: (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )
                    {
                    // InternalLIRAs.g:754:3: (otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )
                    // InternalLIRAs.g:755:4: otherlv_0= 'skip' (otherlv_1= 'all' )? otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getSkipKeyword_0_0());
                    			
                    // InternalLIRAs.g:759:4: (otherlv_1= 'all' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==24) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalLIRAs.g:760:5: otherlv_1= 'all'
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_25); 

                            					newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getAllKeyword_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getIfKeyword_0_2());
                    			
                    // InternalLIRAs.g:769:4: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalLIRAs.g:770:5: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalLIRAs.g:770:5: (lv_condition_3_0= ruleCondition )
                    // InternalLIRAs.g:771:6: lv_condition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:790:3: (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) )
                    {
                    // InternalLIRAs.g:790:3: (otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) )
                    // InternalLIRAs.g:791:4: otherlv_4= 'restart' (otherlv_5= 'all' )? otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getRestartKeyword_1_0());
                    			
                    // InternalLIRAs.g:795:4: (otherlv_5= 'all' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==24) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalLIRAs.g:796:5: otherlv_5= 'all'
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_25); 

                            					newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getAllKeyword_1_1());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getIfKeyword_1_2());
                    			
                    // InternalLIRAs.g:805:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalLIRAs.g:806:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalLIRAs.g:806:5: (lv_condition_7_0= ruleCondition )
                    // InternalLIRAs.g:807:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalLIRAs.g:829:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalLIRAs.g:829:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalLIRAs.g:830:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalLIRAs.g:836:1: ruleConditionalStatement returns [EObject current=null] : ( (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) ) | (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) ) | (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) ) | (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_n_13_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_action_9_0 = null;

        EObject lv_condition_11_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:842:2: ( ( (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) ) | (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) ) | (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) ) | (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) ) ) )
            // InternalLIRAs.g:843:2: ( (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) ) | (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) ) | (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) ) | (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) ) )
            {
            // InternalLIRAs.g:843:2: ( (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) ) | (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) ) | (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) ) | (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) ) )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalLIRAs.g:844:3: (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) )
                    {
                    // InternalLIRAs.g:844:3: (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) )
                    // InternalLIRAs.g:845:4: otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getUntilKeyword_0_0());
                    			
                    // InternalLIRAs.g:849:4: ( (lv_condition_1_0= ruleCondition ) )
                    // InternalLIRAs.g:850:5: (lv_condition_1_0= ruleCondition )
                    {
                    // InternalLIRAs.g:850:5: (lv_condition_1_0= ruleCondition )
                    // InternalLIRAs.g:851:6: lv_condition_1_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_1_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_1_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:870:3: (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) )
                    {
                    // InternalLIRAs.g:870:3: (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) )
                    // InternalLIRAs.g:871:4: otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getIfKeyword_1_0());
                    			
                    // InternalLIRAs.g:875:4: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalLIRAs.g:876:5: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalLIRAs.g:876:5: (lv_condition_3_0= ruleCondition )
                    // InternalLIRAs.g:877:6: lv_condition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getElseKeyword_1_2());
                    			
                    // InternalLIRAs.g:898:4: ( (lv_action_5_0= ruleAction ) )
                    // InternalLIRAs.g:899:5: (lv_action_5_0= ruleAction )
                    {
                    // InternalLIRAs.g:899:5: (lv_action_5_0= ruleAction )
                    // InternalLIRAs.g:900:6: lv_action_5_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_action_5_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_5_0,
                    							"it.polimi.LIRAs.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLIRAs.g:919:3: (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) )
                    {
                    // InternalLIRAs.g:919:3: (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) )
                    // InternalLIRAs.g:920:4: otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionalStatementAccess().getIfKeyword_2_0());
                    			
                    // InternalLIRAs.g:924:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalLIRAs.g:925:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalLIRAs.g:925:5: (lv_condition_7_0= ruleCondition )
                    // InternalLIRAs.g:926:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionalStatementAccess().getElseKeyword_2_2());
                    			
                    // InternalLIRAs.g:947:4: ( (lv_action_9_0= ruleAction ) )
                    // InternalLIRAs.g:948:5: (lv_action_9_0= ruleAction )
                    {
                    // InternalLIRAs.g:948:5: (lv_action_9_0= ruleAction )
                    // InternalLIRAs.g:949:6: lv_action_9_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_action_9_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_9_0,
                    							"it.polimi.LIRAs.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionalStatementAccess().getUntilKeyword_2_4());
                    			
                    // InternalLIRAs.g:970:4: ( (lv_condition_11_0= ruleCondition ) )
                    // InternalLIRAs.g:971:5: (lv_condition_11_0= ruleCondition )
                    {
                    // InternalLIRAs.g:971:5: (lv_condition_11_0= ruleCondition )
                    // InternalLIRAs.g:972:6: lv_condition_11_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_11_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_11_0,
                    							"it.polimi.LIRAs.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLIRAs.g:991:3: (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) )
                    {
                    // InternalLIRAs.g:991:3: (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) )
                    // InternalLIRAs.g:992:4: otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionalStatementAccess().getWaitKeyword_3_0());
                    			
                    // InternalLIRAs.g:996:4: ( (lv_n_13_0= RULE_INT ) )
                    // InternalLIRAs.g:997:5: (lv_n_13_0= RULE_INT )
                    {
                    // InternalLIRAs.g:997:5: (lv_n_13_0= RULE_INT )
                    // InternalLIRAs.g:998:6: lv_n_13_0= RULE_INT
                    {
                    lv_n_13_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_n_13_0, grammarAccess.getConditionalStatementAccess().getNINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionalStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleAction"
    // InternalLIRAs.g:1019:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalLIRAs.g:1019:47: (iv_ruleAction= ruleAction EOF )
            // InternalLIRAs.g:1020:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalLIRAs.g:1026:1: ruleAction returns [EObject current=null] : ( () (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_target_3_0 = null;

        EObject lv_resource_8_0 = null;

        EObject lv_agent_10_0 = null;

        EObject lv_target_12_0 = null;

        EObject lv_agent_15_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:1032:2: ( ( () (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) ) ) )
            // InternalLIRAs.g:1033:2: ( () (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) ) )
            {
            // InternalLIRAs.g:1033:2: ( () (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) ) )
            // InternalLIRAs.g:1034:3: () (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) )
            {
            // InternalLIRAs.g:1034:3: ()
            // InternalLIRAs.g:1035:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalLIRAs.g:1041:3: (otherlv_1= 'stop' | (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) ) | ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) ) | (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? ) | (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt37=1;
                }
                break;
            case 31:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
            case 32:
            case 33:
            case 34:
                {
                alt37=3;
                }
                break;
            case 35:
                {
                alt37=4;
                }
                break;
            case 38:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalLIRAs.g:1042:4: otherlv_1= 'stop'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:1047:4: (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) )
                    {
                    // InternalLIRAs.g:1047:4: (otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) ) )
                    // InternalLIRAs.g:1048:5: otherlv_2= 'moveTo' ( (lv_target_3_0= ruleTarget ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_9); 

                    					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getMoveToKeyword_1_1_0());
                    				
                    // InternalLIRAs.g:1052:5: ( (lv_target_3_0= ruleTarget ) )
                    // InternalLIRAs.g:1053:6: (lv_target_3_0= ruleTarget )
                    {
                    // InternalLIRAs.g:1053:6: (lv_target_3_0= ruleTarget )
                    // InternalLIRAs.g:1054:7: lv_target_3_0= ruleTarget
                    {

                    							newCompositeNode(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_target_3_0=ruleTarget();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionRule());
                    							}
                    							set(
                    								current,
                    								"target",
                    								lv_target_3_0,
                    								"it.polimi.LIRAs.Target");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLIRAs.g:1073:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalLIRAs.g:1073:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) ) )
                    // InternalLIRAs.g:1074:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalLIRAs.g:1074:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?) )
                    // InternalLIRAs.g:1075:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
                    					
                    // InternalLIRAs.g:1078:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?)
                    // InternalLIRAs.g:1079:7: ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+ {...}?
                    {
                    // InternalLIRAs.g:1079:7: ( ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( LA35_0 >= 32 && LA35_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0) ) {
                            alt35=1;
                        }
                        else if ( LA35_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalLIRAs.g:1080:5: ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) )
                    	    {
                    	    // InternalLIRAs.g:1080:5: ({...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) ) )
                    	    // InternalLIRAs.g:1081:6: {...}? => ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0)");
                    	    }
                    	    // InternalLIRAs.g:1081:106: ( ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) ) )
                    	    // InternalLIRAs.g:1082:7: ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0);
                    	    						
                    	    // InternalLIRAs.g:1085:10: ({...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' ) )
                    	    // InternalLIRAs.g:1085:11: {...}? => (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAction", "true");
                    	    }
                    	    // InternalLIRAs.g:1085:20: (otherlv_5= 'fetch' | otherlv_6= 'deliver' | otherlv_7= 'leave' )
                    	    int alt34=3;
                    	    switch ( input.LA(1) ) {
                    	    case 32:
                    	        {
                    	        alt34=1;
                    	        }
                    	        break;
                    	    case 33:
                    	        {
                    	        alt34=2;
                    	        }
                    	        break;
                    	    case 34:
                    	        {
                    	        alt34=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 34, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt34) {
                    	        case 1 :
                    	            // InternalLIRAs.g:1085:21: otherlv_5= 'fetch'
                    	            {
                    	            otherlv_5=(Token)match(input,32,FOLLOW_28); 

                    	            										newLeafNode(otherlv_5, grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0());
                    	            									

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalLIRAs.g:1090:10: otherlv_6= 'deliver'
                    	            {
                    	            otherlv_6=(Token)match(input,33,FOLLOW_28); 

                    	            										newLeafNode(otherlv_6, grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1());
                    	            									

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalLIRAs.g:1095:10: otherlv_7= 'leave'
                    	            {
                    	            otherlv_7=(Token)match(input,34,FOLLOW_28); 

                    	            										newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2());
                    	            									

                    	            }
                    	            break;

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLIRAs.g:1105:5: ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) )
                    	    {
                    	    // InternalLIRAs.g:1105:5: ({...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) ) )
                    	    // InternalLIRAs.g:1106:6: {...}? => ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1)");
                    	    }
                    	    // InternalLIRAs.g:1106:106: ( ({...}? => ( (lv_resource_8_0= ruleResource ) ) ) )
                    	    // InternalLIRAs.g:1107:7: ({...}? => ( (lv_resource_8_0= ruleResource ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1);
                    	    						
                    	    // InternalLIRAs.g:1110:10: ({...}? => ( (lv_resource_8_0= ruleResource ) ) )
                    	    // InternalLIRAs.g:1110:11: {...}? => ( (lv_resource_8_0= ruleResource ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAction", "true");
                    	    }
                    	    // InternalLIRAs.g:1110:20: ( (lv_resource_8_0= ruleResource ) )
                    	    // InternalLIRAs.g:1110:21: (lv_resource_8_0= ruleResource )
                    	    {
                    	    // InternalLIRAs.g:1110:21: (lv_resource_8_0= ruleResource )
                    	    // InternalLIRAs.g:1111:11: lv_resource_8_0= ruleResource
                    	    {

                    	    											newCompositeNode(grammarAccess.getActionAccess().getResourceResourceParserRuleCall_1_2_1_0());
                    	    										
                    	    pushFollow(FOLLOW_28);
                    	    lv_resource_8_0=ruleResource();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getActionRule());
                    	    											}
                    	    											set(
                    	    												current,
                    	    												"resource",
                    	    												lv_resource_8_0,
                    	    												"it.polimi.LIRAs.Resource");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActionAccess().getUnorderedGroup_1_2()) ) {
                        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canLeave(grammarAccess.getActionAccess().getUnorderedGroup_1_2())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
                    					

                    }


                    }
                    break;
                case 4 :
                    // InternalLIRAs.g:1142:4: (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? )
                    {
                    // InternalLIRAs.g:1142:4: (otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )? )
                    // InternalLIRAs.g:1143:5: otherlv_9= 'follow' ( (lv_agent_10_0= ruleAgent ) ) (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )?
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_9); 

                    					newLeafNode(otherlv_9, grammarAccess.getActionAccess().getFollowKeyword_1_3_0());
                    				
                    // InternalLIRAs.g:1147:5: ( (lv_agent_10_0= ruleAgent ) )
                    // InternalLIRAs.g:1148:6: (lv_agent_10_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1148:6: (lv_agent_10_0= ruleAgent )
                    // InternalLIRAs.g:1149:7: lv_agent_10_0= ruleAgent
                    {

                    							newCompositeNode(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_agent_10_0=ruleAgent();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionRule());
                    							}
                    							set(
                    								current,
                    								"agent",
                    								lv_agent_10_0,
                    								"it.polimi.LIRAs.Agent");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalLIRAs.g:1166:5: (otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==36) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalLIRAs.g:1167:6: otherlv_11= '(' ( (lv_target_12_0= ruleTarget ) ) otherlv_13= ')'
                            {
                            otherlv_11=(Token)match(input,36,FOLLOW_9); 

                            						newLeafNode(otherlv_11, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_3_2_0());
                            					
                            // InternalLIRAs.g:1171:6: ( (lv_target_12_0= ruleTarget ) )
                            // InternalLIRAs.g:1172:7: (lv_target_12_0= ruleTarget )
                            {
                            // InternalLIRAs.g:1172:7: (lv_target_12_0= ruleTarget )
                            // InternalLIRAs.g:1173:8: lv_target_12_0= ruleTarget
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_3_2_1_0());
                            							
                            pushFollow(FOLLOW_30);
                            lv_target_12_0=ruleTarget();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"target",
                            									lv_target_12_0,
                            									"it.polimi.LIRAs.Target");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_13=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightParenthesisKeyword_1_3_2_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLIRAs.g:1197:4: (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) )
                    {
                    // InternalLIRAs.g:1197:4: (otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) ) )
                    // InternalLIRAs.g:1198:5: otherlv_14= 'receiveFrom' ( (lv_agent_15_0= ruleAgent ) )
                    {
                    otherlv_14=(Token)match(input,38,FOLLOW_9); 

                    					newLeafNode(otherlv_14, grammarAccess.getActionAccess().getReceiveFromKeyword_1_4_0());
                    				
                    // InternalLIRAs.g:1202:5: ( (lv_agent_15_0= ruleAgent ) )
                    // InternalLIRAs.g:1203:6: (lv_agent_15_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1203:6: (lv_agent_15_0= ruleAgent )
                    // InternalLIRAs.g:1204:7: lv_agent_15_0= ruleAgent
                    {

                    							newCompositeNode(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_4_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_agent_15_0=ruleAgent();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionRule());
                    							}
                    							set(
                    								current,
                    								"agent",
                    								lv_agent_15_0,
                    								"it.polimi.LIRAs.Agent");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalLIRAs.g:1227:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalLIRAs.g:1227:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalLIRAs.g:1228:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalLIRAs.g:1234:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) ) ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_atomicPredicate_0_0 = null;

        EObject lv_atomicPredicate_2_0 = null;

        EObject lv_atomicPredicate_5_0 = null;

        EObject lv_atomicPredicate_7_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:1240:2: ( ( ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) ) ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )* ) )
            // InternalLIRAs.g:1241:2: ( ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) ) ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )* )
            {
            // InternalLIRAs.g:1241:2: ( ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) ) ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )* )
            // InternalLIRAs.g:1242:3: ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) ) ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )*
            {
            // InternalLIRAs.g:1242:3: ( ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) ) | (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=42 && LA38_0<=48)||LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==39) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalLIRAs.g:1243:4: ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) )
                    {
                    // InternalLIRAs.g:1243:4: ( (lv_atomicPredicate_0_0= ruleAtomicPredicate ) )
                    // InternalLIRAs.g:1244:5: (lv_atomicPredicate_0_0= ruleAtomicPredicate )
                    {
                    // InternalLIRAs.g:1244:5: (lv_atomicPredicate_0_0= ruleAtomicPredicate )
                    // InternalLIRAs.g:1245:6: lv_atomicPredicate_0_0= ruleAtomicPredicate
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_atomicPredicate_0_0=ruleAtomicPredicate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						add(
                    							current,
                    							"atomicPredicate",
                    							lv_atomicPredicate_0_0,
                    							"it.polimi.LIRAs.AtomicPredicate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:1263:4: (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) )
                    {
                    // InternalLIRAs.g:1263:4: (otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) ) )
                    // InternalLIRAs.g:1264:5: otherlv_1= '!' ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_32); 

                    					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getExclamationMarkKeyword_0_1_0());
                    				
                    // InternalLIRAs.g:1268:5: ( (lv_atomicPredicate_2_0= ruleAtomicPredicate ) )
                    // InternalLIRAs.g:1269:6: (lv_atomicPredicate_2_0= ruleAtomicPredicate )
                    {
                    // InternalLIRAs.g:1269:6: (lv_atomicPredicate_2_0= ruleAtomicPredicate )
                    // InternalLIRAs.g:1270:7: lv_atomicPredicate_2_0= ruleAtomicPredicate
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    lv_atomicPredicate_2_0=ruleAtomicPredicate();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							add(
                    								current,
                    								"atomicPredicate",
                    								lv_atomicPredicate_2_0,
                    								"it.polimi.LIRAs.AtomicPredicate");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalLIRAs.g:1289:3: ( (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=40 && LA41_0<=41)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLIRAs.g:1290:4: (otherlv_3= '&&' | otherlv_4= '||' ) ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) )
            	    {
            	    // InternalLIRAs.g:1290:4: (otherlv_3= '&&' | otherlv_4= '||' )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==40) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==41) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalLIRAs.g:1291:5: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,40,FOLLOW_21); 

            	            					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLIRAs.g:1296:5: otherlv_4= '||'
            	            {
            	            otherlv_4=(Token)match(input,41,FOLLOW_21); 

            	            					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getVerticalLineVerticalLineKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalLIRAs.g:1301:4: ( ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) ) | (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( ((LA40_0>=42 && LA40_0<=48)||LA40_0==55) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==39) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalLIRAs.g:1302:5: ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) )
            	            {
            	            // InternalLIRAs.g:1302:5: ( (lv_atomicPredicate_5_0= ruleAtomicPredicate ) )
            	            // InternalLIRAs.g:1303:6: (lv_atomicPredicate_5_0= ruleAtomicPredicate )
            	            {
            	            // InternalLIRAs.g:1303:6: (lv_atomicPredicate_5_0= ruleAtomicPredicate )
            	            // InternalLIRAs.g:1304:7: lv_atomicPredicate_5_0= ruleAtomicPredicate
            	            {

            	            							newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_31);
            	            lv_atomicPredicate_5_0=ruleAtomicPredicate();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getConditionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"atomicPredicate",
            	            								lv_atomicPredicate_5_0,
            	            								"it.polimi.LIRAs.AtomicPredicate");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLIRAs.g:1322:5: (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) )
            	            {
            	            // InternalLIRAs.g:1322:5: (otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) ) )
            	            // InternalLIRAs.g:1323:6: otherlv_6= '!' ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) )
            	            {
            	            otherlv_6=(Token)match(input,39,FOLLOW_32); 

            	            						newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getExclamationMarkKeyword_1_1_1_0());
            	            					
            	            // InternalLIRAs.g:1327:6: ( (lv_atomicPredicate_7_0= ruleAtomicPredicate ) )
            	            // InternalLIRAs.g:1328:7: (lv_atomicPredicate_7_0= ruleAtomicPredicate )
            	            {
            	            // InternalLIRAs.g:1328:7: (lv_atomicPredicate_7_0= ruleAtomicPredicate )
            	            // InternalLIRAs.g:1329:8: lv_atomicPredicate_7_0= ruleAtomicPredicate
            	            {

            	            								newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0());
            	            							
            	            pushFollow(FOLLOW_31);
            	            lv_atomicPredicate_7_0=ruleAtomicPredicate();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getConditionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"atomicPredicate",
            	            									lv_atomicPredicate_7_0,
            	            									"it.polimi.LIRAs.AtomicPredicate");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAtomicPredicate"
    // InternalLIRAs.g:1353:1: entryRuleAtomicPredicate returns [EObject current=null] : iv_ruleAtomicPredicate= ruleAtomicPredicate EOF ;
    public final EObject entryRuleAtomicPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicPredicate = null;


        try {
            // InternalLIRAs.g:1353:56: (iv_ruleAtomicPredicate= ruleAtomicPredicate EOF )
            // InternalLIRAs.g:1354:2: iv_ruleAtomicPredicate= ruleAtomicPredicate EOF
            {
             newCompositeNode(grammarAccess.getAtomicPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicPredicate=ruleAtomicPredicate();

            state._fsp--;

             current =iv_ruleAtomicPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicPredicate"


    // $ANTLR start "ruleAtomicPredicate"
    // InternalLIRAs.g:1360:1: ruleAtomicPredicate returns [EObject current=null] : ( ( () otherlv_1= 'tired' ) | (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) | (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' ) | (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' ) | (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' ) | (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' ) | ( (lv_relation_26_0= ruleRelation ) ) ) ;
    public final EObject ruleAtomicPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_agent_8_0 = null;

        EObject lv_location_10_0 = null;

        EObject lv_agent_14_0 = null;

        EObject lv_resource_16_0 = null;

        EObject lv_agent_20_0 = null;

        EObject lv_agent_24_0 = null;

        EObject lv_relation_26_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:1366:2: ( ( ( () otherlv_1= 'tired' ) | (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) | (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' ) | (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' ) | (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' ) | (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' ) | ( (lv_relation_26_0= ruleRelation ) ) ) )
            // InternalLIRAs.g:1367:2: ( ( () otherlv_1= 'tired' ) | (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) | (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' ) | (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' ) | (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' ) | (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' ) | ( (lv_relation_26_0= ruleRelation ) ) )
            {
            // InternalLIRAs.g:1367:2: ( ( () otherlv_1= 'tired' ) | (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) | (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' ) | (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' ) | (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' ) | (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' ) | ( (lv_relation_26_0= ruleRelation ) ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt42=1;
                }
                break;
            case 43:
                {
                alt42=2;
                }
                break;
            case 44:
                {
                alt42=3;
                }
                break;
            case 45:
                {
                alt42=4;
                }
                break;
            case 46:
                {
                alt42=5;
                }
                break;
            case 47:
                {
                alt42=6;
                }
                break;
            case 48:
            case 55:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalLIRAs.g:1368:3: ( () otherlv_1= 'tired' )
                    {
                    // InternalLIRAs.g:1368:3: ( () otherlv_1= 'tired' )
                    // InternalLIRAs.g:1369:4: () otherlv_1= 'tired'
                    {
                    // InternalLIRAs.g:1369:4: ()
                    // InternalLIRAs.g:1370:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicPredicateAccess().getAtomicPredicateAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicPredicateAccess().getTiredKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:1382:3: (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
                    {
                    // InternalLIRAs.g:1382:3: (otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
                    // InternalLIRAs.g:1383:4: otherlv_2= 'time' otherlv_3= '(' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicPredicateAccess().getTimeKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalLIRAs.g:1391:4: ( (lv_n_4_0= RULE_INT ) )
                    // InternalLIRAs.g:1392:5: (lv_n_4_0= RULE_INT )
                    {
                    // InternalLIRAs.g:1392:5: (lv_n_4_0= RULE_INT )
                    // InternalLIRAs.g:1393:6: lv_n_4_0= RULE_INT
                    {
                    lv_n_4_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    						newLeafNode(lv_n_4_0, grammarAccess.getAtomicPredicateAccess().getNINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicPredicateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLIRAs.g:1415:3: (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' )
                    {
                    // InternalLIRAs.g:1415:3: (otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')' )
                    // InternalLIRAs.g:1416:4: otherlv_6= 'position' otherlv_7= '(' ( (lv_agent_8_0= ruleAgent ) ) otherlv_9= ',' ( (lv_location_10_0= ruleLocation ) ) otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtomicPredicateAccess().getPositionKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalLIRAs.g:1424:4: ( (lv_agent_8_0= ruleAgent ) )
                    // InternalLIRAs.g:1425:5: (lv_agent_8_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1425:5: (lv_agent_8_0= ruleAgent )
                    // InternalLIRAs.g:1426:6: lv_agent_8_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_agent_8_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_8_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicPredicateAccess().getCommaKeyword_2_3());
                    			
                    // InternalLIRAs.g:1447:4: ( (lv_location_10_0= ruleLocation ) )
                    // InternalLIRAs.g:1448:5: (lv_location_10_0= ruleLocation )
                    {
                    // InternalLIRAs.g:1448:5: (lv_location_10_0= ruleLocation )
                    // InternalLIRAs.g:1449:6: lv_location_10_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getLocationLocationParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_location_10_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_10_0,
                    							"it.polimi.LIRAs.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLIRAs.g:1472:3: (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' )
                    {
                    // InternalLIRAs.g:1472:3: (otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')' )
                    // InternalLIRAs.g:1473:4: otherlv_12= 'possess' otherlv_13= '(' ( (lv_agent_14_0= ruleAgent ) ) otherlv_15= ',' ( (lv_resource_16_0= ruleResource ) ) otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getAtomicPredicateAccess().getPossessKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalLIRAs.g:1481:4: ( (lv_agent_14_0= ruleAgent ) )
                    // InternalLIRAs.g:1482:5: (lv_agent_14_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1482:5: (lv_agent_14_0= ruleAgent )
                    // InternalLIRAs.g:1483:6: lv_agent_14_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_agent_14_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_14_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getAtomicPredicateAccess().getCommaKeyword_3_3());
                    			
                    // InternalLIRAs.g:1504:4: ( (lv_resource_16_0= ruleResource ) )
                    // InternalLIRAs.g:1505:5: (lv_resource_16_0= ruleResource )
                    {
                    // InternalLIRAs.g:1505:5: (lv_resource_16_0= ruleResource )
                    // InternalLIRAs.g:1506:6: lv_resource_16_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getResourceResourceParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_resource_16_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"resource",
                    							lv_resource_16_0,
                    							"it.polimi.LIRAs.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_3_5());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLIRAs.g:1529:3: (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' )
                    {
                    // InternalLIRAs.g:1529:3: (otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')' )
                    // InternalLIRAs.g:1530:4: otherlv_18= 'busy' otherlv_19= '(' ( (lv_agent_20_0= ruleAgent ) ) otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getAtomicPredicateAccess().getBusyKeyword_4_0());
                    			
                    otherlv_19=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLIRAs.g:1538:4: ( (lv_agent_20_0= ruleAgent ) )
                    // InternalLIRAs.g:1539:5: (lv_agent_20_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1539:5: (lv_agent_20_0= ruleAgent )
                    // InternalLIRAs.g:1540:6: lv_agent_20_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_agent_20_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_20_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLIRAs.g:1563:3: (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' )
                    {
                    // InternalLIRAs.g:1563:3: (otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')' )
                    // InternalLIRAs.g:1564:4: otherlv_22= 'still' otherlv_23= '(' ( (lv_agent_24_0= ruleAgent ) ) otherlv_25= ')'
                    {
                    otherlv_22=(Token)match(input,47,FOLLOW_33); 

                    				newLeafNode(otherlv_22, grammarAccess.getAtomicPredicateAccess().getStillKeyword_5_0());
                    			
                    otherlv_23=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_23, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLIRAs.g:1572:4: ( (lv_agent_24_0= ruleAgent ) )
                    // InternalLIRAs.g:1573:5: (lv_agent_24_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1573:5: (lv_agent_24_0= ruleAgent )
                    // InternalLIRAs.g:1574:6: lv_agent_24_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_agent_24_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    						}
                    						set(
                    							current,
                    							"agent",
                    							lv_agent_24_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLIRAs.g:1597:3: ( (lv_relation_26_0= ruleRelation ) )
                    {
                    // InternalLIRAs.g:1597:3: ( (lv_relation_26_0= ruleRelation ) )
                    // InternalLIRAs.g:1598:4: (lv_relation_26_0= ruleRelation )
                    {
                    // InternalLIRAs.g:1598:4: (lv_relation_26_0= ruleRelation )
                    // InternalLIRAs.g:1599:5: lv_relation_26_0= ruleRelation
                    {

                    					newCompositeNode(grammarAccess.getAtomicPredicateAccess().getRelationRelationParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_relation_26_0=ruleRelation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
                    					}
                    					set(
                    						current,
                    						"relation",
                    						lv_relation_26_0,
                    						"it.polimi.LIRAs.Relation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicPredicate"


    // $ANTLR start "entryRuleRelation"
    // InternalLIRAs.g:1620:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalLIRAs.g:1620:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalLIRAs.g:1621:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalLIRAs.g:1627:1: ruleRelation returns [EObject current=null] : ( (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) ) | (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_th_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_th_23_0=null;
        EObject lv_agent_2_0 = null;

        EObject lv_agent_4_0 = null;

        EObject lv_agent_15_0 = null;



        	enterRule();

        try {
            // InternalLIRAs.g:1633:2: ( ( (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) ) | (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) ) ) )
            // InternalLIRAs.g:1634:2: ( (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) ) | (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) ) )
            {
            // InternalLIRAs.g:1634:2: ( (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) ) | (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            else if ( (LA45_0==55) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalLIRAs.g:1635:3: (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) )
                    {
                    // InternalLIRAs.g:1635:3: (otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) ) )
                    // InternalLIRAs.g:1636:4: otherlv_0= 'dist' otherlv_1= '(' ( (lv_agent_2_0= ruleAgent ) ) otherlv_3= ',' ( (lv_agent_4_0= ruleAgent ) ) otherlv_5= ')' (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' ) ( (lv_th_12_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getDistKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalLIRAs.g:1644:4: ( (lv_agent_2_0= ruleAgent ) )
                    // InternalLIRAs.g:1645:5: (lv_agent_2_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1645:5: (lv_agent_2_0= ruleAgent )
                    // InternalLIRAs.g:1646:6: lv_agent_2_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_agent_2_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						add(
                    							current,
                    							"agent",
                    							lv_agent_2_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getCommaKeyword_0_3());
                    			
                    // InternalLIRAs.g:1667:4: ( (lv_agent_4_0= ruleAgent ) )
                    // InternalLIRAs.g:1668:5: (lv_agent_4_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1668:5: (lv_agent_4_0= ruleAgent )
                    // InternalLIRAs.g:1669:6: lv_agent_4_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_agent_4_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						add(
                    							current,
                    							"agent",
                    							lv_agent_4_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightParenthesisKeyword_0_5());
                    			
                    // InternalLIRAs.g:1690:4: (otherlv_6= '>' | otherlv_7= '<' | otherlv_8= '>=' | otherlv_9= '<=' | otherlv_10= '==' | otherlv_11= '!=' )
                    int alt43=6;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt43=1;
                        }
                        break;
                    case 50:
                        {
                        alt43=2;
                        }
                        break;
                    case 51:
                        {
                        alt43=3;
                        }
                        break;
                    case 52:
                        {
                        alt43=4;
                        }
                        break;
                    case 53:
                        {
                        alt43=5;
                        }
                        break;
                    case 54:
                        {
                        alt43=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // InternalLIRAs.g:1691:5: otherlv_6= '>'
                            {
                            otherlv_6=(Token)match(input,49,FOLLOW_17); 

                            					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_0_6_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLIRAs.g:1696:5: otherlv_7= '<'
                            {
                            otherlv_7=(Token)match(input,50,FOLLOW_17); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLessThanSignKeyword_0_6_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalLIRAs.g:1701:5: otherlv_8= '>='
                            {
                            otherlv_8=(Token)match(input,51,FOLLOW_17); 

                            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_0_6_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalLIRAs.g:1706:5: otherlv_9= '<='
                            {
                            otherlv_9=(Token)match(input,52,FOLLOW_17); 

                            					newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_0_6_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalLIRAs.g:1711:5: otherlv_10= '=='
                            {
                            otherlv_10=(Token)match(input,53,FOLLOW_17); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_0_6_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalLIRAs.g:1716:5: otherlv_11= '!='
                            {
                            otherlv_11=(Token)match(input,54,FOLLOW_17); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_0_6_5());
                            				

                            }
                            break;

                    }

                    // InternalLIRAs.g:1721:4: ( (lv_th_12_0= RULE_INT ) )
                    // InternalLIRAs.g:1722:5: (lv_th_12_0= RULE_INT )
                    {
                    // InternalLIRAs.g:1722:5: (lv_th_12_0= RULE_INT )
                    // InternalLIRAs.g:1723:6: lv_th_12_0= RULE_INT
                    {
                    lv_th_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_th_12_0, grammarAccess.getRelationAccess().getThINTTerminalRuleCall_0_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"th",
                    							lv_th_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLIRAs.g:1741:3: (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) )
                    {
                    // InternalLIRAs.g:1741:3: (otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) ) )
                    // InternalLIRAs.g:1742:4: otherlv_13= 'soc' otherlv_14= '(' ( (lv_agent_15_0= ruleAgent ) ) otherlv_16= ')' (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' ) ( (lv_th_23_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,55,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationAccess().getSocKeyword_1_0());
                    			
                    otherlv_14=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalLIRAs.g:1750:4: ( (lv_agent_15_0= ruleAgent ) )
                    // InternalLIRAs.g:1751:5: (lv_agent_15_0= ruleAgent )
                    {
                    // InternalLIRAs.g:1751:5: (lv_agent_15_0= ruleAgent )
                    // InternalLIRAs.g:1752:6: lv_agent_15_0= ruleAgent
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_agent_15_0=ruleAgent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						add(
                    							current,
                    							"agent",
                    							lv_agent_15_0,
                    							"it.polimi.LIRAs.Agent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_16, grammarAccess.getRelationAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalLIRAs.g:1773:4: (otherlv_17= '>' | otherlv_18= '<' | otherlv_19= '>=' | otherlv_20= '<=' | otherlv_21= '==' | otherlv_22= '!=' )
                    int alt44=6;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt44=1;
                        }
                        break;
                    case 50:
                        {
                        alt44=2;
                        }
                        break;
                    case 51:
                        {
                        alt44=3;
                        }
                        break;
                    case 52:
                        {
                        alt44=4;
                        }
                        break;
                    case 53:
                        {
                        alt44=5;
                        }
                        break;
                    case 54:
                        {
                        alt44=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // InternalLIRAs.g:1774:5: otherlv_17= '>'
                            {
                            otherlv_17=(Token)match(input,49,FOLLOW_17); 

                            					newLeafNode(otherlv_17, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLIRAs.g:1779:5: otherlv_18= '<'
                            {
                            otherlv_18=(Token)match(input,50,FOLLOW_17); 

                            					newLeafNode(otherlv_18, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_4_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalLIRAs.g:1784:5: otherlv_19= '>='
                            {
                            otherlv_19=(Token)match(input,51,FOLLOW_17); 

                            					newLeafNode(otherlv_19, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_4_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalLIRAs.g:1789:5: otherlv_20= '<='
                            {
                            otherlv_20=(Token)match(input,52,FOLLOW_17); 

                            					newLeafNode(otherlv_20, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_4_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalLIRAs.g:1794:5: otherlv_21= '=='
                            {
                            otherlv_21=(Token)match(input,53,FOLLOW_17); 

                            					newLeafNode(otherlv_21, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_4_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalLIRAs.g:1799:5: otherlv_22= '!='
                            {
                            otherlv_22=(Token)match(input,54,FOLLOW_17); 

                            					newLeafNode(otherlv_22, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_4_5());
                            				

                            }
                            break;

                    }

                    // InternalLIRAs.g:1804:4: ( (lv_th_23_0= RULE_INT ) )
                    // InternalLIRAs.g:1805:5: (lv_th_23_0= RULE_INT )
                    {
                    // InternalLIRAs.g:1805:5: (lv_th_23_0= RULE_INT )
                    // InternalLIRAs.g:1806:6: lv_th_23_0= RULE_INT
                    {
                    lv_th_23_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_th_23_0, grammarAccess.getRelationAccess().getThINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"th",
                    							lv_th_23_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleTarget"
    // InternalLIRAs.g:1827:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalLIRAs.g:1827:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalLIRAs.g:1828:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalLIRAs.g:1834:1: ruleTarget returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:1840:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:1841:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:1841:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:1842:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:1842:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:1843:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTargetRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleAgent"
    // InternalLIRAs.g:1862:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalLIRAs.g:1862:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalLIRAs.g:1863:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalLIRAs.g:1869:1: ruleAgent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:1875:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:1876:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:1876:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:1877:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:1877:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:1878:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAgentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleHuman"
    // InternalLIRAs.g:1897:1: entryRuleHuman returns [EObject current=null] : iv_ruleHuman= ruleHuman EOF ;
    public final EObject entryRuleHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHuman = null;


        try {
            // InternalLIRAs.g:1897:46: (iv_ruleHuman= ruleHuman EOF )
            // InternalLIRAs.g:1898:2: iv_ruleHuman= ruleHuman EOF
            {
             newCompositeNode(grammarAccess.getHumanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHuman=ruleHuman();

            state._fsp--;

             current =iv_ruleHuman; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHuman"


    // $ANTLR start "ruleHuman"
    // InternalLIRAs.g:1904:1: ruleHuman returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleHuman() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:1910:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:1911:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:1911:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:1912:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:1912:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:1913:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getHumanRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHuman"


    // $ANTLR start "entryRuleRobot"
    // InternalLIRAs.g:1932:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalLIRAs.g:1932:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalLIRAs.g:1933:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalLIRAs.g:1939:1: ruleRobot returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:1945:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:1946:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:1946:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:1947:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:1947:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:1948:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRobotRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleLocation"
    // InternalLIRAs.g:1967:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalLIRAs.g:1967:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalLIRAs.g:1968:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalLIRAs.g:1974:1: ruleLocation returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:1980:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:1981:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:1981:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:1982:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:1982:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:1983:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLocationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleResource"
    // InternalLIRAs.g:2002:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalLIRAs.g:2002:49: (iv_ruleResource= ruleResource EOF )
            // InternalLIRAs.g:2003:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalLIRAs.g:2009:1: ruleResource returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLIRAs.g:2015:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLIRAs.g:2016:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLIRAs.g:2016:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLIRAs.g:2017:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLIRAs.g:2017:3: (lv_name_0_0= RULE_ID )
            // InternalLIRAs.g:2018:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getResourceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"

    // Delegated rules


    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\u00dd\uffff";
    static final String dfa_2s = "\50\uffff\1\116\1\uffff\4\116\41\uffff\3\116\131\uffff\1\116\61\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\47\1\uffff\1\34\7\44\1\52\2\47\1\5\1\6\6\5\1\34\7\44\1\34\7\44\1\52\1\4\1\5\4\4\2\5\1\45\2\16\2\45\1\16\1\45\1\6\6\5\1\6\6\5\1\34\7\44\2\uffff\3\4\1\34\2\5\2\34\1\5\1\61\1\45\2\16\2\45\1\16\2\45\2\16\2\45\1\16\1\45\1\6\7\5\3\45\6\6\1\34\2\5\2\34\1\5\1\61\1\34\2\5\2\34\1\5\1\61\1\45\2\16\2\45\1\16\2\45\2\34\1\61\1\34\3\45\6\6\3\45\6\6\1\34\2\5\2\34\1\5\1\61\1\4\6\6\2\34\1\61\3\34\1\61\1\34\3\45\6\6\1\34\14\6\2\34\1\61\3\34\6\6\1\34";
    static final String dfa_4s = "\1\35\1\uffff\1\67\1\uffff\1\51\7\44\3\67\1\46\1\6\6\5\1\51\7\44\1\51\7\44\1\67\1\33\1\5\4\42\2\5\1\45\2\16\2\45\1\16\1\45\1\6\6\5\1\6\6\5\1\51\7\44\2\uffff\1\33\1\44\1\33\1\51\2\5\2\51\1\5\1\66\1\45\2\16\2\45\1\16\2\45\2\16\2\45\1\16\1\45\1\6\7\5\3\45\6\6\1\51\2\5\2\51\1\5\1\66\1\51\2\5\2\51\1\5\1\66\1\45\2\16\2\45\1\16\2\45\2\51\1\66\1\51\3\45\6\6\3\45\6\6\1\51\2\5\2\51\1\5\1\66\1\33\6\6\2\51\1\66\3\51\1\66\1\51\3\45\6\6\1\51\14\6\2\51\1\66\3\51\6\6\1\51";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\111\uffff\1\3\1\2\u008e\uffff";
    static final String dfa_6s = "\u00dd\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\1\1\uffff\1\3",
            "",
            "\1\14\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\6\uffff\1\13",
            "",
            "\1\17\13\uffff\1\15\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\6\uffff\1\36",
            "\1\47\2\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\6\uffff\1\46",
            "\1\47\2\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\6\uffff\1\46",
            "\1\55\30\uffff\1\50\1\51\1\52\1\53\1\54\1\56\2\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\17\13\uffff\1\15\1\16",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\17\13\uffff\1\15\1\16",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\1\106\1\107\1\110\1\111\1\112\1\113\6\uffff\1\114",
            "\1\116\26\uffff\1\115",
            "\1\117",
            "\1\116\1\55\25\uffff\1\115\4\uffff\1\52\1\53\1\54",
            "\1\116\1\55\25\uffff\1\115\4\uffff\1\52\1\53\1\54",
            "\1\116\1\55\25\uffff\1\115\4\uffff\1\52\1\53\1\54",
            "\1\116\1\55\25\uffff\1\115\4\uffff\1\52\1\53\1\54",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\17\13\uffff\1\15\1\16",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\116\26\uffff\1\115",
            "\1\116\26\uffff\1\115\10\uffff\1\156",
            "\1\116\26\uffff\1\115",
            "\1\17\13\uffff\1\15\1\16",
            "\1\157",
            "\1\160",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\161",
            "\1\162\1\163\1\164\1\165\1\166\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0091",
            "\1\u0091",
            "\1\u0091",
            "\1\u0091",
            "\1\u0091",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u0092",
            "\1\u0093",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u0094",
            "\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u009b",
            "\1\u009c",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u009d",
            "\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00b9",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00ba",
            "\1\u00bb",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00bc",
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2",
            "\1\116\26\uffff\1\115",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c3",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d3",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d5",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\17\13\uffff\1\15\1\16",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dc",
            "\1\17\13\uffff\1\15\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "843:2: ( (otherlv_0= 'until' ( (lv_condition_1_0= ruleCondition ) ) ) | (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= 'else' ( (lv_action_5_0= ruleAction ) ) ) | (otherlv_6= 'if' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= 'else' ( (lv_action_9_0= ruleAction ) ) otherlv_10= 'until' ( (lv_condition_11_0= ruleCondition ) ) ) | (otherlv_12= 'wait' ( (lv_n_13_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000031012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003B012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000039012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004FC0000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004FC4800030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000002A000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004FC4800032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0081FC8000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000700000022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0081FC0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x007E000000000000L});

}
