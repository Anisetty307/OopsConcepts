package NaviCmdsAndWindowHandles;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/");  //Accept only in string in format
		
//		driver.navigate().to("https://demo.nopcommerce.com/"); // Accept sting and object url class also 
		
	//	URL myurl =new URL("https://demo.nopcommerce.com/");
	//	driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());  // https://demo.nopcommerce.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());   // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.navigate().refresh();
		
		
	}

}
