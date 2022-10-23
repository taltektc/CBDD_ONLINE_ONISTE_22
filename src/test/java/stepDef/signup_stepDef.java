package stepDef;

import base.Config;
import base.GenericFunctions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;
import pageObject.signup_page;

public class signup_stepDef extends Config {
    signup_page SP = new signup_page(driver);
    Faker faker = new Faker();

    @And("i enter unique email address during signup")
    public void iEnterUniqueEmailAddressDuringSignup() {
        String fakeFirstName = faker.name().firstName().toLowerCase();
        String fakeLastname = faker.name().lastName().toLowerCase();
        String fakeRandomNumber = faker.number().digits(3);
        String fakeDomain = "@taltektc-qa.com";
        String fakeEmail = fakeFirstName+fakeLastname+fakeRandomNumber+fakeDomain;
        SP.enterEmail(fakeEmail);
        System.out.println("My Full Fake email is ===>" + fakeEmail);
    }

    @And("i enter unique First Name {string} during signup")
    public void iEnterUniqueFirstNameDuringSignup(String firstName) {
        SP.enterFirstName(firstName);
    }

    @And("i enter unique Last Name {string} during signup")
    public void iEnterUniqueLastNameDuringSignup(String lastName) {
        SP.enterLastName(lastName);
    }
}
