package symbtab;

import exception.FlareException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Scope {
    public enum Visibility {
        PUBLIC, PRIVATE
    }

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

    /**
     * Search up the scope tree and attempt to find the first matching identifier
     * @param key List of TerminalNode from identifierSpecifier
     * @return The first scope trace found that best matches the list of identifiers
     */
    public LinkedList<Scope> resolve(Queue<TerminalNode> key, LinkedList<Scope> trace) {
        //System.out.println(name + " scope resolving: " + key);
        if (key.size() == 0) {
            trace.add(this);
            return trace;
        }

        try {
            String front = key.peek().getText();
            // Call find() on the first best match
            // The recursive find() calls will throw an Exception if list of identifiers do not match down the line
            if (children.containsKey(front)) {
                //key.remove();
                trace.add(this);
                return children.get(front).find(key, trace);
            }
        } catch (Exception e) {}

        // Continue search up the scope tree
        return enclosedScope.resolve(key, trace);
    }

    /**
     * Search up the scope tree and attempt to find the first matching identifier
     * @param key Identifier name
     * @return The first scope found that best matches the list of identifiers
     */
    public LinkedList<Scope> resolve(String key, LinkedList<Scope> trace) {
        // Check if identifier matches this scope first
        if (key.equals(name)) {
            trace.add(this);
            return trace;
        }

        //System.out.println(name + " resolving: " + key);
        try {
            //Check if identifier matches children second
            if (children.containsKey(key))
                return children.get(key).find(key, trace);

        } catch (Exception e) {}

        // Continue search up the scope tree
        return enclosedScope.resolve(key, trace);
    }

    /**
     * Searches down the scope branch checking against the list of identifiers
     * Implementation varies between scopes but will never call resolve()
     * @param key
     * @return The first scope found that best matches the list of identifiers
     * @throws Exception List of identifiers does not match the scope trace, catch at the resolve() method and continue searching up
     */
    protected abstract LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception;

    /**
     * Searches down the scope branch checking against an identifier
     * Implementation varies between scopes but will never call resolve()
     * @param key Identifier name
     * @return The first scope found that best matches the list of identifiers
     * @throws Exception List of identifiers does not match the scope trace, catch at the resolve() method and continue searching up
     */
    protected abstract LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception;

    /**
     * Add scope as child
     * @param name Name of the scope
     * @param child Scope object
     */
    protected void define(String name, Scope child) {
        try {
            if (children.containsKey(name))
                throw new FlareException(name + " already defined in " + this.name, ((ParserRuleContext)child.node).getStart());

            children.put(name, child);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Scope get(String child) { return children.get(child); }
    public String getName() { return name; }
    public String toString() { return this.getClass().getSimpleName() + ": " + name; }

    public String getTranslatedName() { return translatedName; }
    public void setTranslatedName(String name) { this.translatedName = name; }

    public Scope getEnclosedScope() { return enclosedScope; }
    public RuleContext getNode() { return node; }
}
