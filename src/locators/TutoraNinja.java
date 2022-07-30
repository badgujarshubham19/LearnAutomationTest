package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutoraNinja {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		 
		 driver.findElement(By.id("input-email")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.id("input-password")).sendKeys("123");
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		 
		 

	}

}