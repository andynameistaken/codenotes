# Python Internals

## Basic Informations

- Python code is translated into intermediate code, which has to be executed by a virtual machine, known as the PVM, the Python Virtual Machine. 
- This is a similar approach to the one taken by Java. 
- There is even a way of translating Python programs into Java byte code for the Java Virtual Machine (JVM) - this can be achieved with Jython.
- Python takes necessary steps for compiling automatically, but it can be done manually by:

a) `py_compile` module: 



```python
import py_compile 
import os
import shutil


# Set path to files
dir_path = './compile_example/'
if not os.path.exists(dir_path):
    os.mkdir(dir_path)

# Create a file called "test.py"
with open(dir_path + 'test.py', 'w'): pass

# Compile the file
py_compile.compile('./compile_example/test.py')

# Create list of files in the directory
dirs = os.listdir(dir_path)
print(dir_path +":")

# Print out every file in the directory
for file in dirs:
    print(file) 
# Remove "test.py" as it is not longer needed
os.remove(dir_path + 'test.py')

# Print "__pycache__" directory
dirs = os.listdir(dir_path + '__pycache__/')
print(dir_path + '__pycache__/:')
for file in dirs:
    print(file)

# remove "compile_example" directory  (if it exists) with all its contents
if os.path.exists(dir_path):
    shutil.rmtree(dir_path)
```

    ./compile_example/:
    __pycache__
    test.py
    ./compile_example/__pycache__/:
    test.cpython-39.pyc


b) shell prompt: `python -m py_compile <file>`

---

```shell
❯ ls
 test_1.py
❯ python3 -m py_compile test_1.py
❯ ls
 __pycache__   test_1.py
❯ cd __pycache__/
❯ ls
 test_1.cpython-39.pyc
```

---


c) `compileall` module for  compiling all Python files in the directory 

---

```sh
❯ python3 -m compileall .
Listing '.'...
Compiling './test_1.py'...
Compiling './test_2.py'...
❯ ls
 __pycache__   test_1.py   test_2.py
❯ cd __pycache__/
❯ ls
 test_1.cpython-39.pyc   test_2.cpython-39.pyc
```

---

- Python only creates .pyc files for imported modules.
- Above options can be useful when installing modules for shared use, especially if some of the users may not have permission to write the byte-code cache files in the directory containing the source code.
- Python will check, if a compiled version with the .pyc suffix exists. This file has to be newer than the file with the .py suffix. 
    - If such a file exists, Python will load the byte code, which will speed up the start up time of the script. If there is no byte code version, Python will create the byte code before it starts the execution of the program. 

## Difference Between Compiler and Interpreter

### Compiler

- A compiler is a computer program that transforms (translates) source code of a programming language (the source language) into another computer language (the target language).
In most cases compilers are used to transform source code into executable program, i.e. they translate code from high-level programming languages into low (or lower) level languages, mostly assembly or machine code.

### Interpreter

- In computer science, an interpreter is a computer program that directly executes instructions written in a programming or scripting language, without requiring them previously to have been compiled into a machine language program.

- An interpreter generally uses one of the following strategies for program execution:

    1. Parse the source code and perform its behavior directly;
    2. Translate source code into some efficient intermediate representation or object code and immediately execute that;
    3. Explicitly execute stored precompiled bytecode made by a compiler and matched with the interpreter Virtual Machine.

## Python Code Style

### Expressions
- An expression usually refers to a piece of code that can be evaluated to a value.

- examples:
    - `1 + 1`
    - `5 > 3`


### Statements

- A statement refers to a piece of code that executes a specific instruction or tells the computer to complete a task. 

- examples:
    - `if a > 5:`
    - `x = 4`
  


### Code Blocks
- A block is a group of statements in a program or script. 
- Usually, it consists of at least one statement and declarations for the block, depending on the programming or scripting language. 
- A language which allows grouping with blocks, is called a **block structured language**.
- Generally, blocks can contain blocks as well, so we get a nested block structure. 
- A block in a script or program functions as a means to group statements to be treated as if they were one statement. 
- In many cases, it also serves as a way to limit the lexical scope of variables and functions.

 ![Code Blocks](/repos/python-course/images/code-blocks.png)

- Different languages have different recipes for code blocks.

- For example Java uses curly braces to delimit different code blocks.

- Here is simple Java program that will print out any number bigger than 5 in 0 - 10 (excluding 10) range:

---

```java
for (int i = 0; i < 10; i++) { // block 1
    if ( i > 5) {                   // block 2
        System.out.println(i)
    }                               // block 2 end
} // block 1 end

```

---

- Spaces in code above (except a type and name of variable - `int i` - space here is required so java will know when type declaration ends) are used only for readability purposes and Java Virtual Machine ignores them, so code below will work as well:

---

```java
for(int i=0;i<10;i++){if( i>5){System.out.println(i)}} 

```

---
- Python uses a different and quite unique approach it uses space as delimiters of code blocks and colons for the end of functions, loops and conditional statements.
- Python uses four spaces as default indentation spaces.
- However, the number of spaces can be anything; it is up to the user. 
- A minimum of one space is needed to indent a statement.
- The first line of python code cannot have an indentation


- As the example here is rewritten mentioned earlier Java code in Python:


```python
 # block 1
for i in range(10):    
    # block 2
    if i > 5:               
        print(i)
    # block 2 end
# block 1 end
```

    6
    7
    8
    9



