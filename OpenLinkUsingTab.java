package SeleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkUsingTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act = new Actions(driver);
		
		//Ctrl + Click on Register
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		//Get the windowIDs in Set<String>
		Set<String> windowIDs = driver.getWindowHandles();
		
		//Convert Set into List, so that we can use get method
		List<String> winIDs = new ArrayList(windowIDs);
		
		driver.switchTo().window(winIDs.get(1));
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
	}

}
