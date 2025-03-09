package SeleniumAutomation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//Zoom out to 80%
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='80%'"); */
		
		//1) Takes Full Page
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\Fullpage.png");
		source.renameTo(target);*/
		
		//2) Take Specific area of web page
		/*WebElement area = driver.findElement(By.xpath("//div[@id='desktop-grid-2']"));
		File source = area.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\SpecificArea.png");
		source.renameTo(target);   */
		
		//3) Take Specific Element
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\SpecificElement.png");
		source.renameTo(target);
		
		
		driver.quit();

	}

}
