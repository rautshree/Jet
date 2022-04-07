package TestNG_NEW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HARD_Assert {
	@Test
	public void dashboard()
	{
	 Assert.assertNotEquals(false, false);
	 String a=null;
	 Assert.assertNull(a);
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
