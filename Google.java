package SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("portal.azure.com");
		
		//Check the size of the List
		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li[@role='presentation']//div[@class='lnnVSe']"));
		System.out.println(searchList.size());
		
		//Printing all the Listed items
		/*for(int i = 0; i < searchList.size(); i++) {
			
			System.out.println(searchList.get(i).getText());
		}*/
		
		//Click on the items
		for(int i = 0; i < searchList.size(); i++) {
			
			if(searchList.get(i).getText().equals("portal.azure.com")) {
				searchList.get(i).click();
				break;
			}
			
		}
		WebElement frames = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[@class='recaptcha-checkbox-border']")).click();
		//driver.findElement(By.xpath("//div[@role='presentation' and @class='recaptcha-checkbox-border']")).click();
		
		

	}

}
