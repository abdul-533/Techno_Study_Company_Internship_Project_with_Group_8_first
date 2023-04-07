package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void after(Scenario senaryo) {
        System.out.println("Senaryo bitdi");
        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",
                senaryo, GWD.threadBrowserGet());

        if (senaryo.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
            final byte[] jafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(jafizadakiHali, "image/png", "screenshot name");

        }

        GWD.quitDriver();

    }
}
