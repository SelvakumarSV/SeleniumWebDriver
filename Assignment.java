package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://farescraper.com/?utm_source=bing&msclkid=1e8ff2a066dd1313bab29519106e4f3d&utm_medium=cpc&utm_campaign=FS-Generics-T%3AAsia_Africa-Dev%3ADesk%20tCPA%280.15Jan12%200.05Apr9%29&utm_term=dummy%20flight%20ticket&utm_content=Return%20-%20BMM");
		driver.manage().window().maximize();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@data-testid='close-newsletter-modal']")).click();
		
		
		
		

	}

}
