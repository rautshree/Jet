package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
public class Soft_Assert {
	
	@Test
	public void TC1()
	{
		SoftAssert sa=new SoftAssert();
	  	String value=null;
    	sa.assertNotNull(value, "Failed test case");
		
		boolean val=true;
		sa.assertTrue(val, "Pass case");
		
		sa.assertAll();
		
	}

}
