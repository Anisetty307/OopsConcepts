package NaviCmdsAndWindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrwerWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 
		Set<String> WindowsIDs=driver.getWindowHandles();
	
		 
		   for(String winID: WindowsIDs)
		   {
		     String title = driver.switchTo().window(winID).getTitle();
	         System.out.println(title);
		   
		/*   if(title.equals("OrangeHRM"))   // for closing parent brower
		   {
			   driver.close();
			   break;
		   }
		    if(title.equals("Human Resources Management Software | OrangeHRM"))  //for closing the child brower
		    {
		    	driver.close();
		    	break;
		    }  */
		   
		   
		   // To close the multiple browers to need to close
		    
		    if(title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM"))
		    {
		    	driver.close();
		    }
		   
		   
		   }
	}

}
