package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import java.util.List;

public class GSP_11_K_C_GradeLevelsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User navigate to GradeLevels")
    public void userNavigateToGradeLevels(DataTable items) {
        List<String> itemList = items.asList(String.class);
        for (String il : itemList) {
            ln.clickFunction(ln.getWebElement(il));
        }
    }
    @And("create a name,short name, order")
    public void createANameShortNameOrder(DataTable items) {
         List<List<String>> itemsAll = items.asLists(String.class);
        for (int i = 0; i <itemsAll.size() ; i++) {
            dc.sendKeysFunction(dc.getWebElement(itemsAll.get(i).get(0)), itemsAll.get(i).get(1));
        }
    }
    @Then("Default message should be displayed")
    public void defaultMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("alreadyExists"), "already exists.");
    }

    @And("Click on element add buttons")
    public void clickOnElementAddButtons() {
        dc.clickFunction(dc.getWebElement("addButton"));
    }


    @When("create a name,short name and order complications")
    public void createANameShortNameAndOrderComplications() {
        String randomString = RandomStringUtils.randomAlphabetic(8);
        String shortName = RandomStringUtils.randomAlphabetic(5);
        String orderAdd = RandomStringUtils.randomNumeric(4);

        dc.sendKeysFunction(dc.getWebElement("nameInput"), randomString);
        dc.sendKeysFunction(dc.getWebElement("shortName"), shortName);
        dc.sendKeysFunction(dc.getWebElement("orderAdd"), orderAdd);
        Assert.assertTrue(dc.getWebElement("activeButton").isDisplayed(), "not found");
        dc.clickFunction(dc.getWebElement("saveButton"));
    }

    @And("Click to edit and delete button and change name,shortname")
    public void clickToEditAndDeleteButtonAndChangeNameShortname() {
        String randomString = RandomStringUtils.randomAlphabetic(8);
        String shortName = RandomStringUtils.randomAlphabetic(5);
        String orderAdd = RandomStringUtils.randomNumeric(4);
        dc.clickFunction(dc.getWebElement("diyezClick"));
        dc.clickFunction(dc.getWebElement("diyezClick"));

        dc.clickFunction(dc.getWebElement("editButton"));
        dc.sendKeysFunction(dc.getWebElement("nameInput"), randomString);
        dc.sendKeysFunction(dc.getWebElement("shortName"), shortName);
        dc.sendKeysFunction(dc.getWebElement("orderAdd"), orderAdd);
        dc.clickFunction(dc.getWebElement("saveButton"));
        dc.clickFunction(dc.getWebElement("deleteImageBtn"));
        dc.clickFunction(dc.getWebElement("deleteDialogBtn"));
    }

}




// @And("Write name,short name and order complications")
// public void writeNameShortNameAndOrderComplications(DataTable items) {
//     List<List<String>> itemsAll = items.asLists(String.class);

//   for (int i = 0; i < itemsAll.size(); i++) {
//          dc.sendKeysFunction(dc.getWebElement(itemsAll.get(i).get(0)), itemsAll.get(i).get(1));
//    }
