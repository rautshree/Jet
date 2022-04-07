package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B_screenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Bhagyashree Raut");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='eIPGRd'])[2]")).click();
    
    File bhagya = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File raut=new File("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\Screenshot\\.jpg");
    FileHandler.copy(bhagya, raut);
}

}
