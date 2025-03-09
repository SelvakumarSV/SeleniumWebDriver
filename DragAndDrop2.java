package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement drag1 = driver.findElement(By.xpath("//li[@id='credit2']"));
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ol[@id='bank']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ul/li[4]"));
		
		WebElement drop2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		act.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ul/li[6]"));
		
		WebElement drop3 = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		act.dragAndDrop(drag3, drop3).perform();
		
		WebElement drag4 = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ul/li[2]"));
		
		WebElement drop4 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		act.dragAndDrop(drag4, drop4).perform();
		
		boolean verify = driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed();
		
		if(verify == true) {
			System.out.println("It's Perfect");
		}
		else {
			System.out.println("It's not Perfect... Need to look more into this");
		}
		

	}

}
