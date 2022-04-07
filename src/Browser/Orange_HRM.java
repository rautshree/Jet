package Browser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
//    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("");
//    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
    //driver.findElement(By.xpath("//input[@class='button']")).click();
//    Thread.sleep(3000);
//    String actualtext = driver.findElement(By.xpath("//span[text()='Username cannot be empty']")).getText();
//    String expected = "Username cannot be empty";
//    if(actualtext.equals(expected))
//    {
//    	System.out.println("Test Case Pass");
//    }
   //driver.findElement(By.linkText("Forgot your password?")).click();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //Window Handles
    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
    
    Set<String> parent = driver.getWindowHandles();
    ArrayList< String> al=new ArrayList<String>(parent);
    Thread.sleep(2000);
    driver.switchTo().window(al.get(1));
    Thread.sleep(7000);
    System.out.println("This Is Parent");
   driver.switchTo().window(al.get(0));
    
    
    
    
    
    
    
    
    
    
    
}
}
