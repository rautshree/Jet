package TestNG_NEW;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import BASE_UTILITY.Utility_Class;
import BASE_UTILITY_SCREENSHOT_PROPERTY.Utility_Class1;

public class Listners_1 {

	
	
	 WebDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    driver=new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rautbhagyashree17@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Capgemini1771993@");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Test
	public void TC1()
	{
		 int TCID;
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	    String expectedurl = "https://ww.facebook.com/";
	    Assert.assertEquals(actualurl, expectedurl);
	  
	}
	
//	@AfterMethod
//	public void verificationpass(ITestResult result) throws IOException
//	{   if(result.getStatus()==ITestResult.SUCCESS)
//		Utility_Class1.capturescreenshot(driver, 101);
//	    System.out.println("Test Pass");
//	}
	@AfterMethod
	public void verificationfail(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		Utility_Class1.capturescreenshot(driver, 102);
			
	   System.out.println("Test Fail");
      
	}
	
	
}
