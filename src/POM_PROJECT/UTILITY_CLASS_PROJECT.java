package POM_PROJECT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UTILITY_CLASS_PROJECT {
	
	public static String getdata(String key) throws IOException
	{
		
		FileInputStream data= new FileInputStream("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\src\\POM_PROJECT\\data.properties");
		Properties prop=new Properties();
		prop.load(data);
		String value = prop.getProperty(key);
		return value;
		
	}
	
	public static void getscreenshot(WebDriver driver , int TCID) throws IOException
	{
		File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File dest= new File("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel\\SCREENSHOTS"+TCID+".jpg");
	    org.openqa.selenium.io.FileHandler.copy(scrnshot, dest);
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	}

