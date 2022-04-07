package TestNG_NEW;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("BEFORE CLASS IS RUNNING" ,true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("AFTER CLASS IS RUNNING" ,true);
	}	
	
	@BeforeMethod
	public void beforetest()
	{
		Reporter.log("BEFORE METHOD IS RUNNING" ,true);
	}
	@AfterMethod
	public void aftertest()
	{
		Reporter.log("AFTER METHOD IS RUNNING" ,true);
	}
	
	@Test
	public void TC1()
	{
		System.out.println("TC RUINNING");
	}

}
