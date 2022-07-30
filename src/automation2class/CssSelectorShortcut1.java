package automation2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorShortcut1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/91942/OneDrive/Desktop/pankaj%20project/wpt%20project/signin.html");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[placeholder='Enter First Name']")).sendKeys("kunal");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Last Name']")).sendKeys("Dada");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("Adnin123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Password']")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Repeat Password']")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
//		Thread.sleep(2000);
	

		
		
		
		



	}
}
