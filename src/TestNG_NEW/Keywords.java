package TestNG_NEW;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

public class Keywords {
	
	
	
	@Test(priority=3)
	public void count1()
	{   
		System.out.println("1 Krywords");
		org.testng.Assert.fail();
	}
	@Test(priority=3)
	public void count2()
	{
		System.out.println("2 Krywords");
	}
	@Test(priority=-3)
	public void count3()
	{   
		System.out.println("3 Krywords");
	}
	@Test(priority=3)
	public void count4()
	{
		System.out.println("4 Krywords");
	}
	
	
	
}
