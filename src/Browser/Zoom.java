package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zoom {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://zoom.us/signup");
   
  // String exp = "May";
    Actions act=new Actions(driver);
    WebElement clk = driver.findElement(By.xpath("(//span[@role='button'])[1]"));

    act.moveToElement(clk).click().build().perform();
    for(int i=1;i<=4;i++)
    {
    	act.moveToElement(clk).sendKeys(Keys.ARROW_DOWN);
    	Thread.sleep(3000);
    }
    //Thread.sleep(4000);
    //act.moveToElement(clk).sendKeys(Keys.ENTER).build().perform();
    
//    act.moveToElement(clk).sendKeys(Keys.ARROW_DOWN);
//    act.moveToElement(clk).sendKeys(Keys.ARROW_DOWN);
//    act.moveToElement(clk).sendKeys(Keys.ARROW_DOWN);
    
    act.moveToElement(clk).click().build().perform();
    
   
}
}
