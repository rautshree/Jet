package Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anno {
	@BeforeMethod
	public void TC1()
	{
		//System.out.println("Test Case Running");
		Reporter.log("TC1 RUNNING", true);
	}
    
   @BeforeClass	
	public void TC2()
	{
		//System.out.println("Test Case Running");
		Reporter.log("TC2 RUNNING", true);
	}

	
	@Test
	public void TC3()
	{
		//System.out.println("Test Case Running");
		Reporter.log("TC3 RUNNING", true);
	}

	@AfterMethod
	public void TC4()
	{
		//System.out.println("Test Case Running");
		Reporter.log("TC4 RUNNING", true);
	}

}
