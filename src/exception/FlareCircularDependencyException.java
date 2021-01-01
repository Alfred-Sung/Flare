package exception;

import org.antlr.v4.runtime.Token;

public class FlareCircularDependencyException extends FlareException {
    public FlareCircularDependencyException(String message, Token token) {
        super(message, token);
    }
}
