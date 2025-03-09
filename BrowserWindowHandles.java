package SeleniumAutomation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> winID = driver.getWindowHandles();
		
		//System.out.println(winID);
		
		// Set to List
		
		//Approach 1  || 2 or 3 browser windows
		/*List<String> listID = new ArrayList<String>(winID);
		
		//System.out.println(listID);
		
		String firstPage = listID.get(0);
		String secondPage = listID.get(1);
		
		//System.out.println(firstPage);
		//System.out.println(secondPage);
		
		driver.switchTo().window(secondPage);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().window(firstPage);
		System.out.println(driver.getTitle());  */
		
		//Approach 2 || Multiple browser windows
		for(String windowID:winID) {
			String title = driver.switchTo().window(windowID).getTitle();
			
			if(title.equals("OrangeHRM, Inc")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
	}

}
