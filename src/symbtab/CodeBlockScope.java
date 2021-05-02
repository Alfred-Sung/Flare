package symbtab;

import exception.FlareException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.exception.ScopeException;

import java.util.LinkedList;
import java.util.Queue;

public class CodeBlockScope extends Scope {
    public CodeBlockScope(Scope entityScope, Scope enclosedScope, RuleContext node) {
        super(entityScope, enclosedScope, node, enclosedScope.getName(), null, Visibility.PRIVATE);

        //Code blocks don't need to define themselves in their enclosing scope
    }

    public LinkedList<Scope> resolve(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        String front = key.peek().getText();

        //Check if identifier matches children second
        if (children.containsKey(front))
            return children.get(front).find(source, key, trace);

        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
    }

    public LinkedList<Scope> resolve(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        //Check if identifier matches children second
        if (children.containsKey(key))
            return children.get(key).find(source, key, trace);

        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
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
            throw new FlareException(name + " already defined in " + this.name, child.getNode().start);

        try {
            enclosedScope.resolve(entityScope, name, new LinkedList<>());
        } catch (ScopeException e) {
            children.put(name, child);
            return;
        }

        throw new FlareException(name + " already defined in " + this.name, child.getNode().start);
    }
}
