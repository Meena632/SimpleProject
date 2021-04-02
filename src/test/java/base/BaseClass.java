package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\.eclipse\\cucumber_Launch\\lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  return driver;
		  
	}
	public static void launchUrl(String Url)
	{
		driver.get(Url);
	}
	public static String getCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public static void getTitle()
	{
	driver.getTitle();
	
	}
	
	public static void quitBrowse()
	{
		driver.close();
	}
	public static void InsertKeys(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	public static void click(WebElement ele)
	{
		ele.click();
	}
	public static void main(String[] args) {
		
	}
	

}
