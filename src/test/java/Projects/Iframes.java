package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
		public static void main(String[] args) {
			
	/*		Iframes - An <iframe> is an HTML element that embeds another HTML page
			          within the current page. Selenium cannot directly interact with elements 
			          inside an iframe unless it switches to it first.*/
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			
		//	driver.switchTo().frame("singleframe");  // search by frame name
			
		//	driver.switchTo().frame(0);   //search by index
			
	        WebElement frame = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	        
	        driver.switchTo().frame(frame);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
			
			

		}

	}


