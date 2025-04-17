package Projects;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	
		public static void main(String[] args) {
			
			// window/Tab Handling
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			
			driver.manage().window().maximize();
			
		//	String windowID =  driver.getWindowHandle();
			
		//	System.out.println(windowID);
			
			driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
			
			Set<String> windowIDs = driver.getWindowHandles();
			
			// System.out.println(windowIDs);
			 
			  Iterator<String> it = windowIDs.iterator();
			  
			 String parentID = it.next(); // for print value
			 
			 String childID = it.next();
			 
			 driver.switchTo().window(parentID);
			 
			 System.out.println("Parent window Title: " + driver.getTitle());
			 
			 driver.switchTo().window(childID);
			 
			 System.out.println("child window Title : " + driver.getTitle());
			 
			 driver.close(); // close single current window
			 
		//	 driver.quit();  // close all window.
			
		
		}

	}

