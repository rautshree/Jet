package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralle_2 {
	@Test
	public void facebook()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver browser=new ChromeDriver();
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    browser.get("https://www.facebook.com/");
	    
	}

}
