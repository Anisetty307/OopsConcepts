package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     WebDriver driver=new ChromeDriver();  // shift+ctrl+o --> To import the packages 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Implicit wait 
		 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
	//	driver.close();
		
	}

}
