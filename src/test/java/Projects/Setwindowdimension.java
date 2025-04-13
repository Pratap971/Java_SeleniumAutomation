package Projects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setwindowdimension {


		public static void main(String[] args) {
			
			// Set dimension of window 
		
			WebDriver driver = new ChromeDriver();
			
	        driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			Dimension d = new Dimension(250, 250);
			
		//	driver.manage().window().setSize(d);
			
			Point p = new Point(300, 300);
			
			driver.manage().window().setPosition(p);
			
			

		}

	}


