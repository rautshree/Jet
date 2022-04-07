package TestNG_NEW;

import org.testng.annotations.Test;

public class order_of_running {

	
	
	@Test
	
	public void login()
	{
		System.out.println("Login is Running");
	}
	@Test
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
