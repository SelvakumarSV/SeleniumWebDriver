package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		//To perform mouse actions
		Actions act = new Actions(driver);
		
		//Left default slider element
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));  //(59, 256)
		//right default slider element
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));  // (510, 256)
		
		//Get the position of the slider elements
		System.out.println("The Default value of left slider : "+min_slider.getLocation());
		System.out.println("The Default value of right slider : "+max_slider.getLocation());
		
		//Sliding the slider to some position
		act.dragAndDropBy(min_slider, 159, 256).perform();
		act.dragAndDropBy(max_slider, -100, 256).perform();
		
		System.out.println();  //('\n') - Used for new line
		System.out.println("The value of left slider after change : "+min_slider.getLocation()); // (216, 249)
		System.out.println("The value of right slider after change : "+max_slider.getLocation()); // (410, 249)

	}

}
