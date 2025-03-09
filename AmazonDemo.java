package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Mobiles' and @class='nav-a  ']")).click();
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//driver.findElement(By.xpath("//img[@alt='Fastrack Limitless Glide Smart Watch, Advanced UltraVU HD Display, SingleSync BT Calling, Advance Chipset, 85+ Sports Modes & Smartwatch Faces, AI Voice Assistant, 24 * 7 Health Suite, IP67 (Black)']")).click();
		
		
		

	}

}
