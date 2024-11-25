package Webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		// IsDisplayed();
		
	//	boolean DisplayStatus= driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
	//	System.out.println(DisplayStatus); 
		
	//	WebElement logo= driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	//	System.out.println("Display status: "+logo.isDisplayed());
		
		
		// Is enabled
		//  boolean status= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//   System.out.println(status);
		   
		// WebElement enabled =  driver.findElement(By.xpath("//input[@id='FirstName']"));
		// System.out.println("Enabled status: "+enabled.isEnabled());
		
		 // isselected  
		 WebElement male =  driver.findElement(By.xpath("//input[@id='gender-male']"));
		 WebElement female =  driver.findElement(By.xpath("//input[@id='gender-female']"));
		  
		  System.out.println("Before selection");
		  System.out.println("Enabled status: "+male.isSelected());
		  System.out.println("Enabled status: "+female.isSelected());
		
		 System.out.println("After selecting male button ");
		 male.click();
		 System.out.println("Enabled status: "+male.isSelected());
		 System.out.println("Enabled status: "+female.isSelected());
		 
		  
		  System.out.println("After selecting female button ");
		  female.click();
		  System.out.println("Enabled status: "+male.isSelected());
		  System.out.println("Enabled status: "+female.isSelected());
	
		  
		  // For isselected
		  boolean Newletter= driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		   System.out.println(Newletter);
	
	}

}
