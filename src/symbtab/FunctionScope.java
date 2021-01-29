package symbtab;

import Flare.FlareParser;
import exception.FlareException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionScope extends Scope {
    List<FunctionSignature> signatures = new LinkedList<>();

    public FunctionScope(Scope enclosedScope, String name, Type returnType) {
        super(enclosedScope, null, name, returnType);

        enclosedScope.define(name, this);
    }

    public void addSignature(FunctionSignature signature) {
        try {
            if (match(signature.getSignature()) != null)
                throw new FlareException("Function signature " +
                        name + "(" + signature.toString() + ")" +
                        " already declared", signature.getNode().start);

            signatures.add(signature);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public FunctionSignature match(List<Type> parameters) {
        for (FunctionSignature signature : signatures)
            if (signature.match(parameters)) return signature;

        return null;
    }

    public FunctionSignature match(FlareParser.DeclarationParametersContext ctx) {
        List<FlareParser.DeclarationStatementSingularContext> parameters = ctx.declarationStatementSingular();
        List<Type> parameterTypes = new LinkedList<>();

        for (FlareParser.DeclarationStatementSingularContext parameter : parameters)
            parameterTypes.add(new Type(parameter.variableType().getText(), 0, 1));

        return match(parameterTypes);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        //System.out.println(name + " function scope finding: " + key.peek());
        trace.add(this);

        key.remove();
        if (key.size() == 0) { return trace; }

        return type.getReferencedScope().find(key, trace);
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);

        //System.out.println("Function scope finding: " + key);
        return trace;
    }

    //Type is not resolved in constructor since entityTable phase is not done
    public void resolveType() {
        type.attachScope(this);
    }
    public void setNode(ParserRuleContext node) { this.node = node; }
}
