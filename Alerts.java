package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		driver.manage().window().maximize();
		
		//1. Normal Alert with Ok button
		/*driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept(); */
		
		//2. Confirmation Alert with Ok & Cancel
		/*driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
*/
		//3. Prompt Alert - input box
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		System.out.println("Text in prompt : "+myalert.getText());
		myalert.sendKeys("Welcome...!");
		//myalert.accept();
		myalert.dismiss();
	}

}
