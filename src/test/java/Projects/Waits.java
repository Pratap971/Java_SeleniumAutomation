package Projects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {
	
		public static void main(String[] args) {
			
			
	 /*  Waits- In Selenium, a wait is used to pause the execution of your test script until a 
		     certain condition is met or a maximum time is reached.
	 Types - 1) Implicit wait  2) Explicit wait. 3) Fluent wait 
		
	1) Implicit wait -Waits globally for a certain time for all elements.
	                 Applies automatically to every element lookup. */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.id("username")).sendKeys("ram");
		
		driver.findElement(By.id("password")).sendKeys("1234");
		
		driver.findElement(By.name("login")).click();
		
	//  2) Explicit Wait - Waits for a specific condition for a specific element.
//      Example: wait until a button is clickable.

// WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raju");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
		
		//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@value='1']"))));
		
		//	driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
		/* 3) Fluent wait - A more customizable version of explicit wait.
		
		 You can set polling time and ignore exceptions. */
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(3))
		.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@value='1']"))));
		
		driver.findElement(By.xpath("//button[@value='1']")).click();

		}

	}


