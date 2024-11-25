package HandlingCheckBoxesAndAlerts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	 
	 
	 driver.get("https://www.letskodeit.com/practice");
	 driver.manage().window().maximize();
	 
	  
	 // 1)Select the specific check box
     //  driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
	 //  driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
	   
	 List<WebElement>  checkboxes = driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
	   
	
	//2) for(int i=0;i<checkboxes.size();i++) {
	//	    checkboxes.get(i).click();
	//	 }
		 
	 
	// 3)for(WebElement checkbox: checkboxes) {
		 
	//	 checkbox.click();
	// }
	
	 
	 //4) Need to select last 2 boxes : For this we can't use enhanced for loop.
	 
	// for(int i=1;i<3;i++) {
		 
//		checkboxes.get(i).click();
//	 }
	 
	 //5) Need to select first 2 check boxes
	 
	 for(int i=0;i<2;i++) {
		 
		 checkboxes.get(i).click();
	 }
	 
	Thread.sleep(5000);
	 // if de-select the selected check boxes.
	 
	 for(int i=0;i<checkboxes.size();i++) {
		 
		 if(checkboxes.get(i).isSelected()) {
			 
			 checkboxes.get(i).click();
			 
		 }
	 }
	 
	 
	}

}
