package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.util.List;

public class Kubilayy_Discounts_Steps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User navigate to discounts")
    public void userNavigateToDiscounts(DataTable items) {
        List<String> itemList = items.asList(String.class);
        for (String il : itemList) {
            ln.clickFunction(ln.getWebElement(il));
        }
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
        dc.clickFunction(dc.getWebElement("saveButton"));

        dc.clickFunction(dc.getWebElement("diyezClick"));
        dc.clickFunction(dc.getWebElement("diyezClick"));
    }
}




// @And("Write name,short name and order complications")
// public void writeNameShortNameAndOrderComplications(DataTable items) {
//     List<List<String>> itemsAll = items.asLists(String.class);

//   for (int i = 0; i < itemsAll.size(); i++) {
//          dc.sendKeysFunction(dc.getWebElement(itemsAll.get(i).get(0)), itemsAll.get(i).get(1));
//    }