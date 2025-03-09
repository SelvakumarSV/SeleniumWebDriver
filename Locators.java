package SeleniumAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//2. Hit the URL
		//driver.get("https://netoxygen-securitytesting.wgsneto.com/NetOxygen/fw_c2/GFXsite.htm");
		
		//driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		//3. Locate the search //name
		/*WebElement searchBox = driver.findElement(By.name("search_query"));
		searchBox.sendKeys("Vaa Kannamma");*/
		
		//3.i Alternate Method:
		//driver.findElement(By.name("search_query")).sendKeys("TVK Flag Anthem");
		
		//WebElement Click = driver.findElement(By.xpath("//div/div/yt-searchbox/button[@class='ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark']"));
		//Click.click();
		
		//4. Check the logo //id
		/*Boolean status = driver.findElement(By.id("logo-icon")).isDisplayed();
		System.out.println("The Logo is present: "+status);*/
		
		//5. i LinkText  --> Only for Links
		//driver.findElement(By.linkText("Foundational Courses")).click();
		
		//5.ii PartialLinkText --> Only for Links
		//driver.findElement(By.partialLinkText("Found")).click();
		
		//6. Classname
		/* List<WebElement> count = driver.findElements(By.className("link"));
		System.out.println("count: "+count.size()); //21   */
		
		//7. Tagname
		/* List<WebElement> count2 = driver.findElements(By.tagName("a"));
		System.out.println(count2.size());      */
		
		
		//Count total number of Links
		/* List<WebElement> LinkCount = driver.findElements(By.tagName("a"));
		System.out.println("LinkCount: "+LinkCount.size());
		
		//Count total number of images
		List<WebElement> imageCount = driver.findElements(By.tagName("img"));
		System.out.println("ImageCount: "+imageCount.size());
		
		//Click any link
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		//driver.close();   */
		
		//Thread.sleep(9000);
		
		//driver.findElement(By.cssSelector("input.logonFldDefault[id=\"username\"]")).sendKeys("$processor@demo");
		
		//WebElement Username = driver.findElement(By.name("username"));
		//Username.sendKeys("$processor@demo");
		
		driver.findElement(By.xpath("//input[@id='username'][@name='username']")).sendKeys("$processor@demo");
		
		//driver.findElement(By.id("password")).sendKeys("Gal-proc2024@demo!");
		
		
		//driver.findElement(By.id("btnOk")).click();
		
		

	}

}
