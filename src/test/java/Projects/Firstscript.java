package Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firstscript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	//  driver.manage().window().minimize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Title : " + driver.getTitle());
		
  //    System.out.println("PageSource : " + driver.getPageSource());
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.manage().window().fullscreen();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	//	driver.close();   // for closing current or single window.
		
	//	driver.quit();  // for closing multiple window or tab
		
		
		

	}

}


