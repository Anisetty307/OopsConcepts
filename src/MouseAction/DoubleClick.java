package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("");
		
		
		WebElement Box1=driver.findElement(By.xpath(""));
		WebElement Box2=driver.findElement(By.xpath(""));
		WebElement DClick=driver.findElement(By.xpath(""));
	    
		Actions act=new Actions(driver);
		//Double click action 
		act.doubleClick(DClick);
		
		String Text=Box2.getAttribute("value");
		
		 System.out.println("Captured text is "+Text);
		
		if(Text.equals(Box2)) {
			System.out.println("Text is copied");
		}
		else {
			System.out.println("Text is not matched");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
