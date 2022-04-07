package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    Thread.sleep(2000);
    WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select s=new Select(date);
    s.selectByIndex(5);
    boolean value = s.isMultiple();
    System.out.println(value);
    
}
}
