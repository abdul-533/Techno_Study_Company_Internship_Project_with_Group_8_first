package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _SubjectClickSteps  {

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();


    @io.cucumber.java.en.And("Click on the element in Edication")
    public void clickOnTheElementInLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton);
            ln.clickFunction(element);
        }
    }


    @io.cucumber.java.en.And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {

            WebElement element = dc.getWebElement(strButton);
            dc.clickFunction(element);
        }
    }

    @io.cucumber.java.en.And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent() {
    }

    @io.cucumber.java.en.Then("Already Exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
    }

    @io.cucumber.java.en.And("User edit item on Dialog Content")
    public void userEditItemOnDialogContent() {
    }

    @io.cucumber.java.en.And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent() {
    }

    @io.cucumber.java.en.Then("No data message should be displayed")
    public void noDataMessageShouldBeDisplayed() {
    }
}
