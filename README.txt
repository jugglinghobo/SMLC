SMLC V2 - Simple Math Language Compiler, Version 2

== Introduction

This project was an assignment for the course Languages and Compilers by Prof. P. Felber at the University of Neuchâtel, Switzerland.
SMLC supports the following features:

- Version 1
-- Support the following operations for integers: +, -, *, /, ^
-- Support for correct operator precedence
-- Support for nested SML expressions in parentheses

- Version 2
-- Support for real numbers
-- Support for trigonometric functions sine, cosine and tangent
-- Support for termination of the interactive SML compiler with "q"

The grammar that is recognized by the Parser can be found in the GRAMMAR.txt file.


=== Installation

==== 1. First, make sure that you have installed javacc and added the files to your $PATH variable.
An example installation looks like this:

1. Download javacc 6.0.1 from the project website.
2. Unpack the downloaded archive and copy the resulting folder to your home directory
3. Add the unpacked folder to your $PATH: In your .bashrc file, add the line `export PATH=$HOME/javacc-6.0/bin:$PATH`

==== 2. Clone this repository
You can clone this git repository with "git clone git@github.com:jugglinghobo/SMLC.git /path/to/target/directory"
Alternatively, you can just download the directory as a ZIP file.

==== 3. Setup
===== 3.1 Quick Setup
1. In your terminal, navigate to the SMLC root directory (where you downloaded it to)
2. Run "chmod +x compile && chmod +x smli"
3. Run "./compile" to generate the java .class files for SMLC

===== 3.2 Manual Setup
When you are in the SMLC root directory, you can manually generate the compiler from the javaCC files by running:
"cd src && javacc ../SMLP.jj"

Then you can compile the generated .java files using:
"javac -d . ./src/*.java"

==== 4. Running the Compiler
When you have generated the necessary java .class files, you can now run the compiler.
This repository contains a program (SMLI, SML Interactive) that runs the compiler interactively.
You can start this program by running:
"./smli" (or alternatively "java smlc/SMLC")

==== 5. Testing the Compiler
When running SMLI, you can enter your SML expressions at the "=? " prompt, and evaluate them by pressing return (<ENTER>).
If you need help, you can type "h" to see a list of accepted operations.
When typing "g", you can see the grammar that was used to implement the parser.
