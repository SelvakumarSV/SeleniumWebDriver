package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Hitting the URL
		driver.get("https://www.youtube.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("good bad ugly teaser");
		
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='passive_signin']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/jl-sgSDwJHs/hq720.jpg?sqp=-oaymwEnCNAFEJQDSFryq4qpAxkIARUAAIhCGAHYAQHiAQoIGBACGAY4AUAB&rs=AOn4CLAId-pTGrS_Bl9m2V0yKa7EiIj0Lw']")).click();
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//div[@id='below']")).click();
		
		act.sendKeys("F").perform();
		
	}

}
