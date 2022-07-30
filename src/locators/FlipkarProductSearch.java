package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkarProductSearch{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();


		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbox.sendKeys("Hp laptops");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Brand'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='HP']")).click();
		Thread.sleep(2000);
		String productprice = driver.findElement(By.xpath("		//div[.='HP Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-du3517TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		Thread.sleep(2000);
		System.out.println("1st product price-->"  +productprice);
		
		//div[.='HP Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-du3517TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']

		
	}
}

