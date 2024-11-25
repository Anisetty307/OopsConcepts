package WaitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver=new ChromeDriver();  // shift+ctrl+o --> To import the packages 
        
        
        WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(10));   //Decalartion 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
		WebElement txtuser = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		 
		txtuser.sendKeys("Admin");
		
		WebElement txtpsw = Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		
		txtpsw.sendKeys("admin123");
		
		WebElement Lgnbtn= Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		Lgnbtn.click();
		
	}

}
