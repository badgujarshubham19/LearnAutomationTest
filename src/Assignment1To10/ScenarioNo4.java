package Assignment1To10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("gh-ac"));
		Thread.sleep(1000);
		searchbox.sendKeys("Apple Watch");
		
		WebElement clickbtn  = driver.findElement(By.id("gh-btn"));
		clickbtn.click();
		
		System.out.println("+++++++++++++print search result++++++++++++++");
		String resultsearch = driver.findElement(By.xpath("//h1[contains(text(),'+ results for ')]")).getText();
		System.out.println(resultsearch);
		
		System.out.println("+++++++++++++pprint10th product++++++++++++++");
		String product10 = driver.findElement(By.xpath("//div[@id='srp-river-results']/ul/li[10]")).getText();
		System.out.println(product10);
		
		System.out.println("+++++++++++++pprint10th product++++++++++++++");
		String allpageproduct = driver.findElement(By.xpath("//div[@id='srp-river-results']")).getText();
		System.out.println(allpageproduct);
		
		
	}


}
