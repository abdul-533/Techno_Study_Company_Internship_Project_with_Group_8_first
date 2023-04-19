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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Add_Hr_Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @When("User navigate to Position Categories")
    public void userNavigateToPositionCategories(DataTable items) {
        List<String> strButtons = items.asList(String.class);
        for (String strButton : strButtons) {
            ln.clickFunction(ln.getWebElement(strButton));
        }
    }

    @And("Enter name at Position Category")
    public void enterNameAtPositionCategory(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
    }

    @Then("Click to edit button and change name HR")
    public void clickToEditButtonAndChangeNameHR(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.editItem("TechnoStudyGR8", items.get(i).get(1));
        }
    }

    @Then("Click to delete button HR")
    public void clickToDeleteButtonHR(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {

            dc.deleteItem(strDeleteText);
        }
    }

    @Then("User should be able to see the position category list")
    public void userShouldBeAbleToSeeThePositionCategoryList() {

        wait.until(ExpectedConditions.urlContains("category"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("category"));
    }


    @Then("Click to search button HR")
    public void clickToSearchButtonHR() {
        dc.sendKeysFunction(dc.getWebElement("searchInput"), "Mentor");
        wait.until(ExpectedConditions.elementToBeClickable(dc.getWebElement("searchButton")));
        dc.clickFunction(dc.getWebElement("searchButton"));
        Assert.assertTrue(dc.mentor.isDisplayed());
    }

    @And("Enter name at Position Category HR")
    public void enterNameAtPositionCategoryHR() {
        dc.clickFunction(dc.getWebElement("addButton"));
        dc.sendKeysFunction(dc.getWebElement("nameInput"),"Mentor");
        dc.clickFunction(dc.getWebElement("saveButton"));
    }

    @Then("already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.alreadyExistsMsg));
        Assert.assertTrue(dc.alreadyExistsMsg.isDisplayed());
    }


}
