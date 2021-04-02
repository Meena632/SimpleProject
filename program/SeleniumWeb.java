package selenium.test.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloads\\chrome1\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement usernameTextBox=driver.findElement(By.id("email"));
usernameTextBox.sendKeys("Meenu");
WebElement passwordTextBox=driver.findElement(By.id("pass"));
passwordTextBox.sendKeys("12345");
driver.findElement(By.name("login")).click();

/*WebElement usernameTextBox=driver.findElement(By.name("email"));
usernameTextBox.sendKeys("Greens");
WebElement passwordTextBox=driver.findElement(By.name("pass"));
passwordTextBox.sendKeys("12345");
WebElement btnLogIN=driver.findElement(By.name("login"));
btnLogIN.click();
driver.close();


WebElement usernameTextBox=driver.findElement(By.xpath("//input[@class='inputtext _55r1 ']"));
usernameTextBox.sendKeys("Greens");
WebElement passwordTextBox=driver.findElement(By.name("pass"));
passwordTextBox.sendKeys("12345");
WebElement btnLogIN=driver.findElement(By.name("login"));
btnLogIN.click();
driver.close();*/

	}

}
