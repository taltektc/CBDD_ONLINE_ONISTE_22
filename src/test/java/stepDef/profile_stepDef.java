package stepDef;

import io.cucumber.java.en.Then;
import org.testng.Assert;

public class profile_stepDef {
    @Then("i should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        Assert.assertEquals(1, 2);
    }
}
