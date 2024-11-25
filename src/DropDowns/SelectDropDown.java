package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
	 WebElement Dropdown= driver.findElement(By.xpath("//select[@id='carselect']"));
	 
	 Select cardown=new Select(Dropdown);
	 //select the option from the dropdown
	 cardown.selectByIndex(2);
	 cardown.selectByValue("benz");
	 cardown.selectByVisibleText("BMW");
	 
	 List<WebElement> options=cardown.getOptions();
	 System.out.println("Total no of option in dropdown :"+options.size());
	 
	 for(int i=0;i<options.size();i++) {
		 
		System.out.println(options.get(i).getText());
		 
	 }
	 
	 for(WebElement Option:options) {
		 
		String  Available =Option.getText();
		 if(Available.equals("BMW")) {
			 System.out.println("BMW is available");
		 }
		 else
		 {
			System.out.println("Not available");  // we have 3 options, so printed in console
		 }
	 }
	 
		
		
	}

}
