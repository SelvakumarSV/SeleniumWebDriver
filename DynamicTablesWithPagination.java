package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesWithPagination {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='input-username']"));
		userName.clear();
		userName.sendKeys("demo");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='input-password']"));
		passWord.clear();
		passWord.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//li[@id='menu-customer']//a[@class='parent collapsed']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String pageNumber = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int count = Integer.parseInt(pageNumber.substring(pageNumber.indexOf("(")+1,pageNumber.indexOf("Pages")-1));
		
		System.out.println(count);
		
		for(int r = 1; r<=5; r++) {
			
			if(r>1) {
				WebElement activePage = driver.findElement(By.xpath("//a[normalize-space()="+r+"]"));
				activePage.click();
			}
		}
		
		

	}

}
