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




    // functions
}