package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class GSP_06_H_Ç_PositionsSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Navigate to Positions")
    public void navigateToPositions(DataTable items) {
        List<String> strButtons = items.asList(String.class);
        for (String strButton : strButtons) {
            ln.clickFunction(ln.getWebElement(strButton));
        }
    }

    @And("Click add button")
    public void clickAddButton() {
        dc.clickFunction(dc.getWebElement("addButton"));
    }

    @And("Enter name and short name")
    public void enterNameAndShortName(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
    }

    @And("Click save button")
    public void clickSaveButton() {
        dc.clickFunction(dc.getWebElement("saveButton"));
    }

//    @Then("Success message should be displayed")
//    public void successMessageShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "successfully");
//    }

//    @And("Click sign out")
//    public void clickSignOut() {
//        dc.clickFunction(dc.getWebElement("tStudy"));
//        dc.clickFunction(dc.getWebElement("signOut"));
//    }

    //    The Position with Name "hhh" already exists.
    @Then("Already exist should be displayed")
    public void alreadyExistShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"),"already exists");
    }

    @And("Search name and click edit button and change name")
    public void searchNameAndClickEditButtonAndChangeName(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            dc.editItem("hhh", items.get(i).get(1));
        }
    }

    @And("Search name and click delete button")
    public void searchNameAndClickDeleteButton(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {
            dc.deleteItem(strDeleteText);
        }
    }

    @And("Search for the deleted name")
    public void searchForTheDeletedName(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);

        for (String strButton: strButtons){
            dc.sendKeysFunction(dc.getWebElement("searchInput"), strButton);
            dc.clickFunction(dc.getWebElement("searchButton"));
        }
    }

    //There is no data to display
    @Then("No data should be displayed")
    public void noDataShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("thereISNoDate"), "no data");
    }



}
