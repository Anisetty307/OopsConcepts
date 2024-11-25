package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.manage().window().maximize();
	
	
	
     driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
      Thread.sleep(5000);
   //Select single option 
    // driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
  
   //  Multi select
   List<WebElement> allopts =driver.findElements(By.xpath("///ul//li[@class=\"ComboTreeItemParent\"]"));
     
   System.out.println("Number of options :"+allopts.size());

	
	
	
	
	}

}
