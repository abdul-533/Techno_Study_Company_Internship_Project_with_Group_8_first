package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span [text()='Setup']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResourcesLeftNav;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupAtHumanResources;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement SetupAtAttestations;








    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "schoolSetup":
                return schoolSetup;
            case "departments":
                return departments;
            case "humanResourcesLeftNav":
                return humanResourcesLeftNav;
            case "SetupAtHumanResources":
                return SetupAtHumanResources;
            case "SetupAtAttestations":
                return SetupAtAttestations;



        }
        return null;
    }


}
