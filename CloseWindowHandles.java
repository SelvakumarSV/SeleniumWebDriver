package SeleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowID = driver.getWindowHandles();
		//System.out.println(windowID);
		
		List<String> listID = new ArrayList<String>(windowID);
		
		String parentID = listID.get(0);
		String childID = listID.get(1);
		
		String title = driver.switchTo().window(childID).getTitle();
		System.out.println(title);
		
		String title2 = driver.switchTo().window(parentID).getTitle();
		System.out.println(title2);
		
		
		/*for(String winID:windowID) {
			
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close();  
			}
			
		}  */
		
		

	}

}
