package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_priority {
	
	@Test(priority = 0001)
	public void TC1()
	{
		Reporter.log("TC1 IS RUNNING");
	}
    @Test(priority = -1)
	public void TC2()
	{
		Reporter.log("TC2 IS RUNNING");
	}

	@Test(priority = -2)
	public void TC3()
	{
		Reporter.log("TC3 IS RUNNING");
	}

	@Test
	public void TC4()
	{
		Reporter.log("TC4 IS RUNNING");
	}

}
