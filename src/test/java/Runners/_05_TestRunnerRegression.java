package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@Regression or @SmokeTest",   // or olduğunda herhangi birisi varsa çalıştırır
                                              // and olduğunda ise her ikisinin de senaryoda
                                              // tag olarak olan senaryoları çalıştırır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}    //Browser tipi vermek için ve rapora ek parametre eklemek için sonra kullanacağız
