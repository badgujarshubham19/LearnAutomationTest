package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 
		 driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.id("passwd")).sendKeys("123");
		 
		 driver.findElement(By.id("SubmitLogin")).click();
		 
		 

	}

}