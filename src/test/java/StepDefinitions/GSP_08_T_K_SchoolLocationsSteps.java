package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GSP_08_T_K_SchoolLocationsSteps {
    DialogContent dc = new DialogContent();

    @And("Click edit button and change name")
    public void clickEditButtonAndChangeName(DataTable dt) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < dc.noSearchButtonForName.size(); j++) {
                if (dc.noSearchButtonForName.get(j).getAccessibleName().contains(items.get(i).get(0))) {
                    dc.clickFunction(dc.noSearchButtonForName.get(j));
                    dc.sendKeysFunction(dc.getWebElement("nameInput"), items.get(i).get(1));

                }
            }
        }
    }

    @And("Click delete button")
    public void clickDeleteButton(DataTable dt) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < dc.noSearchButtonForName.size(); j++) {
                if (dc.noSearchButtonForName.get(j).getAccessibleName().contains(items.get(i).get(0))) {
                    dc.scrollToElement(dc.NoDeleteButtonsForName.get(j));
                    dc.clickFunction(dc.NoDeleteButtonsForName.get(j));
                    dc.clickFunction(dc.getWebElement("deleteDialogBtn"));
                }
            }
        }
    }

    @Then("There is no date with this name")
    public void thereIsNoDateWithThisName(DataTable dt) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        List<List<String>> items = dt.asLists(String.class);

        Boolean nodata = false;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < dc.noSearchButtonForName.size(); j++) {
                if (dc.noSearchButtonForName.get(j).getAccessibleName().contains(items.get(i).get(0))) {
                    dc.scrollToElement(dc.NoDeleteButtonsForName.get(j));
                    dc.clickFunction(dc.NoDeleteButtonsForName.get(j));
                    dc.clickFunction(dc.getWebElement("deleteDialogBtn"));
                } else {
                    nodata = true;
                }
            }
        }
        Assert.assertTrue(nodata, "This function isn't empty");

    }
}
