package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "")
    private WebElement xxxx;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResourcesLeftNav;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement SetupAtHumanResources;
    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategoriesAtHR;


    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "humanResourcesLeftNav":
                return humanResourcesLeftNav;
            case "SetupAtHumanResources":
                return SetupAtHumanResources;
            case "positionCategoriesAtHR":
                return positionCategoriesAtHR;

        }
        return null;
    }


}
