package EXCEL_SCREENSHOTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet_Get_Row_Cell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
   FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx\\");
   
//Get String Data
//   String CelValue = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//   System.out.println(CelValue);
   
//Get Boolean Data
   double CelValue1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
   System.out.println(CelValue1);
//GET BOOLEAN DATA
//   boolean CelValue2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
//   System.out.println(CelValue2);
}
}
