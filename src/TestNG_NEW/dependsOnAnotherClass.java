package TestNG_NEW;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnAnotherClass {
	
	
	@Test(dependsOnMethods="TestNG_NEW.dependsOn.openbrowser")
	public void login1()
	{
		Reporter.log("login is RUNNING", true);
	
	}
}
