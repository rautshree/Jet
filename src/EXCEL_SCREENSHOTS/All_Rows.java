package EXCEL_SCREENSHOTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Rows {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
 FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
 Sheet sheet1 = WorkbookFactory.create(f).getSheet("Sheet1");
 int row = sheet1.getLastRowNum();
 
 for(int i=0; i<=row;i++)
 {
	 String value = sheet1.getRow(i).getCell(0).getStringCellValue();
	 System.out.println(value);
 }
 
	}

}
