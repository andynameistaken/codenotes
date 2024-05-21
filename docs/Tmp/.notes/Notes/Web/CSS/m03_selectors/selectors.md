# Selectors
Where to look for selector specifcations:
https://www.w3.org/TR/selectors-3/

## 1. Selector lists
```
  h1, .monospace-text {
            font-family: monospace;
        }
```
They are used for combining selectors.
If you make mistake in any of them - nothing will work (rule will be ignored).

## 2. Types of selectors:
* Universal selector: 
```
* {
    stuff...
    margin: 0
}
```
They are often used to make other stuff easier to read:  
Element of possible confusion: 

```

article :first-child (first element of an article)
article:first-child (article that is first child of any element)
```

It could look nicer with '*'
```
    article *:first-child {...}
```

* Class selectors:
```
.red-color {
            color: red;
        }
```
 *  class selector on element
 ```
 /* It will target div with blue-color class */
div.blue-color {
            color: blue;
        }
 ```
 * selector for matching more than one class:
 ```
.info {
        color: blue;
}

/* it matches two classes: info and warning */
.info.warning {
    color: orange;
}
 ```
 * ID selectors
 They should be uniqe, im most cases we do not use them, because of high specificity (0100)

 ```
#first {
    background-color: violet;
}
/* This will work if and only if element h1 has class heading */
h1#heading {
    background-color: orange;
}
 ```

## 2. Attribute selectors:
### "Existential" selectors:
*   `element[attribute]`- element has an exact attribute
    * `li[class]`  matches list item with any class
* `element[attribute=value]` - matches with exact value
    * `li[class="x"]`
* `element[attribute~=val]` - matches attribute that has `val`  somewhere 
in space separated list
    * ```
      h1[class~="external"] { color: red; }
      matches:
      <h1 class="friend external sandwich">Attribute Space Separated</h1>
      ```
 * `[attr|=value`] - This will select if the start of a 
 dash-separated list of attribute values matches the selector.
    * Example:
    ``` 
   h1[class|="friend"] { color: red; }
   matches:
   <h1 rel="friend-external-sandwich">Attribute Dash Separated</h1>
    ```
### Substring matching selectors
* `[attr^=value]` - attribute begins with value
    * Example:
 ```
  h1[class^="external"] { color: red; }
  matches:
  <h1 class="external-link someclas">Attribute Begins</h1>
  ```
* `[attr$=value]` - Attribute Ends with Certain Value
    * Example:
```
h1[class$="external"] { color: red; }
matches:
<h1 class="friend external">Attribute Ends</h1>

```
* `` - Matches elements with an attr attribute whose 
value contains value anywhere within the string.
    * Example:
    ```
  h1[class*="external"] { color: red; }
  <h1 class="xxxexternalxxx">Attribute Contains</h1>
    ```

#### To make selectors case-insensitive:
```
li[class^="a" i] {
    color: red;
}
```