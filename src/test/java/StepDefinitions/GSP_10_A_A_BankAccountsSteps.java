package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GSP_10_A_A_BankAccountsSteps {
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

    @And("Enter required information")
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

    @And("Click to edit button and change inputs")
    public void clickToEditButtonAndChangeInputs(DataTable dt) {
        dc.sendKeysFunction(dc.getWebElement("searchInput"), "Group_8");
        Actions ac1 = new Actions(GWD.getDriver());
        ac1.sendKeys(Keys.ENTER).build().perform();

        dc.editButton.click();

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
        dc.clickFunction(dc.getWebElement("currencyInput"));
        Actions ac = new Actions(GWD.getDriver());
        for (int i = 0; i < 3; i++) {
            ac.sendKeys(Keys.DOWN).build().perform();
        }
        ac.sendKeys(Keys.ENTER).build().perform();

        //dc.clickFunction(dc.getWebElement("saveButton"));
    }

    @And("Click to delete button")
    public void clickToDeleteButton(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {

            dc.deleteItem(strDeleteText);
        }
    }

    @Then("Unsuccessful message should be displayed")
    public void unsuccessfulMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "already exists");
    }

    @And("Click to search button")
    public void clickToSearchButton(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }

        Actions ac1 = new Actions(GWD.getDriver());
        ac1.sendKeys(Keys.ENTER).build().perform();
    //    dc.clickFunction(dc.getWebElement("searchButton"));
    }

    @Then("There is no date message should be displayed")
    public void thereIsNoDateMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.getWebElement("thereISNoDate"), "There is no data to display");

    }
}

/*
     WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));
 */
