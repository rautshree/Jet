package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\new.xlsx");
	    Workbook w = WorkbookFactory.create(f);
	    Sheet sheet1 = w.getSheet("Sheet2");
	    
//	    String sh = sheet1.getRow(0).getCell(0).getStringCellValue();
//	    System.out.println(sh);
//	    int rowsize = sheet1.getLastRowNum();
//	    System.out.println(rowsize);
//	    
//	   short cl = sheet1.getRow(0).getLastCellNum();
//	   System.out.println(cl);
	   
//	   for(int i=0;i<=rowsize;i++)
//	   {
//		   String sh1 = sheet1.getRow(i).getCell(2).getStringCellValue();
//		   System.out.println(sh1);
//	   }
	 
//	    int rowsize = sheet1.getLastRowNum();
//	    
//	   for(int i=0;i<=rowsize;i++)
//	   {
//		   
//		   int cl = sheet1.getRow(i).getLastCellNum()-1;
//		   for(int j=0;j<=cl;j++)
//		   {
//			   String value = sheet1.getRow(i).getCell(j).getStringCellValue();
//			   System.out.println(value);
//		   }
//		   System.out.println();
//	   }
//	   
//	    int row = sheet1.getRow(0).getLastCellNum()-1;
//	    
//	    for(int i=0;i<=row;i++)
//	    {
//	    	Cell c1 = sheet1.getRow(0).getCell(i);
//	    	CellType ct = c1.getCellType();
//	    	
//	    	if(ct==CellType.STRING)
//	    	{
//	    		String value = sheet1.getRow(0).getCell(i).getStringCellValue();
//	    		System.out.println(value);
//	    	}
//	    	else if(ct==CellType.BOOLEAN)
//	    	{
//	    		boolean value = sheet1.getRow(0).getCell(i).getBooleanCellValue();
//	    		System.out.println(value);
//	    	}
//	    	else
//	    	{
//	    		double value = sheet1.getRow(0).getCell(i).getNumericCellValue();
//	    		System.out.println(value);
//	    	}
//	    }
//	    
	    
	    int rn = sheet1.getLastRowNum();
	    for(int i=0;i<=rn;i++)
	    {   
	    	short cl = sheet1.getRow(i).getLastCellNum();
	    	for(int j=0;j<=cl-1;j++)
	    	{
	    		CellType ct = sheet1.getRow(i).getCell(j).getCellType();
	    		if(ct==CellType.STRING)
	    		{   String value = sheet1.getRow(i).getCell(j).getStringCellValue();
	    			System.out.println(value+" ");
	    			//System.out.println();
	    		}
	    		else if(ct==CellType.BOOLEAN)
	    		{
	    			boolean value = sheet1.getRow(i).getCell(j).getBooleanCellValue();
	    			System.out.print(value+" ");
	    			System.out.println();
	    		}
	    		else
	    		{
	    			double value = sheet1.getRow(i).getCell(j).getNumericCellValue();
	    			System.out.print(value+" ");
	    			System.out.println();
	    		}
	    		//System.out.println();
	    	}
	    		
	    }
	
	}
	}
