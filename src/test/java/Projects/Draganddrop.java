package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
		public static void main(String[] args) {
			
			// Drag and Drop src images to different locations.
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Static.html");
			
			driver.manage().window().maximize();
			
		    WebElement source = driver.findElement(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//img[@id='angular']"));
		    
		    WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));
		    
		    Actions act = new Actions(driver);
		    
		    act.dragAndDrop(source, dest).build().perform();
		     

		}

	}

