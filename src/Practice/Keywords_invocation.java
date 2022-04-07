package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_invocation {
   @Test(invocationCount = 4)
	
	public void Test1()
	{
		Reporter.log("Bhagyashree is CLEVER", true);
	}
}
