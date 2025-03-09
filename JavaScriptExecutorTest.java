package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement button = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//JavascriptExecutor js = driver;
		
		//sendKeys
		js.executeScript("arguments[0].setAttribute('value','Selva')", inputBox);
		
		//click()
		js.executeScript("arguments[0].click()", button);

	}

}
