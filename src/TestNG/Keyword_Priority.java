package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_Priority {


	@Test(priority=2)//priority-to set priority
	
	
	public void  TC1()
	{
		Reporter.log("Test Case1 iS Running", true);
	}

	@Test
	
	
	public void  TC2()
	{
		Reporter.log("Test Case2 iS Running", true);
	}
@Test(priority=-1)
	
	public void  TC3()
	{
		Reporter.log("Test Case3 iS Running", true);
	}
@Test

public void  TC4()
{
	Reporter.log("Test Case4 iS Running", true);
}


@Test(priority = -1)

public void  TC5()
{
	Reporter.log("Test Case5 iS Running", true);
}




}
