
	package stepdefination;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class LoginPageSteps {
	 WebDriver driver;
		@Given("User Launch the browser")
		public void user_Launch_the_browser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\.eclipse\\cucumber_Launch\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		}
		@When("User enters the username and password")
		public void user_enters_the_username_and_password() {
		 driver.findElement(By.id("email")).sendKeys("Greens");
		 driver.findElement(By.id("pass")).sendKeys("meenu123");
		 
		}

		@And("User Clicks the login button")
		public void user_Clicks_the_login_button() {
			driver.findElement(By.name("login")).click();
			
		}

		@Then("User validate the Login failure page")
		public void user_validate_the_Login_failure_page() throws InterruptedException {
		  Thread.sleep(2000);  
		  String currentUrl=driver.getCurrentUrl();
		  Assert.assertTrue("User not navigated to current url page",currentUrl.contains("login"));
		  
		  }
	}

