package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class TestApplicationPage extends Hooks {

    public TestApplicationPage() {
        PageFactory.initElements(androidDriver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Access'ibility\"]")
    public WebElement accessibilityButton;

    public void clickElement(WebElement element) {
        element.click();
    }

    // This method is used to find elements by accessibility id

    public WebElement findElementByAccessibilityId(String id) {
        return androidDriver.findElementByAccessibilityId(id);
    }

    public WebElement accessibilityId =
            androidDriver.findElementByAccessibilityId("Access'ibility");


}