package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_11 {
	@Test(enabled = true)
	public void TC1()
	{
		Reporter.log("TC 1 Running", true);
	}

	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("TC 2 Running", true);
	}
}
