package Browser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class cp_wibdow {
	
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Desktop\\Driver\\edgedriver_win64 (1)\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
     Set<String> ids = driver.getWindowHandles();
     ArrayList<String> al=new ArrayList<String>();
     driver.switchTo().window(al.get(1));
     Actions act=new Actions(driver);
     
     
     String ele = driver.findElement(By.xpath("//span[text()='Watch free courses']")).getText();
  
     
}
}
