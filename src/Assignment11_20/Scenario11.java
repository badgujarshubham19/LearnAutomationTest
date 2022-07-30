package Assignment11_20;

import java.awt.desktop.QuitEvent;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	driver.get("https://www.bluestone.com");
	driver.manage().window().maximize();
	
	WebElement denybtn = driver.findElement(By.id("denyBtn"));
	denybtn.click();
	Thread.sleep(2000);
	WebElement target1 = driver.findElement(By.xpath("//span[@data-p='offers,m']"));
	Actions act = new Actions(driver);
	act.moveToElement(target1).perform();
	Thread.sleep(2000);
	WebElement target2 = driver.findElement(By.xpath("//span[contains(text(),'Upto 50% Off on Making Charges')]"));
	act.moveToElement(target2).click().perform();
	
	Thread.sleep(5000);
	driver.close();
	
	

}
}






