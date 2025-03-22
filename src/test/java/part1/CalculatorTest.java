package part1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {


    AndroidDriver<AndroidElement> androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    // Appium Inspector use case
    @BeforeTest
    public void setupCalculator() throws MalformedURLException {
        capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
        capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
        capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
        capabilities.setCapability("automationName", ConfigReader.getProperty("automationName"));
        capabilities.setCapability("app", System.getProperty("user.dir") + ConfigReader.getProperty("app"));
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"), capabilities);
    }

    @Test
    public void multiplicationTest(){

        androidDriver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
        androidDriver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        androidDriver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
        androidDriver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        String result = androidDriver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();

        Assert.assertEquals(result, "56", "Multiplication is wrong!");

    }

    @AfterTest
    public void tearDown(){
        androidDriver.quit();
    }

}
