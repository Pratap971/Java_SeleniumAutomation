package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_drpdown {

	public static void main(String[] args) {
		
		//type - 2: Datepicker with Dropdown Month & Year.
		
		  WebDriver driver = new ChromeDriver();

	        driver.get("https://testautomationpractice.blogspot.com/"); 
	        driver.manage().window().maximize();

	        String requiredYear = "2023";
	        String requiredMonth = "Aug";
	        String Date = "15";

	        // Click to open the date picker
	        driver.findElement(By.xpath("//input[@id='txtDate']")).click();

	        // Select month from dropdown
	        Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	        monthDropdown.selectByVisibleText(requiredMonth);

	        // Select year from dropdown
	        Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	        yearDropdown.selectByVisibleText(requiredYear);

	        // Click the required date
	        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a")).click();

	        
	    }
	

	}


