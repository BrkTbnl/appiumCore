package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import utils.HooksWeb;

public class HerokuAppPage extends HooksWeb {

    public HerokuAppPage(AndroidDriver<WebElement> driver) {
        androidDriver = driver;
    }

    //JavaScript path
    public String userNameJS(String userName){
        return "document.querySelector(\"#twotavsearchtextbox\").value='"+userName+"';";

    }

    public String passwordJS(String password){
        return "document.querySelector(\"#twotavsearchtextbox\").value='"+password+"';";
    }

    public String loginButtonClickJS (){
        return "document.querySelector(\".fa.fa-2x.fa-sign-in \").click();";
    }


    public void executeElement(String element){
        androidDriver.executeScript(element);
    }


}
