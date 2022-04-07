package Pop_Ups;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_Browser_Popup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	    
	    Set<String> ids = driver.getWindowHandles();
	    ArrayList<String> al=new ArrayList<String>(ids);
	    driver.switchTo().window(al.get(1));
	    driver.findElement(By.xpath("(//header[@class='header-bar']//li)[2]")).click();
	    Thread.sleep(4000);
	    //TO MOVE TO THE MAIN WINDOW
	    
	    driver.switchTo().window(al.get(0));
	}

}
