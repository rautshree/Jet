package POM_DDF_TESTNG_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class {
	
	
	WebDriver d;
	Kite_Login_Page1 page1;
	Kite_Login_Page2 page2;
    Kite_Home_Page3 page3;
    Sheet sh;
	@BeforeClass
	public void browseropen() throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    sh = WorkbookFactory.create(f).getSheet("zerodha");
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver d=new EdgeDriver();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.get("https://kite.zerodha.com/");
	    page1=new Kite_Login_Page1(d);
	    page2=new Kite_Login_Page2(d);
	    page3=new Kite_Home_Page3(d);
	}
//	@AfterClass
//	public void browserclose()
//	{
//		d.close();
//	}
	@BeforeMethod
	public void apploogin() throws InterruptedException
	{
		page1.loginid(sh.getRow(0).getCell(0).getStringCellValue());
	    page1.password(sh.getRow(0).getCell(1).getStringCellValue());
	    page1.login();
	    Thread.sleep(3000);
	    page2.PIN.sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
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
