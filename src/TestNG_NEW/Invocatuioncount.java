package TestNG_NEW;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocatuioncount {
	
	@Test(invocationCount = 5)
	public void TC1()
	{
		Reporter.log("TC1 IS RUNNING", true);
	}
	@Test(invocationCount = 4)
	public void TC2()
	{
		Reporter.log("TC2 IS RUNNING", true);
	}
	@Test(invocationCount = 3)
	public void TC3()
	{
		Reporter.log("TC3 IS RUNNING", true);
	}
	@Test(invocationCount = 2)
	public void TC4()
	{
		Reporter.log("TC4 IS RUNNING", true);
	}


}
