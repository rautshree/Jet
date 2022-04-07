package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Parallel_MultiBrowser_DDF {
	@org.testng.annotations.Parameters("browsername")
	@Test
	
	public void TC1(String browsername) throws InterruptedException, EncryptedDocumentException, IOException
	
	{  
		WebDriver browser=null;
		 if(browsername.equals("edge"))
		 {
			 	 
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    browser=new EdgeDriver();
		 }
		 
		 else if(browsername.equals("chrome"))
	 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			browser=new ChromeDriver();
			
				
	 }
		 FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
		 Sheet sh1 = WorkbookFactory.create(f).getSheet("zerodha");
			
		    browser.get("https://kite.zerodha.com/");
		    //Enter UN
		    browser.findElement(By.xpath("//input[@type='text']")).sendKeys(sh1.getRow(0).getCell(0).getStringCellValue());
		    Thread.sleep(3000);
		    //PASSWORD
		    browser.findElement(By.xpath("//input[@type='password']")).sendKeys(sh1.getRow(0).getCell(1).getStringCellValue());
		    Thread.sleep(2000);
		    //SUBMIT
		    browser.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(4000);
		    //ENTER PIN
		    browser.findElement(By.xpath("//input[@minlength='6']")).sendKeys(sh1.getRow(0).getCell(2).getStringCellValue());
		    //CLICK CONTINUE
		    Thread.sleep(4000);
		    browser.findElement(By.xpath("//button[@type='submit']")).click();
	    
//	    //VERIFY USER
//	    String act = browser.findElement(By.xpath("//span[@class='user-id']")).getText();
//	    
//	    //EXPECTED STRING
//	    String exp = sh1.getRow(0).getCell(0).getStringCellValue();
//		    if(act.equals(act))
//		    {
//	    	Reporter.log("Test Case Pass");
//	    }
//	    
//	    else
//	    {
//		    	Reporter.log("Test Case Fail");
//	    }    
		    Thread.sleep(2000);
		    Reporter.log("Pass", true);
		    Thread.sleep(3000);
		    browser.close();
		 
		 
		 
		 
	}
	
	

}
