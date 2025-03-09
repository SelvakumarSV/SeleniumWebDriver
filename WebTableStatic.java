package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableStatic {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		driver.manage().window().maximize();
		
		//Counting rows
		int rows = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr")).size();
		System.out.println("Number of Rows : "+rows);
		
		//Counting Columns
		int columns = driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//thead//th")).size();
		System.out.println("Number of Columns : "+columns);
		
		//Get the value of 4th row and 5th column
		String tableValue = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr[1]//td[1]")).getText();
		//System.out.println("The Value in 1st row and 1st column is "+tableValue);
		
		//Printing headers
		//System.out.println("First Name"+"\t"+"Last Name"+"\t"+"Age"+"\t"+"Email"+"\t"+"Salary"+"\t"+"Department"+"Action");
		
		//Printing all the rows and columns
		/*for(int i = 2; i <= rows; i++) {
			
			for(int j = 1 ; j <= columns; j++) {
				
				String result = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(result+"\t");
			}
			System.out.println();
		} 
		*/
		/*System.out.println("First Name"+"\t"+"Department");
		//Printing Firstname whose Department is Compliance
		for(int i = 1; i<= rows; i++) {
			String result = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//td[6]")).getText();
			//System.out.print(result);
			
			if(result.equals("Compliance")) {
				String firstName = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//td[1]")).getText();
				System.out.println(firstName+"\t"+"\t"+result);
			}
			
		}
		System.out.println(); */
		
		//adding the values
		int total = 0;
		for(int i = 1; i<= rows; i++) {
			String result = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+i+"]//td[5]")).getText();
			//System.out.println(result);
			total = total + Integer.parseInt(result);			
		}
		System.out.println("Total Salary: "+total); //38000
		driver.quit();

	}

}
