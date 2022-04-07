package sel1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.youtube.com");
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("arjit singh");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//*[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1]")).click();
    
}
}
