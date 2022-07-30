package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandipidCase2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 for (int i=0; i<5; i++)
		 {
		 driver.get("https://sandiperp.com/StudentLogin.aspx");
		 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("Admin@gmail.com");
		 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("1234567890");
		 
		 driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]")).click();
		
		 }

	}

}