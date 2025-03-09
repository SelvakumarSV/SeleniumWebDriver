package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		
		//1. get() Method  --> Opens the URL on the browser. 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		
		Thread.sleep(9000);
		
		//driver.close();  // Close single browser at a time wherever the driver is focused.
		
		driver.quit(); // Close multiple browser at a time

	}

}
