package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert_popus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(3000);	    
	    
	    driver.switchTo().alert();
	    Thread.sleep(2000);
	    String text = driver.switchTo().alert().getText();
        System.out.println(text);
	}

}
