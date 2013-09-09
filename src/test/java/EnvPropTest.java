import org.junit.Test;

import java.util.Map;
import java.util.Properties;

public class EnvPropTest {


    @Test
    public void foo(){
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
    }
}
