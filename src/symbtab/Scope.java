package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Queue;

public abstract class Scope {
    protected HashMap<String, Scope> children = new HashMap<>();
    protected String name;
    protected String translatedName;
    protected Scope enclosedScope;

    protected RuleContext node;

    public Scope(Scope enclosedScope, RuleContext node, String name) {
        //System.out.println("Created scope " + name);
        this.enclosedScope = enclosedScope;
        this.node = node;
        this.name = name;
    }

    public Scope resolve(Queue<TerminalNode> key) {
        if (key.size() == 0) { return this; }

        //System.out.println(name + " resolving: " + key.peek());
        try {
            String front = key.peek().getText();

            if (children.containsKey(front)) {
                key.remove();
                return children.get(front).find(front);
            }
        } catch (Exception e) { }

        return enclosedScope.resolve(key);
    }

    public Scope resolve(String key) {
        if (key.equals(name)) { return this; }

        //System.out.println(name + " resolving: " + key);
        try {
            if (children.containsKey(key))
                return children.get(key).find(key);

        } catch (Exception e) { }

        return enclosedScope.resolve(key);
    }

    protected abstract Scope find(Queue<TerminalNode> key) throws Exception;
    protected abstract Scope find(String key) throws Exception;

    protected void define(String name, Scope child) {
        try {
            if (children.containsKey(name))
                throw new Exception(name + " already defined in " + this.name);

            children.put(name, child);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Scope get(String child) { return children.get(child); }
    public String getName() { return name; }
    public String getTranslatedName() { return translatedName; }
    public void setTranslatedName(String name) { this.translatedName = name; }
    public Scope getEnclosedScope() { return enclosedScope; }
    public RuleContext getNode() { return node; }
}
