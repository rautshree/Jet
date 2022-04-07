package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hidden_Division_Popup {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
}
}
