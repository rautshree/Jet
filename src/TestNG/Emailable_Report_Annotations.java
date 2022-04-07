package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Emailable_Report_Annotations {
	
	@BeforeClass
	
	public void openapp()
	{
		Reporter.log("OpenApp", true);
	}
	
    @AfterClass
	public void closeapp()
	{
		Reporter.log("CloseApp", true);
	}
	@BeforeMethod
	
	public void login()
	{
		Reporter.log("Preparation",true);
	}

	@Test
	public void TC1()

	{
		System.out.println("Running Test Case 1");
	}
	@Test
	public void TC2()
	{
      Reporter.log("Test 2 Running",true);
	}
	@Test
	public void TC3()
	{
      Reporter.log("Test 3 Running",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("After Running",true);
	}
	
}
