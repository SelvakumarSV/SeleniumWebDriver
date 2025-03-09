package SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	
	//Capture Future Date Pickers
	static void selectFuture(WebDriver driver, String month, String date, String year) {
		
		while(true) {
			
			String yearPick = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String monthPick = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(yearPick.equals(year) && monthPick.equals(month)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//Capture Date
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt : dates) {
			
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	
	//Capture Past Date Pickers
	
	static void selectPast(WebDriver driver, String month, String date, String year) {
		
		while(true) {
			
			String yearPick = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String monthPick = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if(yearPick.equals(year) && monthPick.equals(month)) {
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//Capture Date
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt : dates) {
			
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  //Switch to frame(only one frame in entire web Page)
		
		//Method 1 : Using SendKeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/20/2025");        //mm/dd/yyyy
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String date = "18";
		String month = "June";
		String year = "2024";
		
		//selectFuture(driver,month, date,year);
		selectPast(driver,month, date,year);

	}

}
