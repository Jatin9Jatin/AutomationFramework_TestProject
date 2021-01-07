package RunnerClass.TestCucumberRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "resources\\MyfeatureFile.feature"
        ,glue={"stepDefinition"}
)

public class Test_CucumberRunner {
}
