package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C_Excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\Test Cases.xlsx");
	String TC = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
	System.out.println(TC);
	}

}
