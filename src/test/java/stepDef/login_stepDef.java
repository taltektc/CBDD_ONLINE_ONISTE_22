package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
        LP.enterPass(Hook.password);
    }
    @When("i click on Login button")
    public void iClickOnLoginButton() {
        LP.clickLoginButton();
    }

    @And("i enter my invalid email address")
    public void iEnterMyInvalidEmailAddress() {
        LP.enterEmail("myfakeemail12121@gmai.com");
    }

    @Then("i should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {
        LP.verifyInvalidEmailOrPassErrorMsg();
    }

    @And("i enter my invalid password")
    public void iEnterMyInvalidPassword() {
        LP.enterPass("myfakePas$1");
    }
}
