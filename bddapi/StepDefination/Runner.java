package bddapi.StepDefination;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/bddapi.features",
        glue = "bddapi.StepDefinitions",
        tags = "@smoke"
)
public class Runner {

}
