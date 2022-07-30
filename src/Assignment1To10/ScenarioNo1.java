package Assignment1To10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScenarioNo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		WebElement loginid=driver.findElement(By.id("identifierId"));
		loginid.sendKeys("badgujarshubham19@gmail.com");
		WebElement nextbtn = driver.findElement(By.id("identifierNext"));
		nextbtn.click();
	}

}
