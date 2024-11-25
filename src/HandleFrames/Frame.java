package HandleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();   // shift+ctrl+O
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 1 
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
	   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
	   
		driver.switchTo().defaultContent();  // Go back to main page 
		
		//frame 2;
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("FRAME");
		
		driver.switchTo().defaultContent();
		
		//Frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("JAVA");
		
		//Inner frame 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
	/*	WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments(0).click();", rdbutton); */
		driver.switchTo().defaultContent(); 
		
		//Frame 5 
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Finally");
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		
		WebElement img=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']"));
		System.out.println(img.isDisplayed());
		
		
		
		
		
		
	}

}
