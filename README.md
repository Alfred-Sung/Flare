# Project Flare

###### Flare is just a project that I thought was cool and in no way should be taken as a legitimate programming language. There are many incomplete and buggy features still yet to be implemented because I am not the smartest person I know nor am I an expert in language and compiler development. 

"Data-oriented" design has seen some popularity in recent times mainly from [Unity's DOTS](https://unity.com/dots) and [Johnathan Blow's jai programming language](https://inductive.no/jai/),
both of which touts increased performance. The main topic of these discussions is the focus on cache coherence when it comes to SoA (Structure of Arrays)
and AoS (Array of Structures) within programming languages.

Following from this [article](http://gamesfromwithin.com/data-oriented-design), the effectiveness of structuring code into a data-oriented
design can be seen in this [test](https://github.com/Alfred-Sung/DOP-test); granted that the test code is far from perfect but still
shows a major performance boost.


Flare is a Java/C-like data-oriented programming language using ANTLR4 lexer parser that generates memory efficient code that improves runtime aimed
at dealing with numerous objects. What this project aims to do is create a programming language that is familiar to OOP programmers, that is also easily translatable to C++, and incorporates the principles of
DOP and cache coherence.

##Sample Code
```
void main() {
    println("Hello world!");
    
    int::<10> i(iter);
    println(i);
    
    i += 10;
    println(i);
}
```

output:
```
Hello world!
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
```

##Useful Resources
* [Syntax and Semantics of Flare](doc/syntax-semantics.md)
* [Compiling Flare files](doc/compiling-files.md)
* [Transpilation process](doc/transpilation-process.md)
* [Translating to C++](doc/translating-to-Cpp.md)
##Dependencies
* ANTLR 4.9
* JDK13
* gcc 6.3.0
* C++14
