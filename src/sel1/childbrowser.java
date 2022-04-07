package sel1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class childbrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://skpatro.github.io/demo/links/");
   
    driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
    Set<String> dd = driver.getWindowHandles();
    ArrayList<String> al=new ArrayList<String>(dd);
    String ids = al.get(1);
    driver.switchTo().window(ids);
     
    driver.findElement(By.xpath("(//span[text()='Cypress'])[1]")).click();
    Thread.sleep(2000);
    driver.switchTo().window(al.get(0));
    
    
}

}
