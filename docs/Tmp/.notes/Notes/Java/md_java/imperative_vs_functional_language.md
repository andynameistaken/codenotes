# Difference betwenn functional and imperative programming languages
**Definition:** An imperative language uses a sequence of statements to determine how to reach a certain goal. These statements are said to change the state of the program as each one is executed in turn.

**Examples:** Java is an imperative language. For example, a program can be created to add a series of numbers:

```
 int total = 0;
 int number1 = 5;
 int number2 = 10;
 int number3 = 15;
 total = number1 + number2 + number3; 
```

Each statement changes the state of the program, from assigning values to each variable to the final addition of those values. Using a sequence of five statements the program is explicitly told how to add the numbers 5, 10 and 15 together.

**Functional languages:** The functional programming paradigm was explicitly created to support a pure functional approach to problem solving. Functional programming is a form of declarative programming.

**Advantages of Pure Functions:** The primary reason to implement functional transformations as pure functions is that pure functions are composable: that is, self-contained and stateless. These characteristics bring a number of benefits, including the following: Increased readability and maintainability. This is because each function is designed to accomplish a specific task given its arguments. The function does not rely on any external state.

Easier reiterative development. Because the code is easier to refactor, changes to design are often easier to implement. For example, suppose you write a complicated transformation, and then realize that some code is repeated several times in the transformation. If you refactor through a pure method, you can call your pure method at will without worrying about side effects.

Easier testing and debugging. Because pure functions can more easily be tested in isolation, you can write test code that calls the pure function with typical values, valid edge cases, and invalid edge cases.

**For OOP People or Imperative languages:**

Object-oriented languages are good when you have a fixed set of operations on things and as your code evolves, you primarily add new things. This can be accomplished by adding new classes which implement existing methods and the existing classes are left alone.

Functional languages are good when you have a fixed set of things and as your code evolves, you primarily add new operations on existing things. This can be accomplished by adding new functions which compute with existing data types and the existing functions are left alone.

Cons:

It depends on the user requirements to choose the way of programming, so there is harm only when users don’t choose the proper way.

When evolution goes the wrong way, you have problems:

-   Adding a new operation to an object-oriented program may require editing many class definitions to add a new method
-   Adding a new kind of thing to a functional program may require editing many function definitions to add a new case

___
source: [stackoverflow](https://stackoverflow.com/a/17826493)