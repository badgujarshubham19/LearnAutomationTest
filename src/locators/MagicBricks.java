package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagicBricks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 
		 driver.get("https://accounts.magicbricks.com/userauth/login");
		 
		 driver.findElement(By.xpath("//input[@id='emailOrMobile']")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.xpath("")).sendKeys("1234567890");
		 
		 driver.findElement(By.xpath("//*[@id=\"btnStep1\"]")).click();
		
		 

	}

}