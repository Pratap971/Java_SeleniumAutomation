package Projects;


    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	
	public class Getattributevalues {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print the username in console which is input by user.
			
	  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pratap");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1235");
		
		String abc = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		
		System.out.println(abc);
			
			

		}

	}


