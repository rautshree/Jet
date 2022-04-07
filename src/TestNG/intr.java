package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class intr {
	
	
	@Test
	public void m1()
	{ 
		try
		{
		int a=10; int b=0;
		System.out.println(a/b);
		}
		
		catch(ArithmeticException W)
		{
			System.out.println("ARITHMATUC EXCEPTION");
		}
		Reporter.log("Exception Handled", true);
		}

	
}
