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

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupK;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResourcesLeftNav;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupAtHumanResources;
    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategoriesAtHR;


    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "(//*[text()='Grade Levels'])[1]")
    private WebElement gradeLevels;

    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "bankAccounts":
                return bankAccounts;
            case "humanResourcesLeftNav":
                return humanResourcesLeftNav;
            case "SetupAtHumanResources":
                return SetupAtHumanResources;
            case "positionCategoriesAtHR":
                return positionCategoriesAtHR;
            case "discounts":
                return discounts;
            case "setupK" :
                return setupK;
            case "gradeLevels" : return gradeLevels;

        }
        return null;
    }


}
