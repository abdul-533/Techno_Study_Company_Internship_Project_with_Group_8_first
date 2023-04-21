package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class GSP_13_A_A_NationalitiesSteps {
    DialogContent dc = new DialogContent();

    @And("Enter required informations")
    public void enterRequiredInformations(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            dc.sendKeysFunction(dc.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
    }

    @And("Click to edit button and change name")
    public void clickToEditButtonAndChangeName(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dc.editItem(items.get(i).get(0), items.get(i).get(1));

        }


    }
}
