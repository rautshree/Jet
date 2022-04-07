import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Parameters;

public class Data_Provider {

	
	@Parameters
	public static String dataprovider1() throws EncryptedDocumentException, IOException {
	
	FileInputStream fl=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	Sheet sh = WorkbookFactory.create(fl).getSheet("Sheet5");
	int lastrow = sh.getLastRowNum();
	System.out.println(lastrow);
    int cel = sh.getRow(0).getLastCellNum();
    System.out.println(cel);
    String data [][]= new String[lastrow][cel];
  
    for(int i=0;i<=2;i++)
    {   
    	
		for(int j=0;j<=1;j++)
    	{  
		 data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();			
		}
			
    }
	return null;
}
}

