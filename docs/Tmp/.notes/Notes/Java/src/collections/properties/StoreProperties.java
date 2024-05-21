package collections.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("newkey1", "newvalue1");
        prop.setProperty("newkey2", "newvalue2");
        prop
        .store(
            new FileOutputStream("./src/collections/properties/properties.conf"), null);

        // Store as XML
        prop = new Properties();
        prop.setProperty("1st", "first");
        prop.setProperty("2nd", "second");
        prop.storeToXML(new FileOutputStream("./src/collections/properties/properties.xml"), null);
    }
}
