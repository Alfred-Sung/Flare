##Project Flare

A Java/C-like data-oriented programming language using ANTLR4 lexer parser

Following from this [article](http://gamesfromwithin.com/data-oriented-design), the effectiveness of structuring code into a data-oriented 
design can be seen in this [test](https://github.com/Alfred-Sung/DOP-test); granted that the data-oriented code is far from perfect but still 
shows a major performance boost.


####Syntax
The syntax of Flare follows roughly the syntax of Java/C-like languages with classes and enclosed functions. However the main 
differences are that classes are declared as entities and have a distinct component body where relevant variables are declared.
```$xslt
// Single line comments are denoted like this

/*
    Multi-line comments are denoted like this
*/

entity Vector3 {
    component {
        float  x, y, z;
    }

    // Constructor
    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

// main function is declared outside of entity bodies
void main() {

}
```