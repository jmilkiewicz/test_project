import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Map;
import java.util.Properties;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: milus
 * Date: 9/5/13
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class FooTest {
    private static FirefoxDriver firefoxDriver;

    @BeforeClass
    public static void beforeClass(){
        firefoxDriver = new FirefoxDriver();
    }

    @AfterClass
    public static void afterClass(){
        firefoxDriver.quit();
    }

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


    @Test
    public void testFF(){
        firefoxDriver.get("http://www.amazon.com");
        String title = firefoxDriver.getTitle();

        assertThat(title, containsString("Online Shopping"));
    }
}
