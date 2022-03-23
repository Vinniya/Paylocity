package runner;

public class TestRunner {

	@Runwith(cucumber.class)
	@cucumberoptions(
			features = "Features",
			glue = "StepDefinition",
			plugin=("html:target/cucumber-html-report"))
	
	
}
