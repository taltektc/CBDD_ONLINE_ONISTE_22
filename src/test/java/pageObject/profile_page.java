package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profile_page extends Config {
    // constructor
    public profile_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // locators
    @FindBy(how= How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement welcomeProfileLoc;
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;

    // functions
    public void verifyEmailAddressIsCorrectInProfilePage(String expEmail) {
        String actEmail = emailLocator.getAttribute("value");
        Assert.assertEquals(actEmail, expEmail);
    }
    public void verifyWelcomeTitle(){
        String exp = "Welcome to TalentTek";
        String act = welcomeProfileLoc.getText();
        Assert.assertEquals(act, exp);
    }
}