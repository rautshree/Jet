package Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_w {
	@Test
	public void m11()
	{
		Reporter.log("Skipped", true);
	}
	@Test
	public void m21()
	{
		Reporter.log("Run", true);
	}
	@Test
	public void m31()
	{  Assert.fail();
		Reporter.log("Run", true);
	}

}
