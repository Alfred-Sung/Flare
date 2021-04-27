package symbtab;

import exception.FlareException;
import symbtab.exception.ScopeException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionSignature extends Scope {
    List<Type> signature = new LinkedList<>();

    public FunctionSignature(Scope entityScope, Scope enclosedScope, RuleContext node, Type returnType, Visibility visibility) {
        super(entityScope, enclosedScope, node, enclosedScope.name, returnType, visibility);
    }

    @Override
    protected LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        return null;
    }

    @Override
    protected LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        return null;
    }

    @Override
    protected void define(String name, Scope child) throws FlareException {
        if (children.containsKey(name))
            throw new FlareException(name + " already defined in " + this.getName(), child.getNode().start, child.getNode().stop);

        try {
            LinkedList<Scope> trace = this.resolve(entityScope, name, new LinkedList<>());
            if (trace != null)
                throw new FlareException(name + " already defined in " + trace.getFirst().getName(), child.getNode().start, child.getNode().stop);
        } catch (ScopeException e) {
            children.put(name, child);
        }
    }

    public boolean match(List<Type> parameters) {
        if (parameters.size() != signature.size()) return false;

        for (int i = 0; i < signature.size(); i++)
            if (!parameters.get(i).equals(signature.get(i))) return false;

        return true;
    }

    public void setSignature(List<Type> signature) { this.signature = signature; }
    public List<Type> getSignature() { return signature; }

    @Override
    public String toString() { return signature.toString().replace("[", "").replace("]", ""); }
}
