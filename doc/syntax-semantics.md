## <a id="section1"></a> Syntax

Language grammar can be found [here](src/FlareParser.g4)

The syntax of Flare follows roughly the syntax of Java/C-like languages with classes and enclosed functions. However, the main
focus of this language is that classes are declared as entities and have a distinct component body where relevant variables are declared.

A basic example:

```
// Single line comments are denoted like this

/*
    Multi-line comments are denoted like this
*/

entity Vector3 {
    component {
        float x, y, z;
    }

    // Constructor
    public Vector3(float x, float y, float z) {
        this.x(x);
        this.y(y);
        this.z(z);
    }
}

// main function is declared outside of entity bodies
void main() {

}
```

## <a id="section2"></a> Declaring components
Entity components can be a combination of both primitive and user-declared entities. The only restriction is that entities may not
circularly reference each other. The transpiler will detect and report these types of errors.

```
entity Foo {
    component {
        Bar var;
    } 
}

entity Bar {
    component {
        Test var;
    } 
}

entity Test {
    component {
        Foo var; // Error: Cirular dependency of Foo -> Bar -> Test -> Foo
    } 
}
```

Although Flare does not support inheritance like OOP languages do, it can be emulated through the declaration of components and re-declaring
functions that you would override. It is far from the elegant or reusable code principles of OOP, but it is still possible with a bit more 
verbose code.

```
entity SuperClass {
    component { int foo; }
    public int getFoo() { return this.foo; }
}

entity SubClass {
    component { SuperClass inherited; }
    public int getFoo() { return inherited.getFoo(); }
}
```

## <a id="section3"></a> Visibility Modifiers
Constructors and functions can be explicitly set as public or private. Components on the other hand are always private and cannot
be accessed by other entities other than itself.

```
entity foo {
    component {
        int bar;
    } 
    
    public int modifyBar() { 
        bar += 1; // Valid access
    }
    ...
}

void main() {
    foo var();
    var.bar += 1; // Invalid access
    var.modifyBar(); // Valid access
}
```

## <a id="section4"></a> Sets
The main feature of Flare is the ability to easily create sets of entities and apply functions to all entities of that set. 

```
entity Vector3 {
    component {
        float x, y, z;
    }
    
    public Vector3() {
        this.x(0);
        this.y(0);
        this.z(0);
    }
    
    public void translate(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }
}

void main() {
    Vector3::<100> vec(); // Declare a set of 100 Vector3 entities
    vec.translate(1, 1, 1); // Apply the translate() function to all 100 entities
    
    string::<20> i("Hello World!"); // Primitive types can also be declared as a set
    print(i); // Prints 20 "Hello World!"s
}
```

Sets can also be declared in components allowing for one-to-many relations between entities:
```
entity Vector3 {
    component {
        float x, y, z;
    }
    ...
}

entity Mesh {
    component {
        Vector3::<10000> verticies;
    }
    ...
}
```
Note that sets are not the same as arrays and should not be treated as such. Sets cannot be indexed or resized. 
Functions that are applied to one entity of a set are applied to all entities of that set.

### <a id="section4.1"></a> iter Keyword
Sets would not be very useful if there was no way to initialize each entity distinctly, or a way to apply functions that 
are specific to each entity. The iter keyword is a reserved integer variable that returns the index of the entity in its set and is 
only accessible in function parameters.

```
void main() {
    int::<100> i(iter); // Initialize values from [1, 100)
    print(i); 
}
```