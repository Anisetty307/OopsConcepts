package Webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 Thread.sleep(3000);
		
		// driver.close();  // To close the single window
		 driver.quit();     // to close the multiple windows .
		 
	}

}
