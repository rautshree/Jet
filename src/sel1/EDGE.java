package sel1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EDGE {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com");
	}

}
