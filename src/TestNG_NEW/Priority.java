package TestNG_NEW;

import org.testng.annotations.Test;

public class Priority {


@Test(priority = -1)
	
	public void login()
	{
		System.out.println("Login is Running");
	}
	@Test(priority = 1)
	public void homepage()
	{
		System.out.println("Homepage is Running");
	}
	@Test
	public void navigateto_url()
	{
		System.out.println("Navigation is Running");
	}
}
