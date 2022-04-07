package TestNG;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Not_Null {
   @Test
	public void TC1()
	{
    String result = null;
    Assert.assertNotNull(result,"Failed");
	}
}
