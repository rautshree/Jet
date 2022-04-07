package EXCEL_SCREENSHOTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_All_Type_of_Data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	Sheet sheet1 = WorkbookFactory.create(f).getSheet("Sheet2");
	int row = sheet1.getLastRowNum();
	for(int i=0;i<=row;i++)
	{
		int cel = sheet1.getRow(i).getLastCellNum()-1;
		for(int j=0;j<=cel;j++)
		{
			Cell c1 = sheet1.getRow(i).getCell(j);
			CellType s1 = c1.getCellType();
			if(s1==CellType.STRING)
          {
	        String value = c1.getStringCellValue();
	        System.out.println(value);
			//System.out.println();

          }
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = c1.getBooleanCellValue();
				System.out.println(value+" ");
				//System.out.println();

			}
			else
			{   double value = c1.getNumericCellValue();
				System.out.println(value+" ");
				//System.out.println();

			}
			//System.out.println();
		}
	}
}
}
