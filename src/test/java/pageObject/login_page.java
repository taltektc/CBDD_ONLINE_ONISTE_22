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

public class login_page extends Config {

    GenericFunctions GF = new GenericFunctions();
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

@FindBy(how= How.XPATH, using = "//*[@id='error_message']/div/h5")
public WebElement invalidEmailOrPassLoc;


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
    public void enterPass(String pass){
        passwordLocator.sendKeys(pass);
    }
    public void clickLoginButton(){
        GF.waitForElementToBeClickable_xpath (30, "//input[@value='Log In']");
        loginBtnLocator.click();
    }
    public void verifyInvalidEmailOrPassErrorMsg(){
       String actTextBeforeTrim=  invalidEmailOrPassLoc.getText();
       String act = actTextBeforeTrim.substring(1,actTextBeforeTrim.length() - 1);
       System.out.println("Act error message: ==> " + act);
       String exp = "You have entered an incorrect email or student Id";
       Assert.assertEquals(exp, act);
    }
    public void clickCreateNewAccountButton(String buttonValue){
        driver.findElement(By.xpath("//a[contains(text(),'"+buttonValue+"')]")).click();
    }
    public void clickOnLoginButton(String buttonValue){
        driver.findElement(By.xpath("//input[@value='"+buttonValue+"']")).click();
    }

}
