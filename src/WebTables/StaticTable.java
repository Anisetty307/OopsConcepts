package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://mui.com/base-ui/react-table-pagination/");
		
		//1)Total No of rows in a table 
		int Rows= driver.findElements(By.xpath("//div[@class=\"css-bxz6lx\"]//tr")).size(); // use if multiple tables in the rows
	//	int Rows= driver.findElements(By.tagName("tr")).size();  // use if single table in the page 
       System.out.println(Rows);
       
    //   2) Total no of rows in a columns
       int columns =driver.findElements(By.xpath("//div[@class=\"css-bxz6lx\"]//th")).size();
         System.out.println(columns);
		
       //3)Read data from specific row and columns
         String Name=driver.findElement(By.xpath("//div[@class=\"css-bxz6lx\"]//tr[2]//td[1]")).getText();
         String Name1=driver.findElement(By.xpath("//div[@class=\"css-bxz6lx\"]//tr[1]//td[1]")).getText();
         System.out.println(Name1);
         Thread.sleep(5000);
		
		
		//4)Read the data all rows and columns
         
   /*    for(int r=1;r<7;r++) 
       {
    	   
    	  for(int c=1;c<4;c++)
    	  {
    		 String value =driver.findElement(By.xpath("//div[@class='css-bxz6lx']//tr["+r+"]//td["+c+"]")).getText();
    	System.out.print(value+"\t");   // \T= tab space after the value 
    	  }
        System.out.println(); 
       } */
         
         //5)Print dessert which having the 9% FAT 
       
      for(int r=1;r<5;r++) {
    	String fats =driver.findElement(By.xpath("//div[@class=\"css-bxz6lx\"]//tr["+r+"]//td[3]")).getText();
    	//System.out.println(fats);
    	
    	if(fats.equals("9")) {
    		
    	String 	Dessert= driver.findElement(By.xpath("//div[@class=\"css-bxz6lx\"]//tr["+r+"]//td[1]")).getText();
    	 System.out.println(Dessert);
    	}
    	  
    	  
      }
      
      int total=0;
      for( int r=1;r<5;r++) {
    	 String  tfat=driver.findElement(By.xpath("//div[@class=\"css-bxz6lx\"]//tr["+r+"]//td[3]")).getText();
    	  total=total+Integer.parseInt(tfat);
    	  System.out.println(total);
      }
        // https://demo.opencart.com/admin/
       
       
         
	}

}
