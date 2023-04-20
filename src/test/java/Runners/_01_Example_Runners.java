package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Cagla",
        features = {"src/test/java/FeatureFiles"

        },
        glue = {"StepDefinitions"},
        //dryRun = true
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _01_Example_Runners extends AbstractTestNGCucumberTests {
}
