package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        //dryRun = true
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _01_All_Tests_Runners extends AbstractTestNGCucumberTests {
//    @BeforeClass(alwaysRun = true)               (we use this stage for parallel testing)
//    @Parameters("browserType")
//    public void beforeClass(String browser) {
//        GWD.threadBrowserSet(browser);
//
//    }
}
