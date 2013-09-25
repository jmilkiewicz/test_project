import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class EnvPropTest {


    @Test
    public void foo() throws IOException {
        Properties properties = System.getProperties();
        System.out.println("++++ SYSTEM PROPERTIES ++++++");
        for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
            System.out.println(objectObjectEntry.getKey() + "=" + objectObjectEntry.getValue());
        }

        System.out.println("++++ ENV Variables ++++++");
        Map<String, String> getenv = System.getenv();
        for (Map.Entry<String, String> stringStringEntry : getenv.entrySet()) {
            System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue());
        }


        String kuba = System.getenv("KUBA");
        FileWriter fileOutputStream = new FileWriter("aaa.txt");
        fileOutputStream.write(kuba);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
