package sel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataPrint {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");	
//
//		Sheet w = WorkbookFactory.create(f).getSheet("Sheet1");
//		int rownum1 = w.getLastRowNum();
//		for(int i=0;i<=rownum1;i++)
//		{
//			int c = w.getRow(i).getLastCellNum()-1;
//			for(int j=0;j<=c;j++)
//			{
//				String s1 = w.getRow(i).getCell(j).getStringCellValue();
//				System.out.print(s1+" ");
//			}
//			System.out.println();
//		}
		
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\raut.xlsx");
		Sheet all = WorkbookFactory.create(f).getSheet("s");
		
		int r = all.getLastRowNum();
		int c = all.getRow(0).getLastCellNum()-1;
		
//		System.out.println(r);
//		System.out.println(c);
//		
	 
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=c;j++)
			{
				String al = all.getRow(i).getCell(j).getStringCellValue();
				System.out.print(al+" ");
			}
			System.out.println();
		//	System.out.println();
		}
	}

}
