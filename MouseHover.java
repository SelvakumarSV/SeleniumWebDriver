package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		
		Actions act = new Actions(driver);
		
		//.perform() is mandatory in mouse actions
		//.build() is optional in this scenario
		act.moveToElement(component).build().perform();
		act.moveToElement(monitors).click().perform();

	}

}
