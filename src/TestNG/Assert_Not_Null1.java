package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Not_Null1 {
	@Test
	public void m1()
	{
		String value = null;
		Assert.assertNull(value, "failed");
	}

}
