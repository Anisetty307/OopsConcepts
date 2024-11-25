package src.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.state.DefaultSynchronousMetricStorage;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		//Relative Xpath 
		//driver.findElement(By.xpath("//input[@id='small-searchterms'] [@name='q']")).sendKeys("Iphone");
		
	    // Xpath with 'and' operator 
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Iphone");
		
		// x-path with 'or' operator
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='uu']")).sendKeys("Iphone");
		
		//Thread.sleep(3000);
		// Xpath with inner test - test()
		//driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//Text display 
		//boolean displaystatus= driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
      //  System.out.println(displaystatus);
		//String Text= driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		//System.out.println(Text);
		
		Thread.sleep(3000);
		// Xpath with contains() method.//  we can use partial value in contains method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");

	  // Xpath with start with 
	  driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
	
	 // chained xpath 
	  Boolean status= driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
	   System.out.println(status);
	  
	}

}
