package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grp {
	
	
	
	
	@Test(groups="login")
	public void log1()
	{
		Reporter.log("Group1 is running");
	}
	@Test(groups="login")
	public void log2()
	{
		Reporter.log("Group1 is running");
	}

	@Test(groups="login")
	public void log3()
	{
		Reporter.log("Group1 is running");
	}

	@Test(groups="login")
	public void log4()
	{
		Reporter.log("Group1 is running");
	}
	@Test(groups="home")
	public void home1()
	{
		Reporter.log("home1 is running");
	}

	@Test(groups="home")
	public void home2()
	{
		Reporter.log("home2 is running");
	}

	

	
	
	
	
	
	
	
	
	
	
}
