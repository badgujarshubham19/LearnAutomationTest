package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLIstView{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='xtXmba']"));

		for (int i=0;  i<list1.size(); i++)
		{
			WebElement list2=list1.get(i);
			String textlist=list2.getText();
			System.out.println(textlist);
		}
	}

}


//div[@class='xtXmba']
//div[@class='xtXmba']/ancestor::div[@class='_37M3Pb']

