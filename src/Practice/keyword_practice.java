package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class keyword_practice {
	@Test(invocationCount = 5)
	
	public void scrn () throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.co.in/");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name = null;
		//String di1 = System.getProperty("user.dir")+"\\S1"+".jpg";
		String path = System.getProperty("user.dir")+"//S1"+name+".png";
		//File f= new File("C:\\Users\\BHAGYASHREE RAUT\\eclipse-workspace\\Sel");
		File dest=new File(path);
		FileHandler.copy(scr, dest);
	}
}
