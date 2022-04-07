package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_CHECKBOX {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/checkbox.html");
    List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));
 for(WebElement single:box)
 {
	 single.click();
	 Thread.sleep(2000);
 }
 for(int i=box.size()-1;i>=0;i--)
 { if(i%2==0)
 {
	 box.get(i).click();
 }
	 
}
}
}
