package NaviCmdsAndWindowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowerWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 
		Set<String> WindowsIDs=driver.getWindowHandles();
		
	//	Approch:1
		
	  List<String> windowslist= new ArrayList(WindowsIDs);
	  
	  String parentID = windowslist.get(0);
	  String childID = windowslist.get(1);
	  
	   System.out.println(driver.getTitle());
	 
	   // Switch to child window
	   driver.switchTo().window(childID);
	   System.out.println(driver.getTitle());
	  
	// Switch to parent  window
	   driver.switchTo().window(parentID);
	   System.out.println(driver.getTitle());
		
		
	   
	   //Approch2 ;
	   
	   for(String winID: WindowsIDs)
	   {
	     String title = driver.switchTo().window(winID).getTitle();
	     
	     if(title.equals("OrangeHRM"))
	     {
	    	 System.out.println(driver.getCurrentUrl());
	     }
	   
	}

}
}
