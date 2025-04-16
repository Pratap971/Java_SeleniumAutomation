package Projects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

		public static void main(String[] args) throws InterruptedException {
			
			// Alerts
			
		//	1. simple pop-up Alert 
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			
		/*	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept(); */
			
			
		// 2. Alert with OK and Cancel button.
			
		/*	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();     // for ok button click
			
		//	driver.switchTo().alert().dismiss();    // for cancel button click  */
			
			
		
		// 3. Alert with Promt message.
			
		    driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().sendKeys("welcome back");
			
			driver.switchTo().alert().accept();
			
			

		}

	}

