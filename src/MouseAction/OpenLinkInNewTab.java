package MouseAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act= new Actions(driver);
		//Control+Reglink
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL);
		
		//switching to registration page 
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1)); //switch to reg page 
		
		
		//home page 
		
		driver.switchTo().window(ids.get(0));
		
		
	}

}
