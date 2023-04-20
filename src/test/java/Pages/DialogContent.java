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

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'CODE')]/input")
    private WebElement integCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']//button")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='hot-toast-bar-base']")
    private WebElement successMsg;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']//button")
    private WebElement deleteImageBtn;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;

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

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;

    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-3']//input")
    private WebElement integrationCod;

    @FindBy(xpath = "//span[text()='Active']")
    private WebElement activeButton;

    @FindBy(xpath = "//div[contains(text(),'already exists.')]")
    private WebElement alreadyExists;

    @FindBy(xpath = "//*[text()='Mentor']")
    public WebElement mentor;
    @FindBy(xpath = "//*[text()='The Position Category with Name \"Mentor\" already exists.']")
    public WebElement alreadyExistsMsg;
    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-0']//input")
    private WebElement descriptionSearch;

    @FindBy(xpath = "//*[@data-icon='square-xmark']")
    private WebElement closeMarkDiscounts;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement thereISNoDate;

    @FindBy(xpath = "//div[contains(text(),'already Department')]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//*[@data-icon='pen-to-square'])[1]")
    private WebElement editButtonAttestations;
    @FindBy(xpath ="//mat-select[@formcontrolname='attachmentStages']")    //
    private WebElement stage;

    @FindBy(xpath = "(//*[@data-icon='trash-can'])[1]")
    private WebElement deleteImageBtnAttestations;

    @FindBy(xpath = "//mat-error[contains(text(),'left blank!')]")
    private WebElement leftblank;
    @FindBy(xpath = "//mat-form-field[@appearance='outline']//textarea")  //
    private WebElement documentDescription;


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
            case "userName":return userName;
            case "password":return password;
            case "loginButton":return loginButton;
            case "txtTechnoStudy":return txtTechnoStudy;
            case "addButton":return addButton;
            case "nameInput":return nameInput;
            case "currencyInput":return currencyInput;
            case "ibanInput":return ibanInput;
            case "integCodeInput":return integCodeInput;
            case "successMsg":return successMsg;
            case "saveButton":return saveButton;
            case "searchButton":return searchButton;
            case "searchInput":return searchInput;
            case "description" : return description;
            case "integrationCod" : return integrationCod;
            case "priority" : return priority;
            case "shortName": return shortName;
            case "orderAdd" : return orderAdd;
            case "nextPage" : return nextPage;
            case "diyezClick" : return diyezClick;
            case "editButton" : return editButton;
            case "deleteImageBtn" : return deleteImageBtn;
            case "deleteDialogBtn" : return deleteDialogBtn;

            case "activeButton" : return activeButton;
            case "alreadyExists" : return alreadyExists;
            case "descriptionSearch" : return descriptionSearch;
            case "closeMarkDiscounts" : return closeMarkDiscounts;

            case "codeInput" : return integCodeInput;
            case "editButtonAttestations" : return editButtonAttestations;
            case "deleteImageBtnAttestations" : return deleteImageBtnAttestations;
            case "leftblank":return leftblank;
            case "activeButton" : return activeButton;
            case "alreadyExists" : return alreadyExists;
            case "thereISNoDate": return thereISNoDate;
            case "stage": return stage;
            case "documentDescription": return documentDescription;

        }
        return null;
    }



}
