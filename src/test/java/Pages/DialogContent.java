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

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement userName;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@data-icon='plus']")
    private WebElement addButtonDp;

    @FindBy(xpath = "//*[@data-placeholder='Name']")
    private WebElement nameInputDP;

    @FindBy(xpath = "//*[@data-placeholder='Code']")
    private WebElement codeInputDP;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButtonDP;

    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
    private WebElement editButtonDP;

    @FindBy(xpath = "(//*[@data-icon='trash-can'])[1]")
    private WebElement trashButtonDP;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteButtonDP;

    @FindBy(xpath = "//div[text()='School Department successfully deleted']")
    public WebElement deleteMassageDP;

    @FindBy(xpath = "//div [text()=' # ']")
    private WebElement sortDP;

    @FindBy(xpath = "//*[@data-icon='plus']")
    private WebElement addSchoolDp;




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

    public WebElement getWebElement(String strbutton) {
        switch (strbutton) {
            case "userName":
                return userName;
            case "password":
                return password;
            case "loginButton":
                return loginButton;
            case "addButtonDp":
                return addButtonDp;
            case "codeInputDP":
                return codeInputDP;
            case "nameInputDP":
                return nameInputDP;
            case "saveButtonDP":
                return saveButtonDP;
            case "editButtonDP":
                return  editButtonDP;
            case "trashButtonDP":
                return  trashButtonDP;
            case "deleteMassageDP":
                return  deleteMassageDP;
            case "sortDP":
                return  sortDP;
            case "addSchoolDp":
                return   addSchoolDp;
            case "deleteButtonDP":
                return   deleteButtonDP;


        }
        return null;
    }


}
