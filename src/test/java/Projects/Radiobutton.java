package Projects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Radio - button automation script.
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		boolean button = driver.findElement(By.xpath("//input[@value='Male']")).isEnabled();
		
		if(button == true)
		{
			System.out.println("Radio button is enabled.");
		}else
		{
			System.out.println("Radio button is disabled.");
		}
		
		

	}

}



