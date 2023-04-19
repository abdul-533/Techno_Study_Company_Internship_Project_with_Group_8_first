package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Add_Edit_DeleteDiscountsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

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


    }

    @Then("Click to edit button and change name discounts")
    public void clickToEditButtonAndChangeNameDiscounts(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.editItem("TechnoStudyGR8", items.get(i).get(1));
        }
    }

    @Then("Click to delete button Discounts")
    public void clickToDeleteButtonDiscounts(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strDeleteText : strButtons) {

            dc.deleteItem(strDeleteText);
        }
    }
}