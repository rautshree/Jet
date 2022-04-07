package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grp1 {

	
	
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("TC 1 IS RUNNING", true);
	}
	@Test(groups = "login")
	public void TC2()
	{
		Reporter.log("TC 2 IS RUNNING", true);
	
	}
	@Test(groups = "home")
	public void TC3()
	{
		Reporter.log("TC 3 IS RUNNING", true);
	
	}
	
	
}
