package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, // tüm feature files ı çalıştırdı
        glue = {"StepDefinitions"}

)


public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
