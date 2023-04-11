package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class _02_Bank_Account_Abdul {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("User navigate to Bank Account")
    public void userNavigateToBankAccount(DataTable items) {
        List<String> strButtons = items.asList(String.class);
        for (String strButton : strButtons) {
            ln.clickFunction(ln.getWebElement(strButton));
        }

    }

    @And("Click on element add button")
    public void clickOnElementAddButton() {
        dc.clickFunction(dc.getWebElement("addButton"));

    }

    @And("Enter name,IBAM,currency and integration code")
    public void enterNameIBAMCurrencyAndIntegrationCode(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
        dc.clickFunction(dc.getWebElement("currencyInput"));
        Actions ac = new Actions(GWD.getDriver());
        ac.sendKeys(Keys.ENTER).build().perform();
    }

    @And("Click to save button")
    public void clickToSaveButton() {
        dc.clickFunction(dc.getWebElement("saveButton"));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "success");
    }

    @And("Click to edit button and change name")
    public void clickToEditButtonAndChangeName(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.editItem("Ali-533", items.get(i).get(1));
        }

    }

    @And("Click to delete button")
    public void clickToDeleteButton(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {

            dc.deleteItem(strDeleteText);
        }
    }
}

