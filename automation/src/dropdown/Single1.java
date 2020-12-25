package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Single1 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver s1=new ChromeDriver();
		
		s1.get("https://in.ebay.com/");
		
		Thread.sleep(3000);
		
		
		Select sel=new Select(s1.findElement(By.id("gh-cat")));
		
		  
		   boolean b=sel.isMultiple();
		   
		   System.out.println(b);
		    
		
	/*	
		sel.selectByIndex(4); //object is calling method
		
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Collectibles");
		 
		Thread.sleep(3000);
		
		sel.selectByValue("20081"); 
		
		*/
		
		
		
		
		
		
		
		
	}

}
