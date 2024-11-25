package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement RClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions Act=new Actions(driver);
		//Right click action 
		Act.contextClick(RClick).perform();
		
	   WebElement copy=driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[3]"));
		
		copy.click();
		Thread.sleep(3000);
		
		//closing the alert window
		driver.switchTo().alert().accept();
		
		
	}

}
