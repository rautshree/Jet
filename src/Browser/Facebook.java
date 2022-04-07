package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	      
	       Thread.sleep(3000);
	       WebElement mn = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	      
	       
	       Select s=new Select(mn);
           boolean result = s.isMultiple();
           System.out.println(result);
           if(result==true)
           {
        	   System.out.println("Box is Multi Selectable");
           }
           else
           {
        	   System.out.println("Box is Single Selectable");
           }
           int sz = s.getOptions().size();
           System.out.println("Size is"+sz);
           Thread.sleep(3000);
           s.selectByIndex(7);
           s.selectByVisibleText("2000");
           List<WebElement> all = s.getOptions();
           for(WebElement years:all)
           {
        	   System.out.println(years.getText());
           }
          	System.out.println("first selected option"+s.getFirstSelectedOption().getText());
}
}
