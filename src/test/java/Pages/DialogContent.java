package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

//POM: Page Object Model
public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "")
    private WebElement xxxx;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']") // locatorlarina bakiniz!
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")// locatorlarina bakiniz!
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")// locatorlarina bakiniz!
    private WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")// locatorlarina bakiniz!
    private WebElement deleteDialogBtn;


    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }

    public WebElement getWebElement(String button) {
        switch (button) {
            case "xxxx":
                return xxxx;

        }
        return null;
    }


}
