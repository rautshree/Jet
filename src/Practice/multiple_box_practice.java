package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_box_practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/checkbox.html");
	WebElement sel = driver.findElement(By.xpath("//select[@id='1234']"));
	Select sl=new Select(sel);
	boolean result = sl.isMultiple();
	System.out.println(result);
	List<WebElement> all = sl.getOptions();
	for(WebElement opt:all)
	{
		System.out.println(opt.getText());
		
	}



}
}
