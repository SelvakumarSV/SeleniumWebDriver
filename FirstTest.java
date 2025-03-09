package SeleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Launch Browser(Chrome)
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//2)Open URL https://www.youtube.com/
		
		driver.get("https://www.youtube.com/");
		
		//3)Validate title should be "YouTube"
		
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("YouTube")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4)Close the browser
		
		driver.close();

	}

}
