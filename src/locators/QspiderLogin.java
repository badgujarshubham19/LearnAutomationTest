package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 for (int i=0; i<5; i++)
		 {
		 
		 driver.get("https://online.qspiders.com/user");
		 
		 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div/div/span/form/div/div[1]/span/input")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div/div/span/form/div/div[2]/div/div/div[2]/span/input")).sendKeys("1234567890");
		 
		 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div/div/span/form/div/div[3]/button")).click();
		 }
		 

	}

}