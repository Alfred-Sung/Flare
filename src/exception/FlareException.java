package exception;

import Flare.util.FileGenerator;
import org.antlr.v4.runtime.Token;

public class FlareException extends Exception {
    protected String currentFile;
    protected Token token;

    public FlareException(String message, Token token) {
        super(message);
        this.currentFile = FileGenerator.getCurrentFile();
        this.token = token;
    }

    @Override
    public String getMessage() {
        return this.getClass().getSimpleName() + ": entity " + currentFile + " [line: " + token.getLine() + " column: " + token.getCharPositionInLine() + "] " + super.getMessage();
    }
}
