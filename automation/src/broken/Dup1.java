package broken;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dup1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		
	    Select s1=new Select(driver.findElement(By.id("gh-cat")));
	    
	    List<WebElement> ele=s1.getOptions(); //to collect all options from a dropdown
	    
	    System.out.println(ele.size()); //36
	    
	     System.out.println(ele.get(0).getText());
	     System.out.println(ele.get(1).getText());
	     System.out.println(ele.get(35).getText());
	    
	    
	      
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
      	    
	    
	}

}
