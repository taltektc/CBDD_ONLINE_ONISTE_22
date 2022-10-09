package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login_page extends Config {
// constructor
    public login_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    // Locators
@FindBy(how= How.NAME, using = "email")
public WebElement emailLocator;
@FindBy(how= How.NAME, using = "password")
public WebElement passwordLocator;
@FindBy(how= How.XPATH, using = "//input[@value='Log In']")
public WebElement loginBtnLocator;


// List of test functions
    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(exp, act);
        System.out.println("Verify I am in login page is success");
    }

    public void enterEmail(String email){
        emailLocator.sendKeys(email);
    }

}
