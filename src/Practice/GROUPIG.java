package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GROUPIG {
	
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("TC1 IS RUNNING", true);
	}
	@Test(groups = "login")
	public void TC2()
	{
		Reporter.log("TC2 IS RUNNING", true);
	}
	@Test(groups = "home")
	public void TC3()
	{
		Reporter.log("TC3 IS RUNNING", true);
	}
	@Test(groups = "home")
	public void TC4()
	{
		Reporter.log("TC4 IS RUNNING", true);
	}
	@Test(groups = "home")
	public void TC5()
	{
		Reporter.log("TC5 IS RUNNING", true);
	}

}
