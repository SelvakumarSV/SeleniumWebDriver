package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NetOxygen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Driver
		WebDriver driver = new EdgeDriver();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
		//Hitting the URL
		driver.get("https://netoxygen.wgsneto.com/netoxygen/fw_c2/GFXSite.htm");
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Switch to Credentials Frame
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='GFXLogonFrame']"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("$originator@demo");
		
		driver.findElement(By.id("password")).sendKeys("Cert@orig04!");
		
		driver.findElement(By.xpath("//input[@id='Submit1']")).click();
		
		//Switch to default page
		driver.switchTo().defaultContent();
		
		//Switch to selecting Originator1/Originator2 whole page frame
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='GFXLogonFrame']"));
		
		driver.switchTo().frame(frame2);
		
		//Switch to selecting Originator1/Originator2 mini frame
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='grpselect']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@id='btnOk']")).click();
		
		/*String result = driver.findElement(By.xpath("//input[@id='username']")).getText();
		
		if(result.contains("Admin")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}*/

		//driver.findElement(By.xpath("//input[@id='username'][@name='username']")).sendKeys("$processor@demo");
		
		//driver.findElement(By.id("password")).sendKeys("Gal-proc2024@demo!");   */
		
		
		/*WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://netoxygen.wgsneto.com/netoxygen/fw_c2/GFXSite.htm");
		
		driver.manage().window().maximize();
		
		WebElement userID = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		userID.sendKeys("Admin"); */
		
		//myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).sendKeys("admin123");
		
		//myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Submit1']"))).click();
		
		
	}

}
