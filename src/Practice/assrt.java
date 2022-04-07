package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assrt {
	@Test
	public void TEST1()
	{
		String s1="Raut";
		String s2="Raut";
		Assert.assertEquals(s1, s2);
	}

	@Test
	public void TEST2()
	{
		int a=10; int b=10;
		Assert.assertEquals(a, b);
	}
	@Test
	public void TEST3()
	{
		int a=10; int b=20;
		Assert.assertEquals(a, b);
	}
	@Test
	public void TEST4()
	{
		boolean b = true;
		Assert.assertFalse(b);
	}
	@Test
	public void TEST5()
	{
		int a=10; int b=30;
		Assert.assertNotEquals(a, b);
	}
	
	
	
	
	
	
	
	
}
