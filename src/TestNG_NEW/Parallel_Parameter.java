package TestNG_NEW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestNG.browser;

public class Parallel_Parameter {
    @Parameters("browsername")
	@Test
	public void parallel(String browsername)
	{
		WebDriver driver=null;
		
		if(browsername.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
    	
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    driver=new EdgeDriver();
		}
    	
	}
	/*
	 * @Parameters("env")
	 * 
	 * @Test public void environment(String env) { if(env.equals("SIT"))
	 * Reporter.log("SIT IS RUNNING");
	 * 
	 * }
	 * 
	 * @Parameters("version")
	 * 
	 * @Test public void buildversion(String version) {
	 * 
	 * Reporter.log("1st version running"); }
	 */
	
	
	
}
