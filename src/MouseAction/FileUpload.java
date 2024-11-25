package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("");
		driver.manage().window().maximize();
		
		//single file upload 
		
		driver.findElement(By.xpath("")).sendKeys("file path ");
		
		if(driver.findElement(By.xpath("")).getText().equals("filename)"))
		{
			System.out.println("file upload successfully");
		}
		else 
		{
		  System.out.println("upload is failed");
		}

	
		//Multiple files upload 
		String file1= "C:filepath1";
		String file2= "C:filepath2";
		
		driver.findElement(By.xpath(" xpath of uplaod button ")).sendKeys(file1+"\n"+file2);
	/*   int nooffiles= driver.findElement(By.xpath("xpath ")).getSize();
	   
		
	   // validation 1- Number of files 
		if(nooffiles==2) 
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("files are not upload");
		}
		
		
		//validate files names 
		if(driver.findElement(By.xpath(" xpath of uplaod button ")).getText().equals("file1") && 
				(driver.findElement(By.xpath(" xpath of uplaod button ")).getText().equals("file2")))
		{
			System.out.println("File names are matching");		
		}
		else  		
		{
		   System.out.println("file names are not matching");	
		} */
		
	}
}
