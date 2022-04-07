package POM_PROJECT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Output_Class extends Base_Class_Project {
	
	login_page1_Project page1;
	login_page2_Project page2;
	home_page3 page3;
	int TCID;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{  
	  initialise_browser();
	  page1=new login_page1_Project(driver);
	  page2=new login_page2_Project(driver);
	  page3=new home_page3(driver);
	}
	
	@BeforeMethod
	public void loginAPP() throws IOException, InterruptedException
	{   page1.loginid(UTILITY_CLASS_PROJECT.getdata("UN1"));
		//page1.loginid(UTILITY_CLASS_PROJECT.getdata("UN1"));
		page1.password(UTILITY_CLASS_PROJECT.getdata("PASSWORD"));
		page1.login();
		Thread.sleep(4000);
		page2.Pin(UTILITY_CLASS_PROJECT.getdata("PIN"));
		page2.contin();
	}
	
	@Test
	public void verifyuser() throws IOException
	{
		TCID=10;
		String actual = page3.getuserid();
		String expected_user_id = UTILITY_CLASS_PROJECT.getdata("PIN");
	    Assert.assertEquals(actual, expected_user_id, "Pass Case");	
	}
   @AfterMethod
	public void LogoutFromApp(ITestResult capture) throws IOException
	{
		if(capture.getStatus()==ITestResult.FAILURE)
		{
			UTILITY_CLASS_PROJECT.getscreenshot(driver, TCID);
		}
	}
		@AfterClass
		public void closebrowser() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.quit();
		}
	}
	
	
	
	
	


