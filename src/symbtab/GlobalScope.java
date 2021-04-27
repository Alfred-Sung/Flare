package symbtab;

import symbtab.exception.ScopeException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GlobalScope extends Scope {
    public GlobalScope() {
        super(null, null, null, "global", null, Visibility.PUBLIC);
    }

    @Override
    public LinkedList<Scope> resolve(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        String front = key.peek().getText();
        //System.out.println("Global scope resolving: " + front);

        if (children.containsKey(front)) {
            key.remove();
            return children.get(front).find(source, key, trace);
        } else {
            throw new ScopeException("Identifier " + front + " not found");
        }
    }

    @Override
    public LinkedList<Scope> resolve(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        if (children.containsKey(key))
            return children.get(key).find(source, key, trace);
        else
            throw new ScopeException("Identifier " + key + " not found");
    }

    @Override
    protected LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        //System.out.println("Global scope finding: " + key.peek());
        return null;
    }

    @Override
    protected LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        //System.out.println("Global scope finding: " + key);
        return null;
    }

    public List<String> getEntities() {
        LinkedList<String> result = new LinkedList<>();

        for (String filename : children.keySet())
            if (!filename.equals("main")) result.add(filename);

        return result;
    }
}
