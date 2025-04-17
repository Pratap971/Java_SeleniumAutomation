package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebtables {

		public static void main(String[] args) {
			
	/* Static web Table - A static web table is a table whose structure and content don't change dynamically.
			              You can locate its rows and columns using standard locators. */
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.manage().window().maximize();
			
			// Print Row Size
			
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("Numbers of Rows: "+ rows);
		
		   // Print column size
		
	    int colms = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("Numbers of Columnss: "+ colms);
		
		// print single value in a table
		
	    String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]")).getText();
	    
	    System.out.println("Print Single BookName : " + value);
	    
	    // Print All Table Data
	    
	    System.out.println("Print Table : ");
	    
	    System.out.println("BookName" + "\t" +"Author" + "\t" + "Subject" + "\t" + "Price");
	    
	    for(int r = 2; r<=rows; r++)
	    {
	    	for(int c = 1; c<=colms; c++)
	    	{
	    	String data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    	
	    	System.out.print(data + "\t");
	    	}
	    	
	    	System.out.println();
	    }

		}

	}

