package Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//  check checkbox is selected or not.
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@value='Cricket']")).click();
			
			// for single element select
			
			/* boolean checkbox = driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected();
			
			if(checkbox == true)
			{
				System.out.println("checkbox is selected: ");
				
			}else
			{
				System.out.println("checkbox is not selected: ");
			}*/
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@value='Cricket']"));
			
			System.out.println(checkbox.isSelected());
			
			
			// multiple checkbox
			
			List<WebElement> checkbox2 =  driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			for(WebElement x:checkbox2)
			{
				x.click();
			}
			
			
			// partial select checkox
			
			 List<WebElement> d = driver.findElements(By.xpath("//input[@type='checkbox']"));
			 
			 for(int i=0; i<d.size(); i++)
			 {
				 if(d.get(i).getAttribute("value").equals("Cricket")||d.get(i).getAttribute("value").equals("Hockey"))
				 {
					 d.get(i).click();
				 }
				 
				 if(d.get(i).isSelected())
				 {
					 System.out.println(d.get(i).getAttribute("value"));
				 }
				 
			 }
				
				

			}
			
			

		}




