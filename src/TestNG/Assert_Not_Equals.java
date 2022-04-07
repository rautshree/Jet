package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Not_Equals {
  
	@Test
	public void TC1()
	{
		String s1="Bhagyashree";
		String s2="Raut";
		Assert.assertNotEquals(s1, s2,"Result Pass");
	}
	
}
