package BASE_UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Utility_Class {
	
	//AUTHOR NAME
	//DESCRIPTION-USED TO GET DATA FROM EXCEL SHEET
	//NEED TO PASS 2 PARAMETERS-ROWINDEX AND COLUMNINDEX

	public static String excl(int rowindex, int colindex) throws WebDriverException, EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    Sheet sh1= WorkbookFactory.create(f).getSheet("zerodha");
	    String value = sh1.getRow(rowindex).getCell(colindex).getStringCellValue();
	    return value;
	}
	
	public static void capturescreenshot(WebDriver driver, int TCID) throws IOException
	{
		File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\SCREENSHOTS"+TCID+".jpg");
	    org.openqa.selenium.io.FileHandler.copy(scrnshot, dest);	
	}
    public static void getdata(String key) throws IOException
   {
	  FileInputStream f=new FileInputStream(System.getProperty("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\Proprty.properties"));
      Properties p=new Properties();
      p.load(f);
      String username = p.getProperty(key);
      
   
   }
	
	
}
