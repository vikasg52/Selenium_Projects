package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\santo\\eclipse-workspace\\Selenium_Projects\\CucucmberPOM\\src\\test\\java\\com\\qa\\features\\freecrm.feature", 
glue = {"com\\qa\\stepDefinitions" }, // the path of the step definition files
		monochrome = true, // display the console output in a proper readable format
		// strict = true, //it will check if any step is not defined in step definition
		// file
		dryRun = false // to check the mapping is proper between feature file and step def file
// tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)
public class MyTestRunner {
	

}
