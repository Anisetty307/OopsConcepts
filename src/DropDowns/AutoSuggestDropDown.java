package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("seleni");
		Thread.sleep(3000);
		
		List<WebElement> Auto= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		Thread.sleep(3000);
		System.out.println(Auto.size());
		
	for(int i=0;i<Auto.size();i++) {
		
		System.out.println(Auto.get(i).getText());
	    Thread.sleep(2000);
/*		if(Auto.get(i).getText().equals("selenium")) {
			 Auto.get(i).click();
			 break;
		} */
	    
	}
		
		
	}

}
