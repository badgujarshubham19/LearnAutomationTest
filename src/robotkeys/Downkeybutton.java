package robotkeys;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Downkeybutton {

			public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/downloads");
			Thread.sleep(6000);
			//WebElement  src =driver.findElement(By.xpath("//h1 [@class='display-1 mt-0 mt-md-5 pb-1']"));
			Actions click = new Actions(driver);
			click.contextClick().perform();


	}

}
