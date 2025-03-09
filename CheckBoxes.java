package SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumbase.io/demo_page");
		
		//1. select particular checkbox
		
		/*boolean checkbox = driver.findElement(By.xpath("//input[@id='checkBox2']")).isSelected();
		System.out.println("Checkbox is selected? "+checkbox);  //Checkbox is selected? false
		
		driver.findElement(By.xpath("//input[@id='checkBox2']")).click();
		
		boolean checkbox2 = driver.findElement(By.xpath("//input[@id='checkBox2']")).isSelected();
		System.out.println("Checkbox is selected? "+checkbox2);  //Checkbox is selected? true */
		
		//Get how many checkboxes are present
		
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@class='checkBoxClassB']"));
		
		System.out.println(checkBoxList.size());  //3
		
		
		
		//2. Selecting all the checkboxes
		/*for(int i = 0; i < checkBoxList.size(); i++) {
			
			checkBoxList.get(i).click();
		}*/
		
		//2.i. Enhanced for loop(Alternate Method)
		
		/*for(WebElement chkbox:checkBoxList) {
			
			chkbox.click();
			
		}
		*/
		
		//3. Select last 2 check boxes
		
		/*for(int i = 1; i < checkBoxList.size(); i++) {
			
			checkBoxList.get(i).click();
		}
		*/
		//4. Select first 2 check boxes
		
		/*for(int i = 0; i < 2; i++) {
			
			checkBoxList.get(i).click();
		}*/
		
		
		//5. Select the unselected and unselect the selected
		
		/* for(int j = 0; j < checkBoxList.size(); j++) {
			
			if( checkBoxList.get(j).isSelected() == true) {
				checkBoxList.get(j).click();
				System.out.println("UnSelected! index["+j+"]");               //UnSelected! index[0], UnSelected! index[1]
			}
			else {
				checkBoxList.get(j).click();
				System.out.println("Selected! index["+j+"]");         //Selected! index[2]
			}
		} 
*/
		//5.i Alternate method
		
		/*for(WebElement j : checkBoxList) {
			
			j.click();
		
		}*/
		
		//5.ii unselect & select
		/*for(WebElement j : checkBoxList) {
			
			if(j.isSelected() == true) {
				j.click();
			}
			else {
				j.click();
			}
		}
		
		Thread.sleep(3000);
		
		for(WebElement j : checkBoxList) {
			
			if(j.isSelected() == true) {
				j.click();
			}
			else {
				j.click();
			}
		} */
		
		//6. check specific checkboxes randomly
		
		for(int i = 0 ; i < checkBoxList.size(); i++) {
			
			if(i == 0 || i == 2) {
				checkBoxList.get(i).click();  // 1st and 3rd
			}
		}
	}

}
