package part2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;

public class CreateDriverClass {
// Create a package with name utils and create a class with name Driver
    // Create a class with name ConfigReader in the utils
    // Create configuration.properties under the project name

//    Driver driver = new Driver();
    @BeforeTest
    public void setUp(){

        Driver.getAndroidDriver();
    }

    @Test
    public void multiplicationTest(){
        Driver.androidDriver.findElementByAccessibilityId("5").click();
        Driver.androidDriver.findElementByAccessibilityId("multiply").click();
        Driver.androidDriver.findElementByAccessibilityId("8").click();
        Driver.androidDriver.findElementByAccessibilityId("equals").click();
    }


    @Test
    public void additionTest(){
        Driver.androidDriver.findElementByAccessibilityId("5").click();
        Driver.androidDriver.findElementByAccessibilityId("plus").click();
        Driver.androidDriver.findElementByAccessibilityId("8").click();
        Driver.androidDriver.findElementByAccessibilityId("9").click();
        Driver.androidDriver.findElementByAccessibilityId("equals").click();
    }
    @Test
    public void subtractionTest(){
        Driver.androidDriver.findElementByAccessibilityId("5").click();
        Driver.androidDriver.findElementByAccessibilityId("minus").click();
        Driver.androidDriver.findElementByAccessibilityId("8").click();
        Driver.androidDriver.findElementByAccessibilityId("9").click();
        Driver.androidDriver.findElementByAccessibilityId("equals").click();
    }
    @Test
    public void divisionTest(){
        Driver.androidDriver.findElementByAccessibilityId("5").click();
        Driver.androidDriver.findElementByAccessibilityId("divide").click();
        Driver.androidDriver.findElementByAccessibilityId("8").click();
        Driver.androidDriver.findElementByAccessibilityId("9").click();
        Driver.androidDriver.findElementByAccessibilityId("equals").click();


    }
    @AfterTest
    public void tearDown(){
        Driver.quitAppiumDriver();

    }
}