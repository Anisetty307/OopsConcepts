package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		Actions act=new Actions(driver);
		//drag and drop1
		WebElement Rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement Italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(Rome,Italy).perform();
		
		//drag and drop2
		WebElement wt=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
				
		 act.dragAndDrop(wt,us).perform();
				
		int test = test();
		System.out.println(test);
		
		 
	}
	public static int test() {
		try{
			int x=1/0;
			return 1;
			}catch(Exception e) {
//				int x=1/0;
				return 2;
			}finally {
//				return 3;
			}
		}

}
