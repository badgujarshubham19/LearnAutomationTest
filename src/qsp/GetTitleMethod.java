package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://epaper.thehindu.com/");
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);
	

	}

}
