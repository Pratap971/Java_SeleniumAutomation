package Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		// Swith to frame 
		
		driver.switchTo().frame(0);
		
		// Method -1 : using sendkeys
		
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/5/2015");
		
		// Method -2 : using datepicker
		
		// expectd data
		String year = "2019";
		String month = "May";
		String date = "29";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// Select Month & Year
		
		while(true)
		{
			// Actual data on datepicker
		String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentMonth.equals(month) && currentYear.equals(year))
		{
			break;
		}
		
	//	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
		}
		
       List<WebElement>allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		

       for(WebElement dt:allDates)
       {
    	  if (dt.getText().equals(date))
    	  {
    		  dt.click();
    		  
    		  break;
    	  }
       }
	}

}
