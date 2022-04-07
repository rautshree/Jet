package Browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;import java.util.ResourceBundle.Control;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
    Workbook w = WorkbookFactory.create(f);
    Sheet sheet1 = w.getSheet("Sheet2");
    //sheet1.getRow(0).getCell(0).getStringCellValue();
    DataFormatter df=new DataFormatter();
    String excl = df.formatCellValue(sheet1.getRow(0).getCell(0));
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    WebElement paste = driver.findElement(By.xpath("//input[@type='text']"));
    Actions ac =new Actions(driver);
   // ac.sendKeys(excl);
    ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    paste.click();
    ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    
}
}
