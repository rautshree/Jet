package BASE_UTILITY_SCREENSHOT_PROPERTY;

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

public class Utility_Class1 {
	//AUTHOR NAME
	//DESCRIPTION-USED TO GET DATA FROM EXCEL SHEET
	//NEED TO PASS 2 PARAMETERS-ROWINDEX AND COLUMNINDEX
	Properties ps;
	public static String excl2(int rowindex, int colindex) throws WebDriverException, EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    Sheet sh = WorkbookFactory.create(f).getSheet("zerodha");
	    String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	    return value;
	}
	
	public static void capturescreenshot(WebDriver driver, int TCID) throws IOException
	{
		File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\SCREENSHOTS"+TCID+".jpg");
	    org.openqa.selenium.io.FileHandler.copy(scrnshot, dest);	
	}
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream fl=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\Proprty.properties");
        Properties ps=new Properties();
        ps.load(fl);
        String dataget = ps.getProperty(key);
        return dataget;
	}

	
	
}
