package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equals {
    @Test
	public void asssertEquals()
	{
		String s1="Bhagyashree";
		String s2="Bhagya";
		Assert.assertEquals(s1, s2,"Failed-Both results are Different");
	}
	
	
}
