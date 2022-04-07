package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class crm {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rautbhagyashree17@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABC123");
    }

}
