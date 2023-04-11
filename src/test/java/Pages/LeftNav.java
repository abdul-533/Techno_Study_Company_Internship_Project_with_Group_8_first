package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//fuse-nav-vertical-collapsable[@class='ng-tns-c106-7 nav-collapsable nav-item ng-star-inserted']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//*[@data-icon='plus']")
    private WebElement addSchoolDp;

    @FindBy(xpath = "//*[@data-placeholder='Name']")
    private WebElement inputName;
    @FindBy(xpath = "//*[@data-placeholder='Code']")
    private WebElement codeName;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveButton;




    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "schoolSetup":
                return schoolSetup;
            case "departments":
                return departments;
            case "addSchoolDp":
                return addSchoolDp;
            case "inputName":
                return inputName;
            case "codeName":
                return codeName;
            case "saveButton":
                return saveButton;

        }
        return null;
    }


}
