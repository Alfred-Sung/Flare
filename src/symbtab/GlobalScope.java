package symbtab;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Queue;

public class GlobalScope extends Scope {
    public GlobalScope() {
        super(null, null, "global");
    }

    @Override
    public Scope resolve(Queue<TerminalNode> key) {
        try {
            String front = key.peek().getText();
            //System.out.println("Global scope resolving: " + front);

            if (children.containsKey(front)) {
                key.remove();
                return children.get(front).find(key);
            } else {
                throw new Exception("Identifier " + front + " not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Scope resolve(String key) {
        try {
            //System.out.println("Global scope resolving: " + key);

            if (children.containsKey(key)) {
                return children.get(key);
            } else
                throw new Exception("Identifier " + key + " not found");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected Scope find(Queue<TerminalNode> key) throws Exception {
        System.out.println("Global scope finding: " + key.peek());
        return null;
    }

    @Override
    protected Scope find(String key) throws Exception {
        //System.out.println("Global scope finding: " + key);
        return null;
    }
}
