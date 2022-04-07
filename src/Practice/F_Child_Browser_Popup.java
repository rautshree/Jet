package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F_Child_Browser_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(ids);
	System.out.println(al.get(0));
	driver.switchTo().window(al.get(1));
	driver.findElement(By.xpath("(//ul[@id='primary-menu']//li)[9]")).click();
	Actions ac=new Actions(driver);
    WebElement ele = driver.findElement(By.xpath("(//span[text()='Java interview questions for QA'])[1]"));
	ac.moveToElement(ele).click().build().perform();
}
}
