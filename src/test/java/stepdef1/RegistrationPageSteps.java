package stepdef1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps {
	 WebDriver driver;
		@Given("User Launch the browser")
		public void user_Launch_the_browser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\.eclipse\\cucumber_Launch\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-form");
				  
		}		  
		  @When("User enters the fullname and Email")
		  public void user_enters_the_fullname_and_Email() {
			  driver.findElement(By.id("firstName")).sendKeys("Meenatchi");
				 driver.findElement(By.id("userEmail")).sendKeys("meenu123@com");
		  }
		

	@When("User enters the  current Address and permenant address")
	public void user_enters_the_current_Address_and_permenant_address() {
		driver.findElement(By.id("currentAddress")).sendKeys("Greens, main road thuraipakkam");
		 driver.findElement(By.id("permanentAddress")).sendKeys("Greens, main road thuraipakkam, chennai");
		 }
		
		

	@When("User Clicks the submit button")
	public void user_Clicks_the_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("User validate the submit failure page")
	public void user_validate_the_submit_failure_page() throws InterruptedException {
		 Thread.sleep(2000);  
		  String currentUrl=driver.getCurrentUrl();
		  Assert.assertFalse("User not navigated to current url page",currentUrl.contains("submit"));
		  
	   
	}


}
