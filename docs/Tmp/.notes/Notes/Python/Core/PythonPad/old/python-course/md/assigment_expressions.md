### Assignment Expressions
- In most of languages assigning variables in the middle of expressions is not allowed.
- Python allows that with a special operator: `:=`
    - It is affectionately known as “the walrus operator” due to its resemblance to the eyes and tusks of a walrus.

<img src="https://i.pinimg.com/originals/8e/15/9b/8e159b79fe49ea4c5f6e4c18c3d56930.jpg" alt="picture of the walrus" width="200"/>

- Here is sample of Java code which uses assignment and expression in single instruction:
```java
    if (int x = 5 > 1) { // this will return error
            System.out.println("Number Bigger than 1");
        }
```
The code won't even compile.
Compiler will return error that we need an `;` operator (which is used for end of the statement), but even if we would have it there, the code still won't run.

- Here is same code written in Python:





```python
if (x := 5 ) > 1:
    print("Number", x, "is bigger than 1")
```

    Number 5 is bigger than 1


- If we won't use parenthesis Python will evaluate whole statement first as `True` or `False` and then write it to the variable:



```python
if x := 5 > 1:
    print(x, "is bigger than 1")
else:
    print("Number", x, "is not bigger than 1")
```

    True is bigger than 1



```python
if x := 0 > 1:
    print(x, "is bigger than 1")
else:
    print(x, "is not bigger than 1")
```

    False is not bigger than 1


- Another example with list comprehensions 
    - Program that prints out odd numbers of the list that has values three times bigger than original, and value is lower than 20:


```python
def f(x):
    return x + 3

numbers = [3, 7, 2, 9, 12]

odd_numbers = [result for x in numbers if (result := f(x)) % 2 and result < 20]

print(odd_numbers)
```

- A program that adds cube to every number in the list if cube of this number is less than 20:



```python
def f(x):
    return x + 3

numbers = [3, 7, 2, 9, 12]

odd_numbers = [result for x in numbers if (result := f(x)) % 2 and result < 20]

print(odd_numbers)
```


```python
- A program that adds cube to every number in the list if cube of this number is less than 20:

```


```python
def cube(x):
    return x**3

numbers = [1, 2, 3, 4, 5]

less20_cubes = [result for val in numbers if (result := cube(val)) < 20]
print(less20_cubes)

```
