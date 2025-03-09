package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		//right click
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		//performing right click
		act.contextClick(rightClick).perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		copy.click();
		
		//Get the value of alert and click OK
		String alertValue = driver.switchTo().alert().getText();
		System.out.println("The prompted value in alert : "+alertValue);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
