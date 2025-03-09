package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.diffchecker.com/text-compare/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@aria-label='Close modal']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Original text input']")).sendKeys("Welcome to GBU");
		
		Actions act = new Actions(driver);
		
		//Ctrl + A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl + C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Ctrl + tab & Ctrl + tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl + V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
