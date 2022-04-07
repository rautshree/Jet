package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Selected {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
    driver.findElement(By.xpath("//input[@class='button']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//b[text()='Admin']")).click();
    Thread.sleep(2000);
    WebElement clc = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_10']"));
    //clc.click();
    //String tc = clc.getText();
    //System.out.println(tc);
    Thread.sleep(2000);
    boolean result = clc.isSelected();
    boolean isn = clc.isEnabled();
    System.out.println("This is:"+ isn);
    System.out.println(result);
    WebElement gettxt = driver.findElement(By.xpath("//label[text()='Username']"));
    System.out.println(gettxt.getText());
    boolean enb = clc.isEnabled();
    System.out.println("enb"+ enb);
} 
}
