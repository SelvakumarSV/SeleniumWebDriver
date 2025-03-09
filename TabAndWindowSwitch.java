package SeleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabAndWindowSwitch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//Open the below URL in another Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Open the below URL in another Window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		List<String> winIDs = new ArrayList(windowIDs);
		
		driver.switchTo().window(winIDs.get(1));
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("good bad ugly teaser");
		
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		
		//driver.switchTo().frame("passive_signin");
		
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/jl-sgSDwJHs/hq720.jpg?sqp=-oaymwEnCNAFEJQDSFryq4qpAxkIARUAAIhCGAHYAQHiAQoIGBACGAY4AUAB&rs=AOn4CLAId-pTGrS_Bl9m2V0yKa7EiIj0Lw']")).click();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//div[@id='below']")).click();
		
		act.sendKeys("F").perform();

	}

}
