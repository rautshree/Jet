package POM_DDF_FACEBOOK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Ng {
	
	WebDriver driver;
	Loginpage lp;
	Sheet sh;
	Confirm_HomePage hp;
	
	@BeforeClass
	public void appopen() throws EncryptedDocumentException, IOException, InterruptedException
	{   FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
        sh = WorkbookFactory.create(f).getSheet("fb");

		System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
        System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	    
	}
	
	@BeforeMethod
	public void logn()
	{   Loginpage lp=new Loginpage(driver); 
		lp.usrname(sh.getRow(0).getCell(0).getStringCellValue());
        lp.pswrd(sh.getRow(0).getCell(1).getStringCellValue());
        lp.login();
        hp=new Confirm_HomePage(driver);
        
        
	}
	@Test
	public void verify()
	{
		  //hp.home(sh.getRow(0).getCell(2).getStringCellValue());
        String actual = hp.getactualstring();
        String Exp=sh.getRow(0).getCell(2).getStringCellValue();
        Assert.assertEquals(actual, Exp , "Pass");
		  
	}
	public void logout() throws InterruptedException
	{   Thread.sleep(4000);
		driver.close();
	}

}
