package Org.FaceBook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\resources",
//		glue = {"Org.FaceBook","com.fb.locators","com.fb.baseclass"},
		glue = "Org.FaceBook",
		tags = "@examplekey",
		plugin = {"html:target/index.html","json:target/reports.json"},
		dryRun = false,
		monochrome = true		
		)

public class TestRunner 

{

}
