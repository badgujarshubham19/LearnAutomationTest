package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotM4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		//way4
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
     	File src = efw.getScreenshotAs(OutputType.FILE);
     	File dest=new File("./screenshots/selenium4.png");
     	Files.copy(src,dest);
		

	}

}
