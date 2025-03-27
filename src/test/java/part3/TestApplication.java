package part3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;
import utils.ReusableMethods;

import static io.appium.java_client.touch.offset.PointOption.point;

public class TestApplication {

    ReusableMethods rm = new ReusableMethods();

    @BeforeTest
    public void setUp() {
        Driver.getAndroidDriver();
    }

    @Test
    public void test1() {
//        TouchAction action = new TouchAction(Driver.getAndroidDriver());
//        action.tap(point(87,207)).perform();
//        rb.waitFor(3);

        rm.waitFor(1);
        rm.tap(87,207);
        rm.waitFor(1);
        rm.tap(115,1503);
        rm.waitFor(1);
    }

    @AfterTest
    public void tearDown() {
        Driver.quitAppiumDriver();
    }

}
