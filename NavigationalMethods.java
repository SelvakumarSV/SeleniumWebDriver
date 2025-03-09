package SeleniumAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//1. navigate().to()  URL - Class || myurl - Object || URL() - Constructor
		/*URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl); */
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//2. navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//3. navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		//4. navigate().refresh()
		driver.navigate().refresh();

	}

}
