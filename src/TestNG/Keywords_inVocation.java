package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_inVocation {
	
	@Test(invocationCount = 5)//InvocationCount=To run test cases number of times
	
	
	public void  TC1()
	{
		Reporter.log("Test Case iS Running", true);
	}

}
