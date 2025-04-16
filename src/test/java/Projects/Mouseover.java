package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	
		public static void main(String[] args) {
			
	/* Mouse Over in Selenium: It is a hover action where the cursor moves over an element
			
	   without clicking. In Selenium, it is done using the Actions class with moveToElement(). */
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://demo.automationtesting.in/Alerts.html");
			
		driver.manage().window().maximize();
			
//		WebElement msover =	driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(msover).build().perform();
		
		WebElement abc = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		act.contextClick(abc).build().perform();         // for right click on mouse
			
			

		}

	}

