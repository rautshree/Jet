package TestNG_NEW;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups {
	

	@Test(dependsOnGroups = "loginn")
	public void openbrowser1()
	{  //Assert.fail();
		Reporter.log("TC1 IS RUNNING", true);
	}
	@Test(groups = "loginn")
	public void login1()
	{   //Assert.fail();
		Reporter.log("login is RUNNING", true);
	}
	@Test(groups = "loginn")
	public void TC31()
	{
		Reporter.log("TC3 IS RUNNING", true);
	}
	

}
