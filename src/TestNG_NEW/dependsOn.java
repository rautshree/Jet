package TestNG_NEW;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOn {
	
	
	
	@Test
	public void openbrowser()
	{  Assert.fail();
		Reporter.log("TC1 IS RUNNING", true);
	}
	@Test
	public void login()
	{   Assert.fail();
		Reporter.log("login is RUNNING", true);
	}
	@Test(dependsOnMethods = "openbrowser")
	public void TC3()
	{
		Reporter.log("TC3 IS RUNNING", true);
	}

}
