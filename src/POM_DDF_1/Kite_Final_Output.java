package POM_DDF_1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Kite_Final_Output {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    Sheet sh = WorkbookFactory.create(f).getSheet("zerodha");System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver d=new EdgeDriver();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.get("https://kite.zerodha.com/");
	    
	    Kite_Login_Page1 page1=new Kite_Login_Page1(d);
	    page1.UN.sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	    page1.password(sh.getRow(0).getCell(1).getStringCellValue());
	    page1.login();
	    Kite_Login_Page2 page2=new Kite_Login_Page2(d);
	    Thread.sleep(3000);
	    page2.PIN.sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
	    page2.contin();
        
	    Kite_Home_Page3 page3=new Kite_Home_Page3(d);
	    page3.uncheck();
	   
	    
	}
}
