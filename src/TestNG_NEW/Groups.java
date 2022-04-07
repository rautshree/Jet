package TestNG_NEW;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	

	@Test(groups = "login")
	public void openbrowser()
	{  
		Reporter.log("TC1 IS RUNNING", true);
	}
	@Test(groups = "login")
	public void login()
	{   
		Reporter.log("login is RUNNING", true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("TC3 IS RUNNING", true);
	}

}
