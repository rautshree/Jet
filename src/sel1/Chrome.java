package sel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
   FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\raut.xlsx");
// Workbook s = WorkbookFactory.create(f);
//   Sheet r = s.getSheet("raut");
//   Row c = r.getRow(0);
//   Cell z = c.getCell(1);
//   String v = z.getStringCellValue();
//   System.out.println(v);
   
//   String st = WorkbookFactory.create(f).getSheet("s").getRow(2).getCell(0).getStringCellValue();
//   System.out.println(st);
//   int i = WorkbookFactory.create(f).getSheet("s").getLastRowNum();
//   System.out.println(i);
   
   

}
}
