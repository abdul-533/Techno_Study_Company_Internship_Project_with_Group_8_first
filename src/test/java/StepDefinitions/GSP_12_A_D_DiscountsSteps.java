package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GSP_12_A_D_DiscountsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));


    @When("User navigate to discounts Alperen")
    public void userNavigateToDiscountsAlperen(DataTable items) {
        List<String> itemList = items.asList(String.class);
        for (String il : itemList) {
            ln.clickFunction(ln.getWebElement(il));
        }
    }

    @And("User should enter necessary informations to the new discounts")
    public void userShouldEnterNecessaryInformationsToTheNewDiscounts(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));

        }
        dc.clickFunction(dc.getWebElement("description"));


    }

    @Then("Click to edit button and change name discounts")
    public void clickToEditButtonAndChangeNameDiscounts(DataTable dt) {
        dc.sendKeysFunction(dc.getWebElement("descriptionSearch"), "TechnoStudyGR9");
        dc.clickFunction(dc.getWebElement("searchButton"));
        dc.clickFunction(dc.getWebElement("editButton"));
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));

        }
    }

    @Then("Click to delete button Discounts")
    public void clickToDeleteButtonDiscounts() {

        dc.sendKeysFunction(dc.getWebElement("descriptionSearch"), "TechnoStudyGR99");
        dc.clickFunction(dc.getWebElement("searchButton"));
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));
        dc.clickFunction(dc.getWebElement("deleteImageBtn"));
        dc.clickFunction(dc.getWebElement("deleteDialogBtn"));
    }

    @And("already exists message should be displayed Discount")
    public void alreadyExistsMessageShouldBeDisplayedDiscount() {
        wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("alreadyExists")));
        Assert.assertTrue(dc.getWebElement("alreadyExists").isDisplayed());
    }

    @And("Click on close button")
    public void clickOnCloseButton() {
        dc.clickFunction(dc.getWebElement("closeMarkDiscounts"));
    }

    @And("user should verify he successfully cancelled adding item")
    public void userShouldVerifyHeSuccessfullyCancelledAddingItem() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.getWebElement("addButton")));
        Assert.assertTrue(dc.getWebElement("addButton").isDisplayed());
    }
}