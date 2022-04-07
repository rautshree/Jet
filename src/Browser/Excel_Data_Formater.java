package Browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Data_Formater {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    Workbook w = WorkbookFactory.create(f);
	    Sheet sheet1 = w.getSheet("Sheet2");
	    DataFormatter df=new DataFormatter();
	   String value = df.formatCellValue(sheet1.getRow(0).getCell(2));
	    System.out.println(value);
	    String value1 = df.formatCellValue(sheet1.getRow(0).getCell(0));
	    System.out.println(value1);
	}

}
