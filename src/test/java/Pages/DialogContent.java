package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    private WebElement ibanInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    private WebElement currencyInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement integCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']//button")
    private WebElement editButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMsg;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']//button")
    private WebElement deleteImageBtn;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-edit-button[@table='true']//button")
    private WebElement kuEditButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement kuDelete;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priority;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    private WebElement orderAdd;

    @FindBy(xpath = "(//button[@aria-label='Next Page'])[1]")
    private WebElement nextPage;

    @FindBy(xpath = "//div[@role='button']")
    private WebElement diyezClick;

    @FindBy(xpath = "//ms-delete-button[@table='true']")
    public WebElement msgDeleteButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']")
    private WebElement description;
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


    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-3']")
    private WebElement integrationCod;

    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }


    public void editItem(String searchText, String newName) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        clickFunction(editButton);
        sendKeysFunction(nameInput, newName);
        clickFunction(saveButton);
    }

    public WebElement getWebElement(String button) {
        switch (button) {
            case "userName":
                return userName;
            case "password":
                return password;
            case "loginButton":
                return loginButton;
            case "txtTechnoStudy":
                return txtTechnoStudy;
            case "addButton":
                return addButton;
            case "nameInput":
                return nameInput;
            case "currencyInput":
                return currencyInput;
            case "ibanInput":
                return ibanInput;
            case "integCodeInput":
                return integCodeInput;
            case "successMsg":
                return successMsg;
            case "saveButton":
                return saveButton;
            case "searchInput":return searchInput;
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

            case "description" : return description;
            case "integrationCod" : return integrationCod;
            case "priority" : return priority;
            case "shortName": return shortName;
            case "orderAdd" : return orderAdd;
            case "nextPage" : return nextPage;
            case "diyezClick" : return diyezClick;
            case "kuEditButton" : return kuEditButton;
            case "msgDeleteButton" : return msgDeleteButton;
            case "kuDelete"   : return kuDelete;
        }
        return null;
    }


}
