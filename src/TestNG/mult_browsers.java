package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mult_browsers {

	
	
	@Test
	public void EDGE()
	{
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver=new EdgeDriver();
		  Reporter.log("This is Edge Driver Running", true);
	      driver.get("http:www.google.com");
		  
		  
	}
	
	@Test
	public void CHROME()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Reporter.log("THIS IS CHROME BROWSER RUNNING", true);
		 driver.get("https:www.facebook.com");
	}
	
	
	
}
