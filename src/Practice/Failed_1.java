package Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_1 {
	@Test
	public void m4()
	{
		Reporter.log("Skipped", true);
	}
	@Test
	public void m5()
	{   //Assert.fail();
		Reporter.log("Run", true);
	}
	@Test
	public void m6()
	{
		Reporter.log("Run", true);
	}

}
