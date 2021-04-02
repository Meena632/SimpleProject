


	package selenium.test.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloads\\chrome1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement usernameTextBox=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	usernameTextBox.sendKeys("9585476884");
	Thread.sleep(2000);
	WebElement passwordTextBox=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
	passwordTextBox.sendKeys("9585476884");
	Thread.sleep(2000);
	WebElement btnLogIN=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
	btnLogIN.click();
	Thread.sleep(7000);
	

		}
		}
