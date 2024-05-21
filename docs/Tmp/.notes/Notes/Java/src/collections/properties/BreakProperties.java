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
