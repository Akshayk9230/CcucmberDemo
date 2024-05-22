package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\featuresFolder", // Path to your feature files
		glue = "stepDefinitions", // Package where your step definitions are located
		plugin = {"pretty", 
				"html:target/cucumber-reports/report.html","junit:target/junit_reports/report.xml"},// to publish the reports in desired format
		dryRun = false,//to check whether mapping is proper between feature file and step definition
		// monochrome = false,// to print the out put in a pretty format
		//  tags="@Smoke or @Regression",
		publish = false // we can get reports published into a cucumber cloud
		)
public class Runner1 {	
}
