# Strings

Strings are created by putting a sequence of characters in quotes.
Strings can be surrounded with:

- single quotes: `'python'`
- double quotes: `"python"`
- triple single/double quotes: `'''python'''` or `"""python"""`

## Examples:




```python
txt_1 = "python"
txt_2 = 'is'
txt_3 = """really"""
txt_4 = '''cool'''

print(txt_1)
print(txt_2)
print(txt_3)
print(txt_4)
```

    python
    is
    really
    cool


- Python does not allow mixed syntax for strings, so something like this won't work:
    ```python
    txt_5 = "no go'
    ```
- Strings are immutable - once defined they cannot be changed

