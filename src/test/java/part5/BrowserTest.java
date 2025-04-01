package part5;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.AmazonPage;

public class BrowserTest {
    public static AndroidDriver<WebElement> androidDriver;
    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01(){
        androidDriver.get("https://www.amazon.com");
    }


    @Test
    public void searchTestBox(){
        androidDriver.get("https://www.amazon.com");
        amazonPage.searchBoxAmazon().sendKeys("airpods pro 2");
        amazonPage.executeElement(amazonPage.searchTextBoxJS("iphone"));
        amazonPage.executeElement(amazonPage.clickSearchBoxJS());



    }


}
