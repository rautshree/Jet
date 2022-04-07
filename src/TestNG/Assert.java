package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	
	
	
	@Test
	public void TC1()
	{
		String s="shree";
		String d="shree";
		assertEquals(s, d, "both results are equal");
	}
	
	@Test
	public void TC2()
	{  SoftAssert sa=new SoftAssert();
		boolean s = false;
		assertTrue(s, "pass");
		sa.assertFalse(s);
		Reporter.log("pass", true);
		sa.assertAll();
	}
	
	
}















