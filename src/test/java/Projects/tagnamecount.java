package Projects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamecount {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// count the tagname and print them.
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			driver.manage().window().maximize();
			
			List<WebElement> d = driver.findElements(By.tagName("a"));
			
			System.out.println("numbers of <a> tag elements: "+ d.size());
			
			for(WebElement a:d)
			{
				System.out.println(a.getAttribute("href"));
			}

		}

	}

