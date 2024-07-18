package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/sheeza/eclipse-workspace/cucumber1/src/test/java/feature/login.feature",glue={"StepDefination"}


)





public class RunnerTest {

}
