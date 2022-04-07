package sel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numer {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");	
//        double w = WorkbookFactory.create(f).getSheet("Sheet3").getRow(0).getCell(0).getNumericCellValue();
//	
//	     System.out.println(w);
		Sheet s = WorkbookFactory.create(f).getSheet("Sheet3");
		int r = s.getLastRowNum();
		for(int i=0;i<=r;i++)
		{
			double n = s.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(n);
		}
	
	}

}
