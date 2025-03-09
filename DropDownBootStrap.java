package SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownBootStrap {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		
		//printing options from dropdown
		/*for(WebElement op : options) {
			
			//System.out.println(op.getText());
		}*/
		
		//Selecting multiple dropdown checboxes
		for(WebElement op : options) {
			
			if(op.getText().equals("Python") || op.getText().equals("MySQL") || op.getText().equals("Oracle")) {
				op.click();
			}
		}
		
		

	}

}
