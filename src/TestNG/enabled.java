package TestNG;

import org.testng.annotations.Test;

public class enabled {
	
	
	@Test(enabled=false)
	public void TC1()
	{
		System.out.println("tc 1 running");
	}
	@Test(enabled=true)
	public void TC2()
	{
		System.out.println("tc 2 running");
	}

}
