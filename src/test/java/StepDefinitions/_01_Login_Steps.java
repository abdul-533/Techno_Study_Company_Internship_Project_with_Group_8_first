package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_Login_Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Enter walid username as {string}, password as {string} and click to login button")
    public void enterWalidUsernameAsPasswordAsAndClickToLoginButton(String username, String password) {
        dc.sendKeysFunction(dc.getWebElement("userName"), username);
        dc.sendKeysFunction(dc.getWebElement("password"), password);
        dc.clickFunction(dc.getWebElement("loginButton"));
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.getWebElement("txtTechnoStudy"), "Techno Study");
    }


}
