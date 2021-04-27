package exception;

import Flare.util.FileGenerator;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class FlareException extends Exception {
    protected String source;
    protected Token startToken;
    protected Token endToken;

    public FlareException(String message, Token token) {
        super(message);

        this.source = token.getTokenSource().getSourceName();
        this.startToken = token;
        this.endToken = token;
    }

    public FlareException(String message, Token start, Token end) {
        super(message);

        this.source = start.getTokenSource().getSourceName();
        this.startToken = start;
        this.endToken = end;
    }

    @Override
    public String getMessage() {
        String line = startToken.getInputStream().getText(new Interval(startToken.getStartIndex(), endToken.getStopIndex()));
        return this.getClass().getSimpleName() + ": " + super.getMessage() + "\n\t" +
                "In " + source + " [line: " + startToken.getLine() + " column: " + startToken.getCharPositionInLine() + "]" + "\n\t" +
                "\" " + line +  " \"";
    }
}
