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

public class GSP_03_A_M_U_AttestationsSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Click on the element HR-ATTESTATIONS LeftNav")
    public void clickOnTheElementHRATTESTATIONSLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton);
            ln.clickFunction(element);
        }
        }

    @Then("Click on the element to HR-ATTESTATIONS in Dialog")
    public void clickOnTheElementToHRATTESTATIONSInDialog(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));

            dc.clickFunction(element);
        }
    }

    @And("Enter a new name to HR-ATTESTATIONS in Dialog Content")
    public void enterANewNameToHRATTESTATIONSInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("User should see succesfully information frame")
    public void userShouldSeeSuccesfullyInformationFrame() {
        dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "deleted");}

    @Then("User should see succesfully error message")
    public void userShouldSeeSuccesfullyErrorMessage() {
        dc.verifyContainsTextFunction(dc.getWebElement("alreadyExists"), "already exists.");
    }

    @Then("User should see succesfully create message")
    public void userShouldSeeSuccesfullyCreateMessage() {dc.verifyContainsTextFunction(dc.getWebElement("successMsg"), "created");

    }
}


