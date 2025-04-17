package Projects;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
		public static void main(String[] args) {


			// Take Screenshot of full window.
			
			WebDriver driver = new ChromeDriver();
			
		/*	driver.get("https://demo.automationtesting.in/Static.html");
			
			driver.manage().window().maximize();
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			
		 File src =	tk.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("D:\\Java\\Automation\\screenshot\\abc.png");
		 
		 try 
		 {
			FileUtils.copyFile(src, dest);
		} 
		 catch (IOException e) 
		 {
			
			e.printStackTrace();
		}*/
		 
		// Take screenshot of selected part of window.
		 
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 driver.manage().window().maximize();
		 
		 WebElement scrn = driver.findElement(By.xpath("//img[@id='imagetrgt']"));
		 
		File src = scrn.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//screenshot//xyz.png");
		
		src.renameTo(dest);

		}

	}

