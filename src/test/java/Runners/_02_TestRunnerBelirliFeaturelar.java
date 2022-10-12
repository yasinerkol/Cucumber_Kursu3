package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"},
        dryRun = false //true olduğunda testi çalıştırmaz  sadece featurelara ait steplerin varlığını kontrol ediyor
                      // false olduğunda testi çalıştırır


)
public class _02_TestRunnerBelirliFeaturelar extends AbstractTestNGCucumberTests {
}
