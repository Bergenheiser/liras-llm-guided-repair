/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.parser.antlr;

import com.google.inject.Inject;
import it.polimi.parser.antlr.internal.InternalLIRAsParser;
import it.polimi.services.LIRAsGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LIRAsParser extends AbstractAntlrParser {

	@Inject
	private LIRAsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLIRAsParser createParser(XtextTokenStream stream) {
		return new InternalLIRAsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LIRAsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LIRAsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
