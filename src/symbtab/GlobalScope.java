package symbtab;

import exception.FlareException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GlobalScope extends Scope {
    public GlobalScope() {
        super(null, null, "global");
    }

    @Override
    public LinkedList<Scope> resolve(Queue<TerminalNode> key, LinkedList<Scope> trace) {
        try {
            String front = key.peek().getText();
            //System.out.println("Global scope resolving: " + front);

            if (children.containsKey(front)) {
                key.remove();
                return children.get(front).find(key, trace);
            } else {
                throw new FlareException("Identifier " + front + " not found", key.peek().getSymbol());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public LinkedList<Scope> resolve(String key, LinkedList<Scope> trace) {
        try {
            //System.out.println("Global scope resolving: " + key);

            if (children.containsKey(key)) {
                return children.get(key).find(key, trace);
            } else
                throw new Exception("Identifier " + key + " not found");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        //System.out.println("Global scope finding: " + key.peek());
        return null;
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        //System.out.println("Global scope finding: " + key);
        return null;
    }

    public List<String> getChildren() { return new LinkedList<String>(children.keySet()); }
}
