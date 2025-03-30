package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class apiDemoPage extends Hooks {

    public apiDemoPage() {
        PageFactory.initElements(Hooks.androidDriver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Access'ibility\"]")
    public WebElement accessibilityButton;

    // This method is used to find elements by accessibility id

    public WebElement findElementByAccessibilityId(String id) {
        return Hooks.androidDriver.findElementByAccessibilityId(id);
    }

//    public WebElement accessibilityId =
//            androidDriver.findElementByAccessibilityId("Access'ibility");


    public WebElement getAccessibilityButton(){
        return findElementByAccessibilityId("Access'ibility");
    }

    public WebElement getViewsButton(){
        return findElementByAccessibilityId("Views");
    }


    public void clickElement(WebElement element) {
        element.click();
    }
}