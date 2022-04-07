  package BASE_UTILITY_SCREENSHOT_PROPERTY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class11 extends Base_1 {
	
	
	//WebDriver d;
	Kite_Login_Page1 page1;
	Kite_Login_Page2 page2;
    Kite_Home_Page3 page3;
    @BeforeClass
	public void browseropen() throws EncryptedDocumentException, IOException
	{   initial();
	
	   	  
	   page1=new Kite_Login_Page1(d);
	   page2=new Kite_Login_Page2(d);
	   page3=new Kite_Home_Page3(d);
	}
	@AfterClass
	public void browserclose()
	{
		d.close();
	}
	@BeforeMethod
	public void apploogin() throws InterruptedException, EncryptedDocumentException, WebDriverException, IOException
	{   
		page1.loginid(Utility_Class1.getPFdata("UN1"));
	    page1.password(Utility_Class1.getPFdata("PASSWORD"));
	    page1.login();
	    Thread.sleep(3000);
	    page2.PIN.sendKeys(Utility_Class1.getPFdata("PIN"));
	    page2.contin();
	}
	@AfterMethod
	public void apploogout()
	{
		
	}
		
	@Test
	public void verifyuserid()
	{
		//page3.uncheck();
		String act = page3.verifyuid();
		String exp="THM944";
		Assert.assertEquals(act, exp ,"Pass");
		
	}

}
