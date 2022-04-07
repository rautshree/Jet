package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emnabled {
	@Test(enabled = false)
	public void m1()
	{
		Reporter.log("Skipped", true);
	}
	@Test
	public void m2()
	{
		Reporter.log("Run", true);
	}
	@Test
	public void m3()
	{
		Reporter.log("Run", true);
	}
	
	

}
