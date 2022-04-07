package POM_DDF_FACEBOOK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Class {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
        Sheet sh = WorkbookFactory.create(f).getSheet("fb");
        
	    
        
        Loginpage lp=new Loginpage(driver);
	
        lp.usrname(sh.getRow(0).getCell(0).getStringCellValue());
        lp.pswrd(sh.getRow(0).getCell(1).getStringCellValue());
        lp.login();
        
        Confirm_HomePage hp=new Confirm_HomePage(driver);
        //hp.home(sh.getRow(0).getCell(1).getStringCellValue());
        
        
        
	}

}
