package part1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUp2 {
// if we only test on the Android apps, it is suggested to use AndroidDriver
// if we test on both Android and IOS apps, we should use AppiumDriver
// if you will not test IOS apps no need to use AppiumDriver.. you shouldn't use it
    AppiumDriver<MobileElement> appiumDriver;

    DesiredCapabilities capabilities = new DesiredCapabilities();


    @Test
    public void isCalculatorAppInstalled() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Pixel 6 Pro API 33");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/app/Calculator.apk");
        appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), capabilities);

        // to test for is the app installed or not, we should find the bundle id of the application
        // download Apk info from the apk pure website

        Assert.assertTrue(appiumDriver.isAppInstalled("com.google.android.calculator"), "Calculator app is not installed");

    }
//java's MobileCapabilityTye is not supported, we can use it but it is not recommended to use on node.js


    @Test
    public void capabilityTypes() throws MalformedURLException {

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro API 33");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/Calculator.apk");


        appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), capabilities);
    }
}
