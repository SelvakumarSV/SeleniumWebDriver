package SeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//1. get() Method  --> Opens the URL on the browser. 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//2. getTitle() Method  ---> Returns title of the web page.
		/*String Title = driver.getTitle();
		System.out.println(Title);  */
		
		//2. i Alternate Method
		String Title = driver.getTitle();
		System.out.println(Title);    //OrangeHRM
		
		//3. getCurrentUrl() Method ---> Returns URL of the web page. 
		System.out.println(driver.getCurrentUrl());   //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//4. getPageSource() Method ---> Returns source code of the page.
		//System.out.println(driver.getPageSource());
		
		//5. getWindowHandle() Method --> Returns Window ID in the form of String of the Single Browser Window
		System.out.println("Window ID: "+driver.getWindowHandle());    //32AC83568B91B2BA3E850CFAAD2707F4
		
		//6. getWindowHandles() Method --> Returns Window IDs in the form of String of the Multiple Browser Window
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		
		//driver.close();
		

	}

}
