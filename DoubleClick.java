package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement input1 = driver.findElement(By.xpath("//input[@id='field1']"));
		
		WebElement input2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		input1.clear();
		
		input1.sendKeys("Selva");
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClick).perform();
		
		//Get the attribute's value of the input box
		String output1 = input1.getAttribute("value");
		String output2 = input2.getAttribute("value");
		
		if(output2.equals(output1)) {
			System.out.println("Values are same...!!! and the value is "+output2);
		}
		else {
			System.out.println("Values are not same and the value is "+output2);
		}

	}

}
