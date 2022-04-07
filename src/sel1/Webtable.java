package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/TABLE.html");
        //for header data printing
        
        String head = driver.findElement(By.xpath("//table[@border='1']//th[3]")).getText();
		System.out.println(head);
		   
		//for row data printing 
		String ro = driver.findElement(By.xpath("//table[@border='1']//tr[3]")).getText();
		System.out.println(ro);
	}

}
