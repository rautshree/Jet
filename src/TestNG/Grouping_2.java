package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_2 {
	@Test(groups = "login")
	public void m1()
	{
		Reporter.log("Skipped", true);
	}
	@Test(groups = "login")
	public void m2()
	{   //Assert.fail();
		Reporter.log("Run", true);
	}
	@Test(groups = "home")
	public void m7()
	{
		Reporter.log("Run", true);
	}
	@Test(groups = "profile")
	public void m4()
	{
		Reporter.log("Skipped", true);
	}

}
