package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_Browser_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    driver.get("https://skpatro.github.io/demo/links/");
	    driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	    String main = driver.getWindowHandle();
	    Thread.sleep(4000);
	   // driver.switchTo().window(main);
	    Set<String> windows = driver.getWindowHandles();
	    ArrayList<String> arr=new ArrayList<String>(windows);
	    driver.switchTo().window(arr.get(0));
	    
	}
}
