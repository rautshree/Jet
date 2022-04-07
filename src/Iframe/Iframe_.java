package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    //Switch To Frame
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    
	    //To Return to Main frame
	    Thread.sleep(4000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='w3-dropdown-click w3-button w3-bar-item topnav-icons fa fa-menu']")).click();
	  
	}

}
