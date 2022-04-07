package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert_Null_1 {
	@Test
	public void TC1()
	{
    String result = null;
    Assert.assertNotNull(result);
	}
}
