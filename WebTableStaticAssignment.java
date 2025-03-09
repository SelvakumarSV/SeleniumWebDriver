package SeleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableStaticAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select departure = new Select(dropDown1);
		
		departure.selectByValue("San Diego");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destination = new Select(dropdown2);
		
		destination.selectByValue("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		//System.out.println("Number of rows : "+rows); //Number of rows : 5
		
		int columns = driver.findElements(By.xpath("//table[@class='table']//thead//tr//th")).size();
		//System.out.println("Number of columns : "+columns);  //Number of columns : 6
			
		List<WebElement> values = driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td[6]"));
		//System.out.println("Size of Price Column : "+values.size()); //5
		
		/*for(int i = 0; i<values.size();i++) {
			
			String Price = values.get(i).getText();
			//System.out.println(Price);
			
		}*/
		
		//Sorting the String
		List<String> strings = new ArrayList<>();
        for (WebElement element : values) {
            strings.add(element.getText());
        }

        // Sort the list of strings
        Collections.sort(strings);

        // Print the sorted list
        for (String str : strings) {
           //System.out.println(str);
           
           if(str.contains("$200")) {
        	   driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
           }
        }
        
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Selvakumar S V");
        
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("No:123, Karthikeyapuram 2nd cross street, Madippakkam");
        
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
        
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Tamil Nadu");
        
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("600091");
        
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='cardType']"));
        
        Select dropdown = new Select(dropdown1);
        
        dropdown.selectByValue("visa");
        
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("xxxx xxxx xx46");
        
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("06");
        
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2001");
        
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Selvakumar S V");
        
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        boolean output = driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your')]")).isDisplayed();
        if(output == true) {
        	System.out.println("Test Passed...........");
        }
        else {
        	System.out.println("Test Failed...........");
        }
        Thread.sleep(2000);
        driver.quit();
	}

}
