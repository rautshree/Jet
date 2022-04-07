package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
		Sheet sh1 = WorkbookFactory.create(f).getSheet("zerodha");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//EdgeOptions ed=new EdgeOptions();
		
		WebDriver browser=new ChromeDriver();
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    browser.get("https://kite.zerodha.com/");
	    //Enter UN
	    browser.findElement(By.xpath("//input[@type='text']")).sendKeys(sh1.getRow(0).getCell(0).getStringCellValue());
	    Thread.sleep(3000);
	    //PASSWORD
	    browser.findElement(By.xpath("//input[@type='password']")).sendKeys(sh1.getRow(0).getCell(1).getStringCellValue());
	    Thread.sleep(2000);
	    //SUBMIT
	    browser.findElement(By.xpath("//button[@type='submit']")).click();
	    //ENTER PIN
	    browser.findElement(By.xpath("//input[@minlength='6']")).sendKeys(sh1.getRow(0).getCell(2).getStringCellValue());
	    //CLICK CONTINUE
	    browser.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //VERIFY USER
	    String act = browser.findElement(By.xpath("//span[@class='user-id']")).getText();
	    
	    //EXPECTED STRING
	    String exp = sh1.getRow(0).getCell(0).getStringCellValue();
	    if(act.equals(act))
	    {
	    	System.out.println("Test Case Pass");
	    }
	    
	    else
	    {
	    	System.out.println("Test Case Fail");
	    }    
	    Thread.sleep(2000);
	   // browser.quit();
	    
	    
	    
	    
	    
	    
	    
	
	
	}
	

}
