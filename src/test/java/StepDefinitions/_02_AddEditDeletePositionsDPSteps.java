package StepDefinitions;
import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class _02_AddEditDeletePositionsDPSteps {
    DialogContent dc=new DialogContent();
    LeftNav  ln=new LeftNav();
    @When("Click Setup from LeftNav")
    public void clickSetupFromLeftNav(){
        ln.clickFunction(ln.getWebElement("setup"));
    }
    @Then("Click SchoolSetup from LeftNav")
    public void  ClickSchoolSetupFromLefNav(){
        ln.clickFunction(ln.getWebElement("schoolSetup"));

    }

    @Then("Click Add button int the School Department")
    public void clickAddButtonIntTheSchoolDepartment() {
        ln.clickFunction(ln.getWebElement("addButtonDp"));
    }

    @Then("Click Departments from LeftNav")
    public void clickDepartmentsFromLeftNav() {
        ln.clickFunction(ln.getWebElement("departments"));
    }

    @And("Enter a new name and code name from the School Deparment")
    public void enterANewNameAndCodeNameFromTheSchoolDeparment() {
        dc.sendKeysFunction(dc.getWebElement("nameInputDP"),"ty");
        dc.sendKeysFunction(dc.getWebElement("codeInputDP"),"678");
    }

    @And("Click save button")
    public void clickSaveButton() {
        dc.clickFunction(dc.getWebElement("saveButtonDP"));
    }

    @Then("Click edit button")
    public void clickEditButton() {
        dc.clickFunction(dc.getWebElement("editButtonDP"));
    }

    @And("After edit enter a new name and code name from the new School Department category")
    public void afterEditEnterANewNameAndCodeNameFromTheNewSchoolDepartmentCategory() {
        dc.sendKeysFunction(dc.getWebElement("nameInputDP"),"TC");
        dc.sendKeysFunction(dc.getWebElement("codeInputDP"),"876");
    }

    @Then("click delete button")
    public void clickDeleteButton() {
        dc.clickFunction(dc.getWebElement("trashButtonDP"));
    }

    @And("User should see succesfull information")
    public void userShouldSeeSuccesfullInformation() {
        Assert.assertTrue(dc.getWebElement("deletedMessageDP").getText().toLowerCase().contains("deleted"));
    }
}
