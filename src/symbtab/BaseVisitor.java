package symbtab;

import Flare.FlareParserBaseVisitor;

public class BaseVisitor extends FlareParserBaseVisitor<Object> {
    protected Scope currentScope;

    protected void pushScope(Scope s) {
        currentScope = s;
        //System.out.println("entering: " + currentScope.getName());
    }

    protected void popScope() {
        //System.out.println("leaving: " + currentScope.getName());
        currentScope = currentScope.getEnclosedScope();
    }
}
