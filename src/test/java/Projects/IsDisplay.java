package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub 
			
			// logo is Displayed or not check.
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			driver.manage().window().maximize();
			
			// print with 1st way.
			
			/*boolean logo = driver.findElement(By.xpath("//img[@style='height: 50px']")).isDisplayed();
			
			if(logo == true)
			{
				System.out.println("logo Available");
			}else
			{
				System.out.println("logo not Available");
			}*/
			
			// print with 2nd way.
			

			WebElement abc = driver.findElement(By.xpath("//img[@style='height: 50px']"));
			
			System.out.println(abc.isDisplayed());
			
			
			
			

		}

	}

