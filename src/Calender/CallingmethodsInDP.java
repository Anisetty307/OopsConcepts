package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingmethodsInDP {
	
	
	static void FutureDates(WebDriver driver, String Year, String Month,String date) {
		
		 while(true)
		    {
		    	String AcYear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		    	String AcMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    	
		    	if(AcYear.equals(Year) && AcMonth.equals(Month)) {
		    	
		    		break;
		    		
		    	}
		    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next 
		    //	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));   //Previus
		    	
		    }
			
			List<WebElement> alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td"));
			
			
			for(WebElement dt:alldate) {
				
				if(dt.getText().equals(date)) {
					
					dt.click();
					break;
					
				}
			}	
		}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	    driver.get("https://jqueryui.com/datepicker/");
	    
	   // Switching to frame
	    driver.switchTo().frame(0);
	    
	    //Method 1. using send keys 
	 //   driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/01/2024");
	   
	    //method 2
	    String Year="2026";
	    String Month="May";
	    String date="20";
	    
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    Thread.sleep(3000);
	    
	    
	    FutureDates(driver,Year,Month,date);
	//FutureDates(driver,2016,May,20)   // Directly we keep values otherwise we can use variables also.    
	    
	}
	

}
