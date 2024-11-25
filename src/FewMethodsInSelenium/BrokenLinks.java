package FewMethodsInSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int noofbrokenlinks=0;
		int Nbrokenlink=0;
		
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links:"+ Links.size());
		
		for(WebElement LinkElement:Links)
		{
			String Linkattvalue= LinkElement.getAttribute("href");
			if(Linkattvalue==null || Linkattvalue.isEmpty())
			{
				System.out.println("href attribute is numm or empty");
			}
			
			//hit url to the server
			try
			{
			URL Linkurl=new URL(Linkattvalue);  //convert href value from string to url format 
			HttpURLConnection conn=(HttpURLConnection) Linkurl.openConnection(); //open connection to server
			conn.connect(); //connect to server and sent to the server 
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(Linkattvalue+"-->Broken link");
				noofbrokenlinks++;
			}
			else
			{
				System.out.println(Linkattvalue+"--->Not a borken link");
				Nbrokenlink++;
			}
			}
			catch(Exception e)
			{
				
			}
			
		}

		System.out.println("No of broken links: "+noofbrokenlinks);
		System.out.println("No of NOT a broken links: "+Nbrokenlink);
		System.out.println(noofbrokenlinks+Nbrokenlink+" total no of links");
		

	}

}
