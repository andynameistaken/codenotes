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
        System.out.println("print::properties.setProperty():" +
         properties.setProperty("group", "wheel"));
        System.out.println();
        properties.forEach((
            key, value) -> System.out.println(key + " : " + value));
    }
}