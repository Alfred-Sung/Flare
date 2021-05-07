## Transpilers
What is a transpiler?

A transpiler is a different kind of compiler that takes in a targeted language, in this case Flare, and outputs equivalent code in
another, C++. We then have the choice of using a variety of pre-existing compilers to turn the translated code into an executable for
the user to run.

The decision to use this method stemmed from wanting to produce a purely memory efficient program while remaining platform independent.
The nature of problems that DOP aims to solve includes large amounts of objects which would need long and contiguous memory addresses.
An interpreter, I feel, would not be the best decision as the program would not only need to store the data of numerous objects, but also
the data of the interpreter itself; an issue that may show itself in the form of crashes from not enough memory.

Choosing a compiler for Flare is not the best idea either. I have no knowledge of how to code in assembly nor do I know how to write machine
code. Besides, there are many well aged and optimized compilers that have large communities and well written documentation. In addition, many 
pre-existing compilers can detect specific code patterns and utilize many tricks to speed up runtime; this [test](https://github.com/Alfred-Sung/DOP-test) 
shows the difference between Microsoft's MSVC and g++ compilers.

## Phases

### Parser

### Entity Table Generation

### Header Generation

### Method Body Generation

#### Resolve-Find