package POM_PROJECT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class_Project {

	
	WebDriver driver;
	
	public void initialise_browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(UTILITY_CLASS_PROJECT.getdata("testsuiturl"));
	    
	}
	
}
