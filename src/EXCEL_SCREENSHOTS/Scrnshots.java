package EXCEL_SCREENSHOTS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrnshots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHZN_enIN994IN994&oq=gmail&aqs=chrome..69i57j69i59j0i67j0i67i433j0i433i512j69i61j69i60l2.907j0j7&sourceid=chrome&ie=UTF-8");
    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File f1=new File("C:\\Users\\BHAGYASHREE RAUT\\Desktop\\Screenshot\\img.png");
    FileHandler.copy(f, f1);
    System.out.println("Screenshot Captured");

}
}
