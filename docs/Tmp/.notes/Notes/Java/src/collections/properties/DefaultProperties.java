package collections.properties;

import java.util.Properties;

public class DefaultProperties {
    public static void main(String[] args) {
        
        // creating Properties with default values
        // with Properties constructor

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
        System.out.println("props.getProperty(\"os\") = " + props.getProperty("os"));

        // creating Properties with default values
        // with getProperty method
        Properties props2 = new Properties();
        String defaultJedi = props2.getProperty("jedi", "Obi-Wan Kenobi");
        System.out.println("defaultJedi = " + defaultJedi);
    }   
}
