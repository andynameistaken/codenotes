# Java Properties

## Basic definition

The Properties class represents a persistent set of `String` pairs in `Map` representation ("Key" -> "Value").
It can write those pairs to a disk and read them back to `String` or `Stream`.
This class is used for storing configs for applications.
If you are familiar with Linux or macOS (less likely, but I hope you are, and on Windows - dunno) operating system you probably edited some configuration files.

## Usage

### Setting Properties

To set properties instance we use the `setProperty​(String key, String value)`
It calls the `Hashtable` method `put` and enforces use of strings for property keys and values. The value returned is the result of the `Hashtable` call to put.

The construction of this metod should look like this: 

```java
class Properties extends Hashtable<Object,Object> {
    // ...
    public synchronized Object setProperty(String key, String value) {
        return put(key, value);
    }
    // ...
}
```

A you see, it uses `synchronised` keyword, which provides support for parallelism with `getProperty` method (it is `synchronised` too) 
Let see how it works on the example:

=== "Setting Properties"
    ```java
    package collections.properties;
    import java.util.Properties;

    public class SetProperties {
        public static void main(String[] args) {
            Properties properties  = new Properties();
            // set petting property
            properties.setProperty("window-manager", "i3-gaps");
            properties.setProperty("os", "nixOS");
            properties.setProperty("user", "andy");
    
            // iterating over key and value of every property
            properties.forEach(
                (key, value) -> System.out.println(key + " : " + value));
            properties.setProperty("group", "wheel");
            // will return value, because key exists
            System.out.println(
                "print::properties.setProperty():" + 
                properties.setProperty("group", "wheel"));
            System.out.println();
            properties.forEach(
                (key, value) -> System.out.println(key + " : " + value));
        }
    }
    ```

=== "Output"
    ```java
    os : nixOS
    window-manager : i3-gaps
    user : andy
    print::properties.setProperty():wheel

    os : nixOS
    window-manager : i3-gaps
    user : andy
    group : wheel
    ```

!!! Warning
    Because `Properties` inherits from `Hashtable`, the put and `putAll` methods can be applied to a
     Properties object. 
     Their use is strongly discouraged as they allow the caller to insert entries whose keys or 
     values are not Strings.
      The `setProperty` method should be used instead. 
      If the store or save method is called on a "compromised" Properties object that contains 
      a non-String key or value, the call will fail.

      This is an example of breaking [[Liskov Substitution Principle]].
      They should use composition instead inheritance, but idk, too late I guess.
    
      Here is an example that points out this bad design decision:
    
    === "Properties Break"
        ```java
            package collections.properties;  
            import java.util.Properties;
    
            public class BreakProperties {
                public static void main(String[] args) {
                    Properties properties = new Properties();
                    properties.put("KeyStringValNot", 2);
                    System.out.println(properties.getProperty("KeyStringValNot")); 
                    System.out.println(properties.get("KeyStringValNot"));
                }
            }
        ```
    === "Output"
        ```java
        null
        2  
        ```

### Storing Properties

You can store the property key and value pairs to a  file via `store()` method.

```java
package collections.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("newkey1", "newvalue1");
        prop.setProperty("newkey2", "newvalue2");
        prop .store(new FileOutputStream(
                "./src/collections/properties/properties.conf"), null);

        // Store as XML
        prop = new Properties();
        prop.setProperty("1st", "first");
        prop.setProperty("2nd", "second");
        prop.storeToXML(new FileOutputStream(
            "./src/collections/properties/properties.xml"), null);
    }
}
```

- Content of `properties.conf` is:

```shell
#Thu Oct 28 23:10:51 CEST 2021
newkey1=newvalue1
newkey2=newvalue2
```

- And `properties.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>
<entry key="1st">first</entry>
<entry key="2nd">second</entry>
</properties>
```

### Loading Properties

=== "Loading Properties"
    ```java
    package collections.properties;

    import java.io.IOException;
    import java.io.InputStream;
    import java.util.Properties;
    
    public class LoadProperties {
        public static void main(String[] args) throws IOException {
            Properties properties = new Properties();
            // will load a properties file located in the same package as
            // the class LoadProperties.
            InputStream in = LoadProperties
                    .class
                    .getResourceAsStream("properties.conf");
            properties.load(in);
            properties
                    .forEach((k, v) -> System.out.println(k +  " -> " + v));
    
            System.out.println("XML Properties");
            in  = LoadProperties
                    .class
                    .getResourceAsStream("properties.xml");
            properties = new Properties();
            properties.loadFromXML(in);
            properties.forEach((key, value) -> System.out.println(
                    key +" -> "+ value));
        }
    }
    ```

=== "Output"
    ```console
    newkey1 -> newvalue1
    newkey2 -> newvalue2
    XML Properties
    1st -> first
    2nd -> second
    ```

### Default Properties

There are two ways to provide default value for properties:

- With using `Properties` constructor which accepts another `Properties` object as a parameter: `Properties​(Properties defaults)`:
   
=== "Defaults Constructor"
    ```java
    Properties defauts = new Properties();  
    defauts.setProperty("os", "ArchLinux");  
    defauts.setProperty("user", "root");  
    // printing defaults:  
    System.out.println("defaults:");  
    defauts.forEach(  
     (key, value) -> System.out.println(key + " : " + value)  
     );  
    // providing defaults with constructor  
    Properties props = new Properties(defauts);  
    // props.setProperty("environment", "i3-gaps");  
    // printing props  
    System.out.println("props:");  
    props.forEach((key, val) -> System.out.println(key + " : " + val));  
    System.out.println("props.getProperty(\"os\") = " 
       + props.getProperty("os"));
    ```
=== "Output"
    ```console
    defaults:
    os : ArchLinux
    user : root
    props:
    props.getProperty("os") = ArchLinux
    ```

As you see, after setting default properties you can't just browse through them.
There is no method in `Properties` class that will show you default values
for keys. I am not a master of the good design, but this thing looks awful,
because a client might want ask: "Hmm, I wonder what are defaults of this app?",
and the answer is well... there is no answer.
---
- By providing default value with using method parameter: `getProperty​(String key, String defaultValue)`
If value for key does not exist, method returns `defaultValue` String.

=== "Default Method Parameter"
    ```java
    Properties props2 = new Properties();
    String defaultJedi = props2.getProperty("jedi", "Obi-Wan Kenobi");
    System.out.println("defaultJedi = " + defaultJedi);
    ```
=== "Output"
    ```sh
    defaultJedi = Obi-Wan Kenobi
    ```