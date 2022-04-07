package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Parallel_Tests {
	public class Parallel_1 {
		public void kite() throws InterruptedException
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver browser=new ChromeDriver();
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    browser.get("https://kite.zerodha.com/");
	    //Enter UN
	    browser.findElement(By.xpath("//input[@type='text']")).sendKeys("THM944");
	    Thread.sleep(3000);
	    //PASSWORD
	    browser.findElement(By.xpath("//input[@type='password']")).sendKeys("Bisen@7566");
	    Thread.sleep(2000);
	    //SUBMIT
	    browser.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	    browser.close();

		}
		@Test
		public void facebook()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver browser=new ChromeDriver();
		    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    browser.get("https://www.facebook.com/");
		    
		}
}
}
