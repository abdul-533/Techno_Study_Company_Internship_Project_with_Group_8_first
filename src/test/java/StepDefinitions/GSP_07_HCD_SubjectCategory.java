package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class GSP_07_HCD_SubjectCategory {
    DialogContent dg = new DialogContent();

    @And("sending new category")
    public void sendingNewCategory(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dg.sendKeysFunction(dg.getWebElement(items.get(i).get(0)), items.get(i).get(1));

        }
        dg.clickFunction(dg.getWebElement("emptyclick"));


    }


//input[@id='mat-slide-toggle-1-input']
    //input[@id='mat-slide-toggle-14-input']

    @And("subject category new update")
    public void subjectCategoryNewUpdate(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            dg.sendKeysFunction(dg.getWebElement(items.get(i).get(0)), items.get(i).get(1));
        }
    }
}
