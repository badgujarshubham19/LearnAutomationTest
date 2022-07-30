package robotkeys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads");
		Thread.sleep(2000);
		Robot robo = new Robot();
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_P);
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 robo.keyRelease(KeyEvent.VK_P);
		 Thread.sleep(2000);
		 robo.keyPress(KeyEvent.VK_TAB);
		 robo.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 robo.keyPress(KeyEvent.VK_ENTER);
		 robo.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
