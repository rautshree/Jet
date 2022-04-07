package BASE_UTILITY;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_1 {
	
	
	WebDriver d;
	Kite_Login_Page1 page1;
	Kite_Login_Page2 page2;
    Kite_Home_Page3 page3;
    int TCID;
	@BeforeClass
	public void browseropen() throws EncryptedDocumentException, IOException
	{   
		
	   initial();
	   page1=new Kite_Login_Page1(d);
	   page2=new Kite_Login_Page2(d);
	   page3=new Kite_Home_Page3(d);
	}
	@AfterClass
	public void logout()
	{
		
	}
	@BeforeMethod
	public void apploogin() throws InterruptedException, EncryptedDocumentException, WebDriverException, IOException
	{ 
	 
		page1.UN.sendKeys(null);
	    page1.password(Utility_Class.excl(0, 1));;
	    page1.login();
	    Thread.sleep(3000);
	    page2.PIN.sendKeys(Utility_Class.excl(0, 2));
	    page2.contin();
	}
	@AfterMethod
	public void Resultscreenshot(ITestResult s) throws IOException
	{ 
		if(s.getStatus()==ITestResult.FAILURE)
		{
        Utility_Class.capturescreenshot(d, TCID);
		}
	}
		
	@Test
	public void verifyuserid()
	{
		//page3.uncheck();
		TCID=101;
		String act = page3.verifyuid();
		String exp="THM944";
		Assert.assertEquals(act, exp ,"Pass");
		
	}

}
