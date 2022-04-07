package sel1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.utility.RandomString;

public class Scr11 {
	private static String filename;

	public static void main(String[] args) throws IOException {
		//((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.sinhgad.com");
    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String RS = RandomString.make(2);
     
	String path=System.getProperty("user.dir"+"S2")+ RS +".jpg";
	File dest = new File(path);
	org.openqa.selenium.io.FileHandler.copy(scr, dest);
	System.out.println("Screenshot Taken");
		
	}

}
