package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//2. Hit the URL
		driver.get("https://www.geeksforgeeks.org/");
		
		//3. Validate the title
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("GeeksforGeeks A computer science portal for geeks")) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		
		//4. Close the browser
		
		

	}

}
