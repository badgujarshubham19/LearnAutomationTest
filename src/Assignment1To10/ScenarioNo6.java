package Assignment1To10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo6  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep (4000);
		WebElement target = driver.findElement(By.xpath("//a[@title='Rings']/ancestor::li[@class='menuparent repb']"));
		Actions act = new  Actions(driver);
		act.moveToElement(target).perform();
		WebElement target2 = driver.findElement(By.xpath("//a[@title='Diamond Rings'][normalize-space()='Diamond']"));
		act.moveToElement(target2).click().perform();
		WebElement target3 = driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"));
		act.moveToElement(target3).perform();
		WebElement target4 = driver.findElement(By.xpath("//a[.='Price Low to High ']"));
		act.moveToElement(target4).click().perform();


	}
}
