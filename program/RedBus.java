package selenium.test.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\.eclipse\\SeleniumBrowserLaunch\\lib\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.redbus.in/ ");
WebElement fromWher=driver.findElement(By.xpath("//input[@id='src']"));

fromWher.sendKeys("chennai");
	
	WebElement fromTo=driver.findElement(By.xpath("//input[@id='dest']"));

	fromTo.sendKeys("mumbai");
	}
}
