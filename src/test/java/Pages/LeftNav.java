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








    public WebElement getWebElement(String strbutton) {

        switch (strbutton) {
            case "setup":
                return setup;
            case "schoolSetup":
                return schoolSetup;
            case "departments":
                return departments;


        }
        return null;
    }


}
