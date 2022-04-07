package Practice;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PARALLLE {

	
	
	@Parameters("browsername")
	@Test
	public void parallel(String browsername) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriver driver=null;
		if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    driver=new EdgeDriver();
		}
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
		Sheet sh1 = WorkbookFactory.create(f).getSheet("zerodha");
		driver.get("https://kite.zerodha.com/");
	    //Enter UN
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sh1.getRow(0).getCell(0).getStringCellValue());
	    Thread.sleep(3000);
	    //PASSWORD
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh1.getRow(0).getCell(1).getStringCellValue());
	    Thread.sleep(2000);
	    //SUBMIT
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(4000);
	    //ENTER PIN
	    driver.findElement(By.xpath("//input[@minlength='6']")).sendKeys(sh1.getRow(0).getCell(2).getStringCellValue());
	    //CLICK CONTINUE
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
		
		
	}
}
