package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver d=new EdgeDriver();
    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    d.get("file:///C:/Users/BHAGYASHREE%20RAUT/Desktop/TABLE.html");
    //Dimension data = d.findElement(By.xpath("//table[@id='1234']//tr[3]"));
    int dd = d.findElements(By.xpath("//table[@id='123']//tr")).size();
    System.out.println(dd);
}
}
