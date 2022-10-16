package stepDef;

import base.Config;
import io.cucumber.java.en.Then;
import pageObject.profile_page;

public class profile_stepDef extends Config {
    profile_page PP = new profile_page(driver);
    @Then("i should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        PP.verifyWelcomeTitle();
        PP.verifyEmailAddressIsCorrectInProfilePage(Hook.eMail);
    }
}
