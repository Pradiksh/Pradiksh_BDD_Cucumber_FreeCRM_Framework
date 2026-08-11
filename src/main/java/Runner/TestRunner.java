package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
//
//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("Features")
//@ConfigurationParameter(
//        key = GLUE_PROPERTY_NAME,
//        value = "StepDefinitions"
//)
//@ConfigurationParameter(
//        key = PLUGIN_PROPERTY_NAME,
//        value = "pretty, html:target/cucumber.html"
//)

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Pradiksh Soman\\IdeaProjects\\Pradiksh_BDD_CucumberProject\\src\\main\\java\\Features"
        ,glue={"StepDefenitions"}
        ,plugin = {"pretty","html:target/cucumber.html","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
        ,dryRun = false
       // ,strict = true now its removed from cucumber as new cucumber behaves strict by default
        ,monochrome=true//display console output in proper format but in new gen its handled already
        ,  publish = true
)
public class TestRunner {

}
