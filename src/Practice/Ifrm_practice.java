package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ifrm_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    Thread.sleep(4000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[4]")).click();
	}

}
