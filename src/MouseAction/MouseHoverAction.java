package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		WebElement Contribute= driver.findElement(By.xpath("//a[normalize-space()='Contribute']"));
		WebElement CLA=driver.findElement(By.xpath("//a[normalize-space()='CLA']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Contribute).moveToElement(CLA).click().perform();
		
		
		
	}

}
