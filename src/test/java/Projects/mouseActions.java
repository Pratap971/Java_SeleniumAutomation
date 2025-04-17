package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
	
public static void main(String[] args) {
		
		// Double-click mouse
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
	/*	WebElement abc = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(abc).perform(); */
		
		// Double-click mouse with actions
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebElement def = driver.findElement(By.xpath("//a[normalize-space()='WebTable']"));
		
		Actions actu = new Actions(driver);
		
		actu.click(def).perform();
		
		
		
		}


	}


