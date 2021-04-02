package hotelstepdep;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojo.LoginPagePojo;

public class LoginPageSteps  extends BaseClass{
	LoginPagePojo p;
	@Given("User Launch the browser")
	public void user_Launch_the_browser() {
		BaseClass.getDriver();
	    BaseClass.launchUrl("http://www.adactin.com/HotelApp/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) {
	   p=new LoginPagePojo();
	   List<Map<String,String>> asMaps=table.asMaps();
	   BaseClass.InsertKeys(p.getTxtUserName(),asMaps.get(0).get("userName"));
	   BaseClass.InsertKeys(p.getTxtPassword(),asMaps.get(0).get("password"));
	   
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		 p=new LoginPagePojo();
		 BaseClass.click(p.getBtnClick()); 
	}


	
	@When("User select the location")
	public void user_select_the_location() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id='location']")));
	   	s.selectByValue("London");
	       
	}

	@When("User select the hotel")
	public void user_select_the_hotel() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id='hotels']")));
		s.selectByValue("Hotel Creek"); 
	}

	@When("User select the roomtype")
	public void user_select_the_roomtype() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id='room_type']")));
	   	s.selectByValue("Double");  
	}

	@When("User select the no of rooms")
	public void user_select_the_no_of_rooms() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id='room_nos']")));
	   	s.selectByValue("3");  
	}

	//@When("User select the Check In Date")
	//public void user_select_the_Check_In_Date() {
//		Select s=new Select(driver.findElement(By.xpath("//input[@id='datepick_in']")));
//	   	s.selectByValue("01/04/2021"); 
//	}
//
//	@When("User select the Check Out Date")
//	public void user_select_the_Check_Out_Date() {
//		Select s=new Select(driver.findElement(By.xpath("//input[@id='datepick_out']")));
//		   	s.selectByValue("01/05/2021"); 
//	}

	@When("User select Adults per room")
	public void user_select_Adults_per_room() {
		Select s=new Select(driver.findElement(By.xpath("//*[@id='adult_room']")));
	   	s.selectByValue("2");
	}

	@When("User click the search Button")
	public void user_click_the_search_Button() {
		p=new LoginPagePojo();
		 BaseClass.click(p.getSearchClick());
		
	}

	@When("User select the radiobutton")
	public void user_select_the_radiobutton() {
		p=new LoginPagePojo();
		 BaseClass.click(p.getRadioButton());
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
		p=new LoginPagePojo();
		 BaseClass.click(p.getContinueClick());
		 
	}

	@When("User enters the firstname and lastname and address")
	public void user_enters_the_firstname_and_lastname_and_address() {
	    
	}

	@When("User enters the credit card no")
	public void user_enters_the_credit_card_no() {
	    
	}

	@When("User select the card type")
	public void user_select_the_card_type() {
	   
	}

	@When("User select card expiry date")
	public void user_select_card_expiry_date() {
	    
	}

	@When("User enter the CVV number")
	public void user_enter_the_CVV_number() {
	    
	}

	@When("user click the Booknow button")
	public void user_click_the_Booknow_button() {
	    
	}

	@Then("User validate Booking failure page")
	public void user_validate_Booking_failure_page() {

}}
