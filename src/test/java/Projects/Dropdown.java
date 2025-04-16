package Projects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			// print on console all Dropdown values 
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
			
			driver.manage().window().maximize();
			
			WebElement dd = driver.findElement(By.name("coffee"));
			
			Select sc = new Select(dd);
			
			List<WebElement> o = sc.getOptions();
			
			System.out.println("Dropdown values :");
			
			for(WebElement x:o)
				
			{
				
				//System.out.println(x.getAttribute("value"));
				
				System.out.println(x.getText());  // for printing dropdown elements shown on ui
			}
			
			// Select dropdown values
			
			WebElement dd1 = driver.findElement(By.name("coffee"));
			
			Select sc1 = new Select(dd1);
			
			// sc1.selectByVisibleText("Black");
			
			// sc1.selectByIndex(3);
			
			sc1.selectByValue("regular");
			
			
			// select dropdown option = "Black"
			
			
			WebElement dd2 = driver.findElement(By.name("coffee"));
			
			Select sc2 = new Select(dd2);
			
			List<WebElement> web = sc2.getAllSelectedOptions();
			
			{
				for(WebElement x:web)
				{
					System.out.println(x.getText());
				}
			}

			
			// check multiple select options in dropdown.
			
					
			WebElement dd3 = driver.findElement(By.name("coffee"));
			
			Select sc3 = new Select(dd3);
			
			boolean s = sc3.isMultiple();
			
			System.out.println(s);
			
			// Select and Deselect element from Dropdown.
			
			
			WebElement w = driver.findElement(By.name("coffee2"));
			
			Select sc4 = new Select(w);
		
			 List<WebElement> webe =  sc.getOptions();
			 
			 for(int i =0; i<webe.size(); i++)
			 {
				 sc.selectByIndex(i);
				 try {
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				 
				 sc4.deselectByIndex(i);
			 }
			 
			// Select  and deselect element by value from Dropdown.
			 
			 WebElement aw = driver.findElement(By.name("coffee2"));
				
				Select sc5 = new Select(aw);
			
				 List<WebElement> webel =  sc5.getOptions();
				 
			     sc5.selectByValue("skim");
			     
			     sc5.selectByValue("whipped");

			     Thread.sleep(3000); 

			     sc5.deselectByValue("skim");
			     
			     sc5.deselectByValue("whipped");
		}

	}

