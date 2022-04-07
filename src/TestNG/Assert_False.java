package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_False {
   @Test
	public void TC1()
	{
		boolean value = true;
		Assert.assertFalse(value, "Test Case Fail");
	}
}
