/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LIRAsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/polimi/parser/antlr/internal/InternalLIRAs.tokens");
	}
}
