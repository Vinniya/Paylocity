package StepDefinition;
import  PageObjects.LoginPage;

public class LoginSteps {
	LoginPage loginpage;
	
	String title = "Paylocity Benefits Dashboard";	
	loginpage = new LoginPage();
	
/*	@Given("user is on login page")
	public void verify_login_page() {
		 loginpage = new LoginPage();
		 env = new EnvironmentVariables();
		 
		
		String titlefrom_ui =  loginpage.login_into_paylocity(env.username, env.password);
		Assert.assertEquals(title, titlefrom_ui);
	}*/
	
	
	@Given("user is on login page")
	public void verify_login_page() {
		loginpage.getUrl();
	}
	
	@When("user enters username and password")
	public void enter_credentials() {
		loginpage.enterCredentials();
		
	}
	@And("click on login button")
	public void loginButton() {
		Assert.assertTrue(loginpage.clickLoginButton());
	}
	@Then("user is navigated to the paylocity benefits dashboard page")
	public void verifyLoggedInPage() {
		Assert.assertTrue(loginpage.getDashboardTitle());
	}
}