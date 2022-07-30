package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://phptravels.org/login");
		 
		 driver.findElement(By.id("inputEmail")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.id("inputPassword")).sendKeys("123");
		 
		 driver.findElement(By.id("login")).click();
		 
		 

	}

}