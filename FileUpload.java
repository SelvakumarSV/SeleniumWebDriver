package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		//Single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Selenium\\Java Workspace\\Sample PDFs\\Sample1.pdf");
		
		String output = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		
		//Validation
		if(output.equals("Sample1.pdf")) {
			System.out.println("File upload successfull...");
		}
		else {
			System.out.println("File upload failed...");
		} */
		
		//Multiple File Upload
		String file1 = "D:\\Selenium\\Java Workspace\\Sample PDFs\\Sample1.pdf";
		String file2 = "D:\\Selenium\\Java Workspace\\Sample PDFs\\Sample2.pdf";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int count = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//Validation
		System.out.println(+count+" Files uploaded...");
		WebElement upload1 = driver.findElement(By.xpath("//ul[@id='fileList']//li[1]"));
		WebElement upload2 = driver.findElement(By.xpath("//ul[@id='fileList']//li[2]"));
		
		if(upload1.getText().equals("Sample1.pdf") && upload2.getText().equals("Sample2.pdf")) {
			
			System.out.println("File uploaded....");
			
		}
		else {
			
			System.out.println("File not uploaded...");
		}
		

	}

}
