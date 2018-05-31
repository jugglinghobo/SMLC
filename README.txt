# SMLP V2 - Simple Math Language Parser, Version 2

### Introduction

This project was an assignment for the course Languages and Compilers by Prof. P. Felber at the University of Neuchâtel, Switzerland.
SMLP supports the following features:

- Version 1
-- Support the following operations for integers: `+`, `-`, `*`, `/`, `^`
-- Support for correct operator precedence
-- Support for nested SML expressions in parentheses

- Version 2
-- Support for real numbers where applicable
-- Support for additional operations: `sin()`, `cos()`, `tan()`
-- Support for early termination of an SML program with `q`


### Installation

####1. First, make sure that you have installed javacc and added the files to your $PATH and $CLASSPATH variables.
An example installation looks like this:

1. Download javacc 6.0.1 from the project website.
2. Unpack the downloaded archive and copy the resulting folder to your home directory
3. Add the unpacked folder to your $PATH environment variables: In your .bashrc file, add the lines `export PATH=$HOME/javacc-6.0/bin:$PATH`

####2. Clone this repository

You can clone this git repository with git clone git@github.com:jugglinghobo/SMLP.git /path/to/target/directory

####3. Generate the java classes for the compiler and compile them

You can generate the actual compiler from the javaCC files with:

```bash
cd src && javacc ../SMLP.jj
```

Then you can compile the generated .java files using

```
javac -d . ./src/*.java
```

Alternatively, you can do both steps at once by running the compile script.
1. First, make the file executable with `chmod +x compile`
2. run `./compile` to execute both compilation steps

####4. Compile an SML program

You can write your own SML program or use the example programs found in the `/input` directory.
Then you can run the program with

```
java smlp/SMLP < /path/to/your/program
```

Alternatively, you can use the provided `run` script. First, make it executable with `chmod +x run`. To execute an SML program you can then just call

```
./run input/ops.txt
```
