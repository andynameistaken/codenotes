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
