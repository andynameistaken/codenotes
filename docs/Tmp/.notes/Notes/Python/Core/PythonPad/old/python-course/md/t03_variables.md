# Variables

- A variable is a way of referring to a memory location used by a computer program.
- In many programming languages a variable is a symbolic name for this physical location.
- This memory location contains values, like numbers, text or more complicated types.
- We can use this variable to tell the computer to save some data in this location or to retrieve some data from this location.

- here is a simple example of a variable:


```python
x = 10
```

- A variable `x` is assigned to the value `10`.

- In other languages like Java there is possibility to declare variable first and initialize it later:

```java
int i;
i = 10
```

- It's not possible to just declare the variables in Python
- If there is need for a variable, you should think of a name and start using it as a variable.
- Not only the value of a variable may change during program execution, but the type as well.
- You can assign an integer value to a variable, use it as an integer for a while and then assign a string to the same variable

- The equal "=" sign in the assignment shouldn't be seen as "is equal to". It should be "read" or interpreted as "is set to"
- When Python executes an assignment like "i = 42", it evaluates the right side of the assignment and recognizes that it corresponds to the integer number 42.
- It creates an [object](Python/old/python-course/md/objects.md) of the integer class to save this data - The equal "=" sign in the assignment shouldn't be seen as "is equal to". It should be "read" or interpreted as "is set to".

## Dynamic vs Static Typing


```python
x = 1
print(x)
print(type(x))

x = x + 0.1
print(x)
print(type(x))

x = "it is a string now"
print(x)
print(type(x))


    1
    <class 'int'>
    1.1
    <class 'float'>
    it is a string now
    <class 'str'>

- C++ different approach to declare a variable in C++:
  - In C++ you have to declare a variable with a type and a name:


  ```cpp
    int i = 1;
    i = "text";
    // print function:
    cout << i;
  ```

- Assigning `"text"` to a variable `x` will will raise an error during the compilation:

```
test.cpp:8:9: error: assigning to 'int' from incompatible type 'const char [5]'
    i = "text";
        ^~~~~~
```

- Up to Java 10 it worked similarly to C++, but since there is added `var` keyword which allievates (partially) those restrictions:

  ```java
  var x = 10;
  var b = "cat";
  ```

- but assigning `x = b` will raise an error:

```console
Test.java:6: error: incompatible types: String cannot be converted to int
        x = b; 
            ^
1 error
```
