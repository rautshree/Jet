package TestNG_NEW;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SOFT_Assert {
	@Test
	public void dashboard()
	{
	 SoftAssert sa=new SoftAssert();
	 sa.assertNotEquals(false, false);
	 String a=null;
	 sa.assertNull(a);
	 Reporter.log("After Assertion",true);
	 sa.assertAll();
	}
	@Test
	public  void Test2()
	{   String a=null;
		Assert.assertNull(a);
	}
	@Test
	public void Test3()
	{
	Assert.assertTrue(true, "Pass");	
	}
	@Test
	public void TEST4()
	{
	Assert.assertFalse(false, "PASS");
	}
}
