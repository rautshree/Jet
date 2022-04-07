package TestNG_NEW;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_1 {
	@BeforeSuite
	public void beforesuit()
	
	{
		Reporter.log("Before Suite",true);
	}
	@AfterSuite
	public void aftersuit()
	
	{
		Reporter.log("After Suite",true);
	}
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("Before Test",true);
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("After Test",true);
	}
	
	@org.testng.annotations.BeforeClass
	public void beforeclass()
	{
		Reporter.log("Before Class",true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("After Test",true);
	}
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("Before Method",true);
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("After Method",true);
	}
	
	@Test
	public void TEST1()
	{
		Reporter.log("TEST CASE IS RUNNING",true);
	}
	
	@Test
	public void TEST2()
	{
		Reporter.log("TEST CASE2 IS RUNNING",true);
	}
	
	
	

}
