package Assignment11_20;

import java.awt.desktop.QuitEvent;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();

		WebElement denybtn = driver.findElement(By.id("denyBtn"));
		denybtn.click();
		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.id("goldCoins"));
		Actions act = new Actions(driver);
		act.moveToElement(target1).perform();
		
		WebElement target2 = driver.findElement(By.xpath("//span[contains(text(),'Coins by Weight')]"));
		act.moveToElement(target2).click().perform();
		
		WebElement target3 = driver.findElement(By.xpath("//div[@class='filter 1gms']"));
		act.moveToElement(target3).click().perform();

		Thread.sleep(2000);
		driver.close();



	}
}


