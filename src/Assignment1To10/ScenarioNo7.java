package Assignment1To10;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
	
		WebElement target = driver.findElement(By.xpath("//a[@title='Jewellery']"));	
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		WebElement target2 = driver.findElement(By.xpath("//span[.='Kadas']"));
		act.moveToElement(target2).click().perform();

	}

}
