package part5;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.HerokuAppPage;
import utils.HooksWeb;


public class HerokuAppTest extends HooksWeb {
    HerokuAppPage hap = new HerokuAppPage(androidDriver);

    @DataProvider(name="loginData")
    public Object[][] loginData(){
        return new Object[][]{
                {"jack", "johnson", true},
                {"jane", "doe", false},
                {"jim", "smith", true},
                {"jill", "jones", false},
                {"kirh","hamet",true},
                {"jimmy","",false},
                {"", "1234q",false},
                {"", "",false}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String userName, String password, boolean expected){
        androidDriver.get("https://the-internet.herokuapp.com/login");
        hap.executeElement(hap.userNameJS(userName));
        hap.executeElement(hap.passwordJS(password));
        hap.executeElement(hap.loginButtonClickJS());


    }
}
