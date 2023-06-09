package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResourcesLeftNav;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupAtHumanResources;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement SetupAtAttestations;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategoriesAtHR;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "(//*[text()='Grade Levels'])[1]")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;


    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locations;
    @FindBy(xpath = "//a[@href='/entity-fields/list']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement edSetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;


    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":return setup;
            case "parameters":return parameters;
            case "bankAccounts":return bankAccounts;
            case "discounts":return discounts;
            case "gradeLevels" : return gradeLevels;
            case "humanResourcesLeftNav":return humanResourcesLeftNav;
            case "SetupAtHumanResources":return SetupAtHumanResources;
            case "positionCategoriesAtHR":return positionCategoriesAtHR;
            case "nationalities": return nationalities;
            case "SetupAtAttestations": return SetupAtAttestations;
            case "schoolSetup":return schoolSetup;
            case "departments":return departments;
            case "positions":return positions;
            case "documentTypes": return documentTypes;
            case "locations":return locations;
            case "fields":return fields;
            case "education":return education;
            case "edSetup":return edSetup;
            case "subjectCategories":return subjectCategories;
        }
        return null;
    }


}
