package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	//1)Scroll down page by pixel number 
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //1500	    & Xoffset for x axis 	
		

	//2)scroll the page till the element is visible 
		
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	    js.executeScript("argument[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return windows.pageYOffset;"));  //
		
    //3)scroll the page till end of the page 
	    js.executeScript("windows.scrollBy(0,document.body.scrollHeight");  //scrollWindth for x axis
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	// scrolling up to initial position 
        js.executeScript("windows.scrollBy(0,-document.body.scrollHeight");
		
		
	//	scroll bar is webelement and it using by javascriptexecutor
		
	}

}
