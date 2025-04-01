package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HooksWebIOS {
    public static AppiumDriver iosDriver;

    static DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeMethod
    public void setUp() {
        try {
            capabilities.setCapability("deviceName", ConfigReader.getProperty("iPhone 12"));
            capabilities.setCapability("platformName", ConfigReader.getProperty("IOS"));
            capabilities.setCapability("platformVersion", "16.0");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("browserName", "safari");
            capabilities.setCapability("safari:useSimulator", true);
            iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723"), capabilities);
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }catch (MalformedURLException e){
            System.err.println("Malformed Url Exception: "+e.getMessage());
        }




    }
}
