package SeleniumAutomation;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumbase.io/demo_page");
		
		driver.manage().window().maximize();
		
		//1. Select Dropdown
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='mySelect']"));
		Select dropDown = new Select(dropDownElement);
		
		//1. i select option from dropdown
		//dropDown.selectByVisibleText("Set to 75%");   //Text shown on UI
		//dropDown.selectByValue("100%");               //Attribute value of an element
		dropDown.selectByIndex(1);                      //Index value of the element, need to calculate manually
		
		//Capture the size of the select element
		List<WebElement> option = dropDown.getOptions();
		System.out.println("The number of dropdown is "+option.size());  //4
		
		/*for(int i = 0; i < option.size(); i++) {
			
			System.out.println(option.get(i).getText());
		} */
		
		for(WebElement op : option) {
			
			System.out.println(op.getText());
		}

	}

}
