import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data_providers_new {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fl=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
		Sheet sh = WorkbookFactory.create(fl).getSheet("Sheet5");
		int lastrow = sh.getLastRowNum();
		System.out.println(lastrow);
	    int cel = sh.getRow(0).getLastCellNum();
	    System.out.println(cel);
        String data[][]=new String[lastrow][cel];
        for(int i=0;i<=2;i++)
        {   
       	String data1;
   		for(int j=0;j<=1;j++)
       	{data1=sh.getRow(i).getCell(j).getStringCellValue();
   		System.out.print(data+ " ");
   			
   		}
   		System.out.println();
        }
   	
}
}