package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Alert_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.switchTo().alert().accept();
    String alerttext = driver.switchTo().alert().getText();
    System.out.println(alerttext);
}
}
 