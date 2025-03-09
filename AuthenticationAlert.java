package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Syntax
		//"http://username:password@URL"
		
		Thread.sleep(4000);
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();

	}

}
