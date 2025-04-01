package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.HooksWeb.androidDriver;

public class AmazonPage {


    public String searchTextBoxJS(String Key){
        return "document.querySelector(\"#twotavsearchtextbox\").value='"+Key+"';";

    }

    public String clickSearchBoxJS(){
        return "document.querySelector(\"#nav-search-submit-button\").click();";
    }

    public void executeElement(String element){
        androidDriver.executeScript(element);
    }

    public WebElement searchBoxAmazon(){
        return androidDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchTextBox;


}


