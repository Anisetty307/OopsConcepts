package WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleepcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();  // shift+ctrl+o --> To import the packages 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		 
		 
		
		
		
		
		
		
		
		
	}

}
