package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	Sheet sh = WorkbookFactory.create(f).getSheet("fb");
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
	driver.findElement(By.xpath("//button[@value='1']")).click();
	driver.switchTo().alert().accept();
	
	
	}

}
