package FewMethodsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);  
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page" + driver.getTitle());
				
		//secure socket layers= SSL
	}

}
