package symbtab;

import Flare.FlareParserBaseVisitor;
import Flare.FlareParserVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class BaseVisitor<T, S>  extends FlareParserBaseVisitor<T> implements FlareParserVisitor<T> {
    protected Scope currentScope;
    protected S data;

    protected void pushScope(Scope s) {
        currentScope = s;
        //System.out.println("entering: " + currentScope.getName(), data);
    }

    protected void popScope() {
        //System.out.println("leaving: " + currentScope.getName(), data);
        currentScope = currentScope.getEnclosedScope();
    }

    public T visit(ParseTree tree, S data) {
        S previous = this.data;
        this.data = data;
        T value = super.visit(tree);
        this.data = previous;
        return value;
    }
}
