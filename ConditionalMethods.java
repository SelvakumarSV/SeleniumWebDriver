package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		//isDisplayed()
		boolean displayed = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("The Logo is displayed : "+displayed);
		
		//isEnabled()
		boolean enabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("The text box is enabled : "+enabled);
		
		//isSelected()
		WebElement male_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_button = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before clicking--------");
		male_button.isSelected();
		female_button.isSelected();
		if(male_button.isSelected() == false) {
			System.out.println("Male Unchecked");
		}
		else {
			System.out.println("Male checked");
		}
		if(female_button.isSelected() == false) {
			System.out.println("Female Unchecked");
		}
		else {
			System.out.println("Female checked");
		}
		System.out.println("After Clicking-------");
		/*male_button.click();
		if(male_button.isSelected() == false) {
			System.out.println("Male Unchecked");
		}
		else {
			System.out.println("Male checked");
		}*/
		female_button.click();
		if(female_button.isSelected() == false) {
			System.out.println("Female Unchecked");
		}
		else {
			System.out.println("Female checked");
		}

	}

}
