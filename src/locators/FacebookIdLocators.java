package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIdLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.name("email")).sendKeys("Admin");
		 
		 driver.findElement(By.name("pass")).sendKeys("123");
		 
		 driver.findElement(By.name("login")).click();
		 
		 

	}

}