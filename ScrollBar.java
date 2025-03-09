package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1. Scroll down page by pixel number
		/*js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); */ //1538.6666259765625
		
		//2. Scroll till the element is visible
		/*WebElement text = driver.findElement(By.xpath("//span[text()='No cost EMI up to 24 months | Starting ₹4,433 INR/month*']"));
		js.executeScript("arguments[0].scrollIntoView();", text);
		System.out.println(js.executeScript("return window.pageYOffset;")); */ //1156
		
		//3. Scroll till last
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //4510
		
		Thread.sleep(3000);
		
		//4. Back to original position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //0

	}

}
