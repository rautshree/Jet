package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_enabled {

	
	@Test(enabled=false)//enabled=to stop any test case
	
	
	public void  TC1()
	{
		Reporter.log("Test Case1 iS Running", true);
	}

	@Test
	
	
	public void  TC2()
	{
		Reporter.log("Test Case2 iS Running", true);
	}

}
