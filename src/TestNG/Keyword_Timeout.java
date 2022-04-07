package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.netty.util.Timeout;

public class Keyword_Timeout {

	@Test(timeOut = 4000)//
	
	
	public void  TC1() throws InterruptedException
	{   Thread.sleep(5000);
		Reporter.log("Test Case1 iS Running", true);
	}

	@Test(timeOut=3000)
	
	
	public void  TC2()
	{
		
		Reporter.log("Test Case2 iS Running", true);
	}

}
