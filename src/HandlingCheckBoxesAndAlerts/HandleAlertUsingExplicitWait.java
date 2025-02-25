package HandlingCheckBoxesAndAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofMinutes(10)); // Explicit wait 
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='alertexamples']")).click();
		
	    Thread.sleep(3000);
	    
	    Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
	    
	    System.out.println(myalert.getText());
	    myalert.accept();
	    
		
		
		
	}

}
