package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//Login
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(3000);
	//Click on PIM
	driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	Thread.sleep(3000);
	
	//Click on dropdown 
	driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
	Thread.sleep(15000);
	//Single options
	//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
	
   // Total option 
	 List<WebElement> allops=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	
	System.out.println("Total job titles :"+allops.size());
	
	//printing all the options 
	for(WebElement Op:allops) {
		
	  System.out.println(Op.getText());
	}
	
	
		
		
		
	
	}

}
