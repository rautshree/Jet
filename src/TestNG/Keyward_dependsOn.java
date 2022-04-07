package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyward_dependsOn {

	@Test

	public void  TC1()
	{

		Assert.fail();
		Reporter.log("Test Case1 iS Running", true);
	}

	@Test(dependsOnGroups = {"TC1"})
	
	
	public void  TC2()
	{
		Reporter.log("Logout");
    }
}