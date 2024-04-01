package sample.test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ATest {
	WebDriver driver;
	@Test
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saaniya\\Downloads\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement p=driver.findElement(By.name("q"));
		p.sendKeys("Cat");
		p.submit();
		
	}
}