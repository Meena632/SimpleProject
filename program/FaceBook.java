package selenium.test.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloads\\chrome1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameTextBox=driver.findElement(By.id("email"));
		usernameTextBox.sendKeys("Meenu");
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		passwordTextBox.sendKeys("12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(100);
	}

}
