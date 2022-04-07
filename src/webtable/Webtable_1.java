package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtable_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/TABLE.html");
        WebElement data = driver.findElement(By.xpath("//table[@id='1234']//tr[2]"));
	   String t = data.getText();
	   System.out.println(t);
	   }

}
