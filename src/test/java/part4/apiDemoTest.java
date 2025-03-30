package part4;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.apiDemoPage;
import utils.Hooks;
import utils.ReusableMethods;


public class apiDemoTest extends Hooks {

    apiDemoPage apiDemoPage = new apiDemoPage();
    ReusableMethods rm = new ReusableMethods();

    @Test
    public void test1() {
//        apiDemoPage.clickElement(apiDemoPage.accessibilityButton);
        apiDemoPage.clickElement(apiDemoPage.getViewsButton());
    }

    @Test
    public void test2scroll() {
        apiDemoPage.clickElement(apiDemoPage.getViewsButton());
        rm.waitFor(2);
        rm.scrollToFrom(547,2207,547,678);
    }

    @Test
    public void test3() {
        rm.tap(115,1765);
        rm.waitFor(2);
        rm.scrollToFrom(547,2207,547,678);

        WebDriverWait wait = new WebDriverWait(Hooks.androidDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(apiDemoPage.getListButton()));
        Assert.assertTrue(apiDemoPage.getListButton().isDisplayed());

    }

}
