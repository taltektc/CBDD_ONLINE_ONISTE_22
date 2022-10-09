package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.login_page;

public class login_stepDef extends Config {

    login_page LP = new login_page(driver);

    @Given("i am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        LP.verifyHomePageTitle();
    }

    @And("i enter my valid email address")
    public void iEnterMyValidEmailAddress() {
        LP.enterEmail(Hook.eMail);
    }

    @And("i enter my valid password")
    public void iEnterMyValidPassword() {
        // code
    }

    @When("i click on Login button")
    public void iClickOnLoginButton() {
        // code
    }
}
