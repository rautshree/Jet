package Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_1 {

	

	@Test(dependsOnMethods = {"TEST2"})
	public void TEST1() throws InterruptedException
	{   //Thread.sleep(5000);
		Reporter.log("test1 is running", true);
	}
	@Test(timeOut = 4000)
	public void TEST2()
	{   //Assert.fail();
		Reporter.log("test2 is running", true);
	}
}
