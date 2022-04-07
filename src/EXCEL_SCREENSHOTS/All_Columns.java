package EXCEL_SCREENSHOTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Columns {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
	 Sheet sheet1 = WorkbookFactory.create(f).getSheet("Sheet1");
	 int cel = sheet1.getRow(0).getLastCellNum()-1;
	 for(int i=0;i<=cel;i++)
	 {
		 String value = sheet1.getRow(0).getCell(i).getStringCellValue();
		 System.out.print(value+" ");
	 }
}
}
