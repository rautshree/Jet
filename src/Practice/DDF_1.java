package Practice;

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

public class DDF_1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//EdgeOptions ed=new EdgeOptions();
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
		Sheet data = WorkbookFactory.create(f).getSheet("zerodha");
		WebDriver browser=new ChromeDriver();
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    browser.get("https://kite.zerodha.com/");
		//ENTER UN
	    browser.findElement(By.xpath("//INPUT[@TYPE='text']")).sendKeys(data.getRow(0).getCell(0).getStringCellValue());
	    Thread.sleep(2000);
	    //ENTER PASSWORD
	    browser.findElement(By.xpath("//input[@type='password']")).sendKeys(data.getRow(0).getCell(1).getStringCellValue());
	    //login
	    browser.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    browser.findElement(By.xpath("//input[@placeholder='PIN']")).sendKeys(data.getRow(0).getCell(2).getStringCellValue());
	    //click btn
	    browser.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	    
	    //to check user
	    String actual = browser.findElement(By.xpath("//span[@class='user-id']")).getText();
	    String exp = "THM944";
	    		if(exp.equals(actual))
	    		{
	    			System.out.println("Test Case pass");
	    		}
	    		else
	    		{
	    			System.out.println("Test Case Fail");
	    		}
	    
	    
	}
	
	
	
}
