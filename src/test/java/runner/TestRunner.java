package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@release",
        plugin = {"json:test/report/cucumber_report.json"}
)

public class TestRunner {

}
