package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Readconfig;


public class LoginPage {
	WebDriver driver = new ChromeDriver();
	WebElement username_id = driver.findElement(By.id("Username"));
	WebElement password = driver.findElement(By.id("Password"));
	WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log In']"));
	WebElement dashboardTitle = driver.findElement(By.xpath("//a[text()='Paylocity Benefits Dashboard']"));
	
	Readconfig config = new Readconfig();
	private String baseURL = config.getApplicationURL();
	private String usernameFromConfig = config.getUsername();
	private String passwordFromConfig = config.getPassword();
			
	String title = "Paylocity Benefits Dashboard";
	boolean result = false;
	
	
public void getUrl() {
	driver.get(baseURL);
}
   public String enterCredentials() {
	   username_id.sendkeys(usernameFromConfig);
	   password.sendkeys(passwordFromConfig);
   }
 
   public boolean clickLoginButton() {
	   try {
		   loginButton.click();
		   return true;
	   } catch (Exception e) {
		   return false;
	   }
	  
   }
   public boolean getDashboardTitle() {
	   if(dashboardTitle.getText() == title)
		   result = true;
	   return result;
   }

}
