package part4;

import io.appium.java_client.android.AndroidTouchAction;
import org.testng.annotations.Test;
import page.apiDemoPage;
import utils.Hooks;
import utils.ReusableMethods;

import static io.appium.java_client.touch.offset.PointOption.point;

public class apiDemoTest extends Hooks {

    apiDemoPage apiDemoPage = new apiDemoPage();
    ReusableMethods rm = new ReusableMethods();

    @Test
    public void test1() {
//        apiDemoPage.clickElement(apiDemoPage.accessibilityButton);
        apiDemoPage.clickElement(apiDemoPage.getViewsButton());
    }

    @Test(dependsOnMethods = "test1")
    public void scrollToElement() {
        apiDemoPage.clickElement(apiDemoPage.getViewsButton());
        rm.scrollToFrom(547,2207,547,678);
    }


}
