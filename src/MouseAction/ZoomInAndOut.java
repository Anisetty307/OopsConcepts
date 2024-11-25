package MouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInAndOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    WebDriver driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("document.body.style.zomm='50%'");  // set zoom level 50 % 
        Thread.sleep(5000);
        
        js.executeScript("document.body.style.zomm='80%'");  // set zoom level 80 % 
        Thread.sleep(5000);
        
        
        
	
	    
	    
	    
	    
	
	}

}
