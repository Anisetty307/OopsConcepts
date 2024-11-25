package NaviCmdsAndWindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
	WebElement	links = driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']"));
		
		System.out.println(links.getSize());
		
	}

}
