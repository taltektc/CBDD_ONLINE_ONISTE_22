package pageObject;

import base.Config;
import base.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signup_page extends Config {

    GenericFunctions GF = new GenericFunctions();
// constructor
    public signup_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // Locators
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "firstName")
    public WebElement fnameLoc;
    @FindBy(how= How.NAME, using = "lastName")
    public WebElement lnmaeLoc;


// List of test functions
    public void enterEmail(String email){
        emailLocator.sendKeys(email);
    }
    public void enterFirstName(String fname){
        fnameLoc.sendKeys(fname);
    }
    public void enterLastName(String lname){
        lnmaeLoc.sendKeys(lname);
    }


}
