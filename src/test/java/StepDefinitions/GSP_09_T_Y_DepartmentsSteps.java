package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GSP_09_T_Y_DepartmentsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();


    @Then("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton); // webelemnti bul

            WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

            dc.clickFunction(element);


        }


    }


    @And("Click on the element LeftNav")
    public void clickOnTheElementLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton); // webelemnti bul
            ln.clickFunction(element); // webelemente tıklat
        }
    }

    @And("Enter a new name and code name in Dialog Content")
    public void enterANewNameAndCodeNameInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("User should see succesfully information")
    public void userShouldSeeSuccesfullyInformation() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "deleted");
    }

    @And("User should see succesfully created")
    public void userShouldSeeSuccesfullyCreated() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "created");
    }


    @And("User should see succesfully updated")
    public void userShouldSeeSuccesfullyUpdated() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "updated");

    }

    @Then("User should see this field cannot left blank")
    public void userShouldSeeThisFieldCannotLeftBlank() {
        dc.verifyContainsTextFunction(dc.getWebElement("leftblank"), "blank!");
    }


    @And("User should see error name msg")
    public void userShouldSeeErrorNameMsg() {
        dc.verifyContainsTextFunction(dc.errorMessage, "already Department");
    }

    @And("User should see error code msg")
    public void userShouldSeeErrorCodeMsg() {
        dc.verifyContainsTextFunction(dc.errorMessage, "already Department");
    }
}

