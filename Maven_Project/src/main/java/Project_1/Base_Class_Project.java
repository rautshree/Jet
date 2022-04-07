package Project_1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class_Project {

	
	public WebDriver driver;
	
	public void initialise_browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Maven_Project\\Browsers\\chromedriver.exe");		
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(UTILITY_CLASS_PROJECT.getdata("testsuiturl"));
	    
	}
	
}
