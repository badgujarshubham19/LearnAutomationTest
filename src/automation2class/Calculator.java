package automation2class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[.='/']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		String output = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(output);

	}

}
