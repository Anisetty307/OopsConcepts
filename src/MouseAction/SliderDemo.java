package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act=new Actions(driver);
		
		//Min_slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Location of the min slider :"+min_slider.getLocation());
         act.dragAndDropBy(min_slider,165,231).perform();
        System.out.println("Location of the min slider after change:"+min_slider.getLocation());        
        
        //Max_slider
       WebElement  max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        System.out.println("Location of max slider:"+max_slider.getLocation());
        act.dragAndDropBy(max_slider,-100,246).perform();
     
        System.out.println("Location after max slider:"+max_slider.getLocation()); 
         
        
        
	}

}
