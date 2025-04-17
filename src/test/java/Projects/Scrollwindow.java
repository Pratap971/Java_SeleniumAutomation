package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollwindow {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			// window scrolling using javascript executor and input y-axis value.
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			 
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
		//	js.executeScript("window.scrollBy(0,300)");   // scroll to down on y-axis
			
		//	js.executeScript("window.scrollBy(0,-300)");  // scroll to upward direction.
			
			// full screen scroll 
			
			WebElement scr =  driver.findElement(By.xpath("//button[@id='submitbtn']"));
			
			js.executeScript("arguments[0].scrollIntoView()", scr);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

		}

	}

