package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GSP_08_T_K_SchoolLocationsSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Navigate to Locations")
    public void navigateToLocations(DataTable items) {
        List<String> strButtons = items.asList(String.class);
        for (String strButton: strButtons){
            ln.clickFunction(ln.getWebElement(strButton));
        }
    }

//    @And("Click add button")
//    public void clickAddButton() {
//        dc.clickFunction(dc.getWebElement("addButton"));
//    }

    @And("Enter name, short name, location type and capacity")
    public void enterNameShortNameLocationTypeAndCapacity(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
        dc.clickFunction(dc.getWebElement("locationType"));
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
    }

//    @And("Click save button")
//    public void clickSaveButton() {
//        dc.clickFunction(dc.getWebElement("saveButton"));
//    }

//    @Then("Success message should be displayed")
//    public void successMessageShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "successfully");
//    }

//    @Then("Then Already exist should be displayed")
//    public void thenAlreadyExistShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("alreadyExist"),"already exists");
//    }

    @And("Click edit button and change name")
    public void clickEditButtonAndChangeName() {
        dc.clickFunction(dc.getWebElement("editButton"));
        dc.sendKeysFunction(dc.getWebElement("nameInput"), "TechnoStudy1");
        dc.clickFunction(dc.getWebElement("saveButton"));
    }

    @And("Click delete button")
    public void clickDeleteButton() {
        dc.clickFunction(dc.getWebElement("deleteImageBtn"));
        dc.clickFunction(dc.getWebElement("deleteDialogBtn"));
    }

//    @Then("No data should be displayed")
//    public void noDataShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("noData"), "no data");
//    }
}
