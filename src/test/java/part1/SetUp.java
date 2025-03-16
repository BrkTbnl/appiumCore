package part1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUp {
    // set-up Appium Environments

    //1st step: Create android driver from the AndroidDriver class

    AndroidDriver<AndroidElement> androidDriver;


    // 2nd step: Create capabilities object from the DesiredCapabilities class

    DesiredCapabilities capabilities = new DesiredCapabilities();


    /*
    Why do we need to use capabilities object?

    1-we should define name of the emulator, operating system, url, automation name, app name
    2- Capabilities are working as a key-value pair
     */

    @Test
    public void setupCalculator() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Pixel 6 Pro API 30");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        // can be downloaded from apkpure
        // create a package with name app under the project name than drag and drop the downloaded app

        capabilities.setCapability("app", System.getProperty("user.dir") + "/app/Calculator.apk");
        //set-up the driver and define implement the url
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"), capabilities);

    }
}



