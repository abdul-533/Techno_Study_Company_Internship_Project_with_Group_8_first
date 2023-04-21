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

public class GSP_04_Ç_Ç_DocumentTypesSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Navigate to Document Types")
    public void navigateToDocumentTypes(DataTable items) {
        ln.clickFunction(ln.getWebElement("setup"));
        ln.clickFunction(ln.getWebElement("parameters"));
        ln.clickFunction(ln.getWebElement("documentTypes"));
    }

//    @And("Click add button")
//    public void clickAddButton() {
//        dc.clickFunction(dc.getWebElement("addButton"));
//    }

    @And("Enter name, stage and description")
    public void enterNameStageAndDescription(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
        dc.sendKeysFunction(dc.getWebElement("documentDescription"), "test");
        dc.clickFunction(dc.getWebElement("stage"));
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        actions.sendKeys(Keys.ESCAPE).build().perform();

    }

//    @And("Click save button")
//    public void clickSaveButton() {
//        dc.clickFunction(dc.getWebElement("saveButton"));
//    }

//    @Then("Success message should be displayed")
//    public void successMessageShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "successfully");
//    }

//    @Then("Already exist should be displayed")
//    public void alreadyExistShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"),"successfully");
//    }

    @And("Search name and click edit button and change Name")
    public void searchNameAndClickEditButtonAndChangeName(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.editItem("cc", items.get(i).get(1));
        }
    }

    @And("Search name and click delete buttons")
    public void searchNameAndClickDeleteButton(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {

            dc.deleteItem(strDeleteText);
        }
    }

//    @And("Search for the deleted name")
//    public void searchForTheDeletedName(DataTable dt) {
//        List<String> strButtons = dt.asList(String.class);
//
//        for (String strButton: strButtons){
//            dc.sendKeysFunction(dc.getWebElement("searchInput"), strButton);
//            dc.clickFunction(dc.getWebElement("searchButton"));
//        }
//    }

//    @Then("No data should be displayed")
//    public void noDataShouldBeDisplayed() {
//        dc.verifyContainsTextFunction(dc.getWebElement("thereISNoDate"), "no data");
//
//    }


}
