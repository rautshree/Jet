package TestNG_NEW;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Class {
@Test(priority = -1)
	
	public void login()
	{
		Reporter.log("Shree",true);
	}
	@Test(priority = 1)
	public void homepage()
	{
		Reporter.log("Hi", 0);
	}
	@Test
	public void navigateto_url()
	{
		System.out.println("Navigation is Running");
	}
}
