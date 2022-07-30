package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectPage {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		Actions rightbttn = new Actions(driver);
		rightbttn.contextClick().perform();
		Thread.sleep(3000);
		Robot pagedwn= new Robot();
		for (int i=0;i<10;i++)
		{
			pagedwn.keyPress(KeyEvent.VK_DOWN);
			pagedwn.keyRelease(KeyEvent.VK_DOWN);
			//			
			//						
		}
		Thread.sleep(3000);
		pagedwn.keyPress(KeyEvent.VK_ENTER);
		pagedwn.keyRelease(KeyEvent.VK_ENTER);



	}
}


