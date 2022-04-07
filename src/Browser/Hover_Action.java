package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
    driver.findElement(By.xpath("//input[@class='button']")).click();
    Actions act=new Actions(driver);
    WebElement dash = driver.findElement(By.xpath("//b[text()='Dashboard']"));
    act.moveToElement(dash).perform();
    Thread.sleep(4000);
    WebElement adm = driver.findElement(By.xpath("//b[text()='Admin']"));
   
    WebElement usr = driver.findElement(By.xpath("//a[text()='User Management']"));
    WebElement hc = driver.findElement(By.xpath("//a[text()='Users']"));
    act.moveToElement(adm).moveToElement(usr).perform();
    Thread.sleep(3000);
    act.click(hc).perform();
}
}
