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

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameMersys;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordMersys;

    @FindBy(xpath = "//*[text()=' LOGIN ']")
    private WebElement loginBtnMersys;

    @FindBy(xpath = "//*[@data-icon='plus']")
    private WebElement addBtnHR;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement nameBoxHR;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveBtnHR;
    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
    private WebElement editBtnHR;
    @FindBy(xpath = "(//*[@data-icon='trash-can'])[1]")
    private WebElement deleteBtnHR;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteBtnConfirmHR;
    @FindBy(xpath = "//div[text()='Position Category successfully deleted']")
    private WebElement deletedMessageHR;
    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement SearchBarHR;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement SearchBtnHR;




    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }

    public WebElement getWebElement(String button) {
        switch (button) {
            case "usernameMersys":
                return usernameMersys;
            case "passwordMersys":
                return passwordMersys;
            case "loginBtnMersys":
                return loginBtnMersys;
            case "addBtnHR":
                return addBtnHR;
            case "nameBoxHR":
                return nameBoxHR;
            case "SaveBtnHR":
                return SaveBtnHR;
            case "editBtnHR":
                return editBtnHR;
            case "deleteBtnHR":
                return deleteBtnHR;
            case "deleteBtnConfirmHR":
                return deleteBtnConfirmHR;
            case "deletedMessageHR":
                return deletedMessageHR;
            case "SearchBarHR":
                return SearchBarHR;
            case "SearchBtnHR":
                return SearchBtnHR;


        }
        return null;
    }


}
