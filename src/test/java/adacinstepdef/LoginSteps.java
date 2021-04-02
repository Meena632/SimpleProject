package adacinstepdef;



import org.junit.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pojo.LoginPagePojo;


public class LoginSteps {
	
	LoginPagePojo p; 
	
	@Given("User Launch the browser")
	public void user_Launch_the_browser() {
	    BaseClass.getDriver();
	    BaseClass.launchUrl("http://www.adactin.com/HotelApp/");
	}
	@When("User enters the username")
	public void user_enters_the_username() {
	 p=new LoginPagePojo();
	 BaseClass.InsertKeys(p.getTxtUserName(), "Meenatchi");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		p=new LoginPagePojo();
		 BaseClass.InsertKeys(p.getTxtPassword(),"12345");
	    
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		 p=new LoginPagePojo();
		 BaseClass.click(p.getBtnClick());
	}
	

	@Then("User validate the Login failure page")
	public void user_validate_the_Login_failure_page() {
	String currentUrl=BaseClass.getCurrentUrl();
	 Assert.assertFalse("User not navigated to current url page",currentUrl.contains("submit"));
	  BaseClass.quitBrowse();
	   
	}


	
}
