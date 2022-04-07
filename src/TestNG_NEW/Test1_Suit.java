package TestNG_NEW;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1_Suit {
	
	@Test
	public void TC1()
	{
		Reporter.log("TC1 RUNNING", true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 RUNNING", true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("TC3 RUNNING", true);
	}



}
