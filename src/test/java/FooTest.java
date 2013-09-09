import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Map;
import java.util.Properties;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

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
    public void testFirefox(){
        firefoxDriver.get("http://www.amazon.com");
        String title = firefoxDriver.getTitle();

        assertThat(title, containsString("Online Shopping"));
    }
}
