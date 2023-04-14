package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddEditDeletePositionsHRSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("Navigate to test.mersys.io")
    public void navigateToTestMersysIo() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @Then("Enter username and password")
    public void enterUsernameAndPassword() {
        dc.sendKeysFunction(dc.getWebElement("usernameMersys"), "turkeyts");
        dc.sendKeysFunction(dc.getWebElement("passwordMersys"), "TechnoStudy123");
    }

    @And("Click Login Button")
    public void clickLoginButton() {
        dc.clickFunction(dc.getWebElement("loginBtnMersys"));
    }

    @And("Click Human Resources from LeftNav")
    public void clickHumanResourcesFromLeftNav() {
        ln.clickFunction(ln.getWebElement("humanResourcesLeftNav"));
    }

    @And("Click Setup at the Human Resources from LeftNav")
    public void clickSetupAtTheHumanResourcesFromLeftNav() {
        ln.clickFunction(ln.getWebElement("SetupAtHumanResources"));
    }

    @And("Click Position Categories at the Human Resources from LeftNav")
    public void clickPositionCategoriesAtTheHumanResourcesFromLeftNav() {
        ln.clickFunction(ln.getWebElement("positionCategoriesAtHR"));
    }

    @Then("Click Add button in the Position Categories \\(Dialog Content)")
    public void clickAddButtonInThePositionCategoriesDialogContent() {
        dc.clickFunction(dc.getWebElement("addBtnHR"));
    }

    @And("Enter a new name from the new position category")
    public void enterANewNameFromTheNewPositionCategory() {
        dc.sendKeysFunction(dc.getWebElement("nameBoxHR"), "Group8Project");
    }

    @Then("Click save button")
    public void clickSaveButton() {
        dc.clickFunction(dc.getWebElement("SaveBtnHR"));
    }
    @And("Click search button and search the name")
    public void clickSearchButtonAndSearchTheName() {
        dc.sendKeysFunction(dc.getWebElement("SearchBarHR"), "Group8Project" );
        dc.clickFunction(dc.getWebElement("SearchBtnHR"));
    }



    @Then("Click Edit button")
    public void clickEditButton() {
        dc.clickFunction(dc.getWebElement("editBtnHR"));
    }

    @And("After Edit Enter a new name from the new position category")
    public void afterEditEnterANewNameFromTheNewPositionCategory() {
        dc.sendKeysFunction(dc.getWebElement("nameBoxHR"),"Group8Project2");
    }

    @Then("Click delete button")
    public void clickDeleteButton() {
        dc.clickFunction(dc.getWebElement("deleteBtnHR"));

    }

    @And("Confirm delete")
    public void confirmDelete() {
        dc.clickFunction(dc.getWebElement("deleteBtnConfirmHR"));
        wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("deletedMessageHR")));
    }

    @Then("User should see succesful information")
    public void userShouldSeeSuccesfulInformation() {
        Assert.assertTrue(dc.getWebElement("deletedMessageHR").getText().toLowerCase().contains("deleted"));


    }


}
