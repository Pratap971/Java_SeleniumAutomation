package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
				
	// file upload
				
	 WebDriver driver = new ChromeDriver();
				
	 driver.get("https://demo.automationtesting.in/Register.html");
				
	 driver.manage().window().maximize();
				
	driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\Pratap\\Pictures\\10.png");


	}

}
