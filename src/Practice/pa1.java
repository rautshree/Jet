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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class pa1 {
	@Test
	public void TC1() throws EncryptedDocumentException, IOException, InterruptedException

	{
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
		Sheet sh1 = WorkbookFactory.create(f).getSheet("zerodha");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions cm=new ChromeOptions();
		cm.addArguments("start-maximized");
		cm.addArguments("--disable-notifications");
		
		WebDriver browser=new ChromeDriver(cm);
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    browser.get("https://kite.zerodha.com/");
	    //Enter UN
	    browser.findElement(By.xpath("//input[@type='text']")).sendKeys(sh1.getRow(0).getCell(0).getStringCellValue());
	    Thread.sleep(3000);
	    //PASSWORD
	    browser.findElement(By.xpath("//input[@type='password']")).sendKeys(sh1.getRow(0).getCell(1).getStringCellValue());
	    Thread.sleep(2000);
	    //SUBMIT
	}
	
	
	@Test
	
	public void TC2()
	{System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
		
	}
}
