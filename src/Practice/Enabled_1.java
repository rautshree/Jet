package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_1 {
	@Test(enabled = false)
	public void m4()
	{
		Reporter.log("Skipped", true);
	}
	@Test
	public void m5()
	{
		Reporter.log("Run", true);
	}
	@Test
	public void m6()
	{
		Reporter.log("Run", true);
	}
}
