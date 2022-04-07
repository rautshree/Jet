package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    System.out.println("Up Scrolling");
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	
	Thread.sleep(4000);
	System.out.println("Down Scroll");
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
    Thread.sleep(5000);
    System.out.println("Right Scroll");
    ((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,0)");
    WebElement org = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", org);



  
}
}
