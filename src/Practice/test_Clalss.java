package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_Clalss {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
        Sheet data = WorkbookFactory.create(f).getSheet("zerodha");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver browser=new ChromeDriver();
        browser.get("https://kite.zerodha.com/");
		browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Kitelogin_1_Page l1=new Kitelogin_1_Page(browser);
		//String un = data.getRow(0).getCell(0).getStringCellValue();
		l1.enterusername(data.getRow(0).getCell(0).getStringCellValue());
		//String pw = data.getRow(0).getCell(0).getStringCellValue();
		l1.enterpassword(data.getRow(0).getCell(1).getStringCellValue());
		l1.click();
		
		
		Kitelogin_2_Page l2=new Kitelogin_2_Page(browser);
		
		l2.enterPIN(data.getRow(0).getCell(2).getStringCellValue());
		
		KiteHomePage h=new KiteHomePage(browser);
		
		
		
		
	}

}
