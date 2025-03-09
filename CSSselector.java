package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
		//1. tag id  ---> tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
		
		//1.i Alternate method
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
		
		//2. tag class ---> tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirt");
		
		//3. tag attribute --> tag[attribute="value"]
		//driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("T-Shirt");
		
		//4. tag class attribute ---> tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("T-Shirt");
		
		driver.findElement(By.className("ytSearchboxComponentHost ytSearchboxComponentDesktop ytd-masthead ytSearchboxComponentHostDark")).sendKeys("TVK Flag Anthem");
		driver.findElement(By.xpath("//yt-icon-button[@id='search-button-narrow']")).click();

	}

}
