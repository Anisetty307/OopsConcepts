package Webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// short cut for packages import shift+ctrl+o
				WebDriver driver=new ChromeDriver();
				
				
				// get(url) - open the url on the brower
				 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				 Thread.sleep(3000);
				 
				 
				 // getTitle() - returns title of the url 
				  System.out.println(driver.getTitle());  // orangeHRM
				  
				  //getCurrentURL() - return URLa of the browser
				 System.out.println(driver.getCurrentUrl()); 
				 
				 // getPageSource - return source code of the page
				//System.out.println(driver.getPageSource());
				
		        // getWindowHandle()- return ID of the single browser
			  // String windowid=driver.getWindowHandle();
			   //System.out.println("Window id "+windowid);
			   
			   //getWindowsHandles()- return id of the multiple browser windows
			   driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			   
			   Set<String> Windowids= driver.getWindowHandles();   // set is allow only unique value , list is duplicate value also allow
			   System.out.println(Windowids);
			   
			   //driver.close(); - will close single window
			   // driver.quite(): -- will close all the windows.
	
	
	}

}
