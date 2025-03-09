package SeleniumAutomation;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args)throws NoSuchElementException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://netoxygen-securitytesting.wgsneto.com/NetOxygen/fw_c2/GFXsite.htm");
		
		//driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/#no-such-element-exception");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='username'][@name='username']")).sendKeys("$processor@demo");
		
		//driver.findElement(By.cssSelector("input.logonFldDefault[id='username'][placeholder='User Name']")).sendKeys("$processor@demo");
		
		//1. X Path with Single Attribute
		//driver.findElement(By.xpath("//a[@title='Home']")).click();
		
		//2. X Path with Multiple Attribute
		//driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer'][@title='Home']")).click();
		
		//3. X Path with and Operator
		/*driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title' and @placeholder='Search']")).sendKeys("Vaa Kannamma");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		System.out.println("Test Passed");    */
		
		//4. X Path with OR Operator
		/*driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title' or @placeholder='Search']")).sendKeys("Vaa Kannamma");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		System.out.println("Test Passed");      */
		
		//5. X Path with Inner Text Value
		/*boolean Value = driver.findElement(By.xpath("//h2[text()='NoSuchElementException']")).isDisplayed();
		System.out.println(Value);
		
		String text = driver.findElement(By.xpath("//a[text()='CSS Validator']")).getText();
		System.out.println(text);      */
		
		
		//6. X Path with contains()
		//driver.findElement(By.xpath("//input[contains(@class,'ytSear')]")).sendKeys("Vaa Kannamma");
		
		//7. X Path with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@class,'ytSearchboxCompon')]")).sendKeys("Vaa Kannamma");
		
		//8. Chained X Path
		boolean Verify = driver.findElement(By.xpath("//div[@id = 'logo']/a/img")).isDisplayed();
		System.out.println(Verify);
		

	}

}
