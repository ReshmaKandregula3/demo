package toolsQa.Stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/resources/featureFiles"),
        glue={"toolsQa.Stepdef"},
//        tags=" @Regression",
        plugin = {"pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/report.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class DemoQaRunner {

}
//cucumber.publish.quiet=true
