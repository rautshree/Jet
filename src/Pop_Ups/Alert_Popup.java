package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Popup {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@name='submit']")).click();
    String st1 = driver.switchTo().alert().getText();
    System.out.println(st1);
    driver.switchTo().alert().accept();
    Thread.sleep(2000);
    String st = driver.switchTo().alert().getText();
    System.out.println(st);
}
}
