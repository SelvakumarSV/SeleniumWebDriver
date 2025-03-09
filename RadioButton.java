package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumbase.io/demo_page");
		
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='radioButton1']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@id='radioButton2']"));
		
		System.out.println("Before Selecting......");
		
		if(radio.isSelected() == true) {
			System.out.println("Radio 1 is Selected");   //1. Radio 1 is Selected
		}
		else {
			System.out.println("Radio 1 is UnSelected");  
		}
		if(radio2.isSelected() == true) {
			System.out.println("Radio 2 is Selected");  
		}
		else {
			System.out.println("Radio 2 is UnSelected");    //2. Radio 2 is UnSelected
		}
		
		Thread.sleep(3000);
		
		radio2.click();
		
		System.out.println("After Selecting......");
		
		if(radio.isSelected() == true) {
			System.out.println("Radio 1 is Selected");
		}
		else {
			System.out.println("Radio 1 is UnSelected");     //3. Radio 1 is UnSelected
		}
		if(radio2.isSelected() == true) {
			System.out.println("Radio 2 is Selected");     //4. Radio 2 is Selected
		}
		else {
			System.out.println("Radio 2 is UnSelected");
		}
		

	}

}
