package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grp_Class1 {	
	
	@Test
	public void TC1()
	{
		Reporter.log("TC1 FROM GRP 1" ,true);
	}
	
	
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 FROM GRP 1", true);
	}


}
