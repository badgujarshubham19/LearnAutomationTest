package Assignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class MyTimeTask extends TimerTask
{

    public void run()
    {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		
    }
}

public class FlipkartAddToCard {


	public static void main(String[] args) throws InterruptedException, ParseException {
		
		
		//the Date and time at which you want to execute
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date = dateFormatter .parse("2022-07-27 23:24:00");

	    //Now create the time and schedule it
	    Timer timer = new Timer();

	    //Use this if you want to execute it once
	    timer.schedule(new MyTimeTask(), date);

	}
	
}
