package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Timeout {

	@Test(dependsOnMethods ="TC2" )
	public void TC1() throws InterruptedException
	{   Thread.sleep(5000);
		System.out.println("tc 1 running");
	}
	public void TC2() throws InterruptedException
	{   Assert.fail();
		Thread.sleep(5000);
		System.out.println("tc 2 running");
	}
}
