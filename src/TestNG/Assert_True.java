package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Assert_True {
    @Test
	public void TC1()
	{
		boolean act = false;
       Assert.assertTrue(act,"failed case");
	}
}
