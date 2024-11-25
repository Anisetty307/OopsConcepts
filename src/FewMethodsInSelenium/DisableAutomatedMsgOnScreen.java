package FewMethodsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMsgOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"}); 
		// To remove the "Chrome is being controlled by automated test software"
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.letskodeit.com/practice");
			
			
		String act_title=driver.getTitle();
		if(act_title.equals("Practice Page"))
		{
			System.out.println("Tiltle is matched");
		}
		else 	
		{
			System.out.println("Title is not matched");
		}
			
	}

}
