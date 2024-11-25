package src.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Locators {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\grid\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		 
		//name
	   // driver.findElement(By.name("search")).sendKeys("mac");
		
		// id 
		//boolean display= driver.findElement(By.id("logo")).isDisplayed();
	     //System.out.println(display);
	     
	    // link text & partial link text.
	   //  driver.findElement(By.linkText("Tablets")).click();
	   //  driver.findElement(By.partialLinkText("Compo")).click();
	     
	    List<WebElement> headerlinks= driver.findElements(By.className("list-inline-item"));
	     
	    System.out.println("Total header:"+headerlinks.size());
	    
	    //Tag name
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total links:"+links.size());
	     
	  List<WebElement> img= driver.findElements(By.tagName("img"));
	    System.out.println("Total images:"+img.size());
	    
		//driver.quit();
	}

}
