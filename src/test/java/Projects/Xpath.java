package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

     public static void main(String[] args) {
			
			// Xpath - Absolute xpath, relative xpath, css selector
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
			
			driver.findElement(By.id("pass")).sendKeys("1234");
			
		//	driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("1234");
			
	    //  css selector # + value if id is given.
			
		//	driver.findElement(By.cssSelector("#pass")).sendKeys("1234"); 
			
		//  css selector . +  class value if id is not given.
			
		//	driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("1234");
			
		//	driver.findElement(By.linkText("Forgotten password?")).click();
			
		//	driver.findElement(By.partialLinkText("Forgotten")).click();
			
		//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abdcg");
			
		//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asfs");
			
			

		}

	}

