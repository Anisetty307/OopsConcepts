package FewMethodsInSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		driver.get("https://www.letskodeit.com/practice");

		driver.manage().window().maximize();
		
		//1)Full page Screenshot
		
	/*	TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//      File targetfile=new File("C:\\Users\\ravikanth.anisetty\\practice-workspace\\OopsConceptsJava\\ScreenShot\\Fullpage.png");
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShot\\Fullpage1.png");  // it work for all systems
		sourcefile.renameTo(targetfile);  // Copy the source file to target file   */
		
		//2)Capture the screenshot of specific section 
		
	/*	WebElement SpecificSC=driver.findElement(By.xpath("//body/div[@id='page']/div[@class='block empty yummy text-center padding-top-100 padding-bottom-100']/div[@class='container']/div[@class='row v-center margin-top-10 margin-bottom-10']/div[@class='col-md-12']/div/div[@class='custom-html margin-top-10 margin-bottom-10']/div[3]"));
		File sourcefile1= SpecificSC.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\ScreenShot\\Fullpage3.png");
		sourcefile1.renameTo(targetfile1);   */
		
		//3)Capture the screenshot of webelement 
		

		WebElement Webelement=driver.findElement(By.xpath("//legend[normalize-space()='Checkbox Example']"));
		File sourcefile2= Webelement.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\ScreenShot\\Fullpage4.png");
		sourcefile2.renameTo(targetfile2);
		
		
		
	}

}
