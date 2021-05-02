package symbtab;

import exception.FlareException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.exception.ScopeException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class Scope {
    public enum Visibility {
        PUBLIC, PRIVATE, PROTECTED
    }

    protected HashMap<String, Scope> children = new HashMap<>();
    protected String name;
    protected String translatedName;
    protected Scope entityScope;
    protected Scope enclosedScope;
    protected Type type;
    protected Visibility visibility;

    protected ParserRuleContext node;

    public Scope(Scope entityScope, Scope enclosedScope, RuleContext node, String name, Type type, Visibility visibility) {
        this.entityScope = entityScope;
        this.enclosedScope = enclosedScope;
        this.node = (ParserRuleContext) node;
        this.name = name;
        this.type = type;
        this.visibility = visibility;
    }

    /**
     * Search up the scope tree and attempt to find the first matching identifier
     * @param key List of TerminalNode from identifierSpecifier
     * @return The first scope trace found that best matches the list of identifiers
     */
    public LinkedList<Scope> resolve(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        //System.out.println(name + " scope resolving: " + key);
        if (key.size() == 0) {
            trace.add(this);
            return trace;
        }

        String front = key.peek().getText();
        // Call find() on the first best match
        // The recursive find() calls will throw an Exception if list of identifiers do not match down the line
        if (children.containsKey(front)) {
            //key.remove();
            trace.add(this);
            return children.get(front).find(source, key, trace);
        }
        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
    }

    /**
     * Search up the scope tree and attempt to find the first matching identifier
     * @param key Identifier name
     * @return The first scope found that best matches the list of identifiers
     */
    public LinkedList<Scope> resolve(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        // Check if identifier matches this scope first
        if (key.equals(name)) {
            trace.add(this);
            return trace;
        }

        //Check if identifier matches children second
        if (children.containsKey(key))
            return children.get(key).find(source, key, trace);

        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
    }

    /**
     * Searches down the scope branch checking against the list of identifiers
     * Implementation varies between scopes but will never call resolve()
     * @param key
     * @return The first scope found that best matches the list of identifiers
     * @throws Exception List of identifiers does not match the scope trace, catch at the resolve() method and continue searching up
     */
    protected abstract LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException;

    /**
     * Searches down the scope branch checking against an identifier
     * Implementation varies between scopes but will never call resolve()
     * @param key Identifier name
     * @return The first scope found that best matches the list of identifiers
     * @throws Exception List of identifiers does not match the scope trace, catch at the resolve() method and continue searching up
     */
    protected abstract LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException;

    /**
     * Add scope as child
     * @param name Name of the scope
     * @param child Scope object
     */
    protected void define(String name, Scope child) throws FlareException {
        if (children.containsKey(name))
            throw new FlareException(name + " already defined in " + this.name, child.getNode().start);

        children.put(name, child);
    }

    public Scope get(String child) { return children.getOrDefault(child, null); }
    public boolean contains(String child) { return children.containsKey(child); }

    public String getName() { return name; }
    public String toString() { return this.getClass().getSimpleName() + ": " + name; }

    public String getTranslatedName() { return translatedName; }
    public void setTranslatedName(String name) { this.translatedName = name; }

    public void setEntityScope(Scope scope) { entityScope = scope; }
    public Scope getEntityScope() { return entityScope; }
    public Scope getEnclosedScope() { return enclosedScope; }
    public ParserRuleContext getNode() { return node; }

    public Visibility getVisibility() { return visibility; }

    public Type getType() { return type; }
    public Scope getTypeScope() {
        return type.getReferencedScope();
    }
    public String getTypeName() { return type.getName(); }
}
