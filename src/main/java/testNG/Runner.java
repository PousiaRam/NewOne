package testNG;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features="src\\test\\java\\feature\\login.feature", glue="steps", publish=true, monochrome=true)

public class Runner extends BaseClass {
	
	

}
