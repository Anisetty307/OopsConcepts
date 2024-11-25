package HandlingCheckBoxesAndAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
	//	1)normal alert with OK button 
		
	//	driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='alertexamples']")).click();
		
	/*	// Thread.sleep(3000);
	//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		Alert Myalert =driver.switchTo().alert();
		System.out.println(Myalert.getText());
	     Myalert.accept(); 
	     
	 //2)Confirmation alert for ok & cancel
	     driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='confirmexample']")).click();
	    
	     Thread.sleep(3000); 
	     
	   //  driver.switchTo().alert().accept();
	     driver.switchTo().alert().dismiss();  */
	     
	//   3) prompt alert  
	     
	    driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='promptexample']")).click();
	     
	   Alert prompt= driver.switchTo().alert();
	   
	   prompt.sendKeys("Hello");
	   Thread.sleep(3000);
	   prompt.accept();
	   
		
	}

}
