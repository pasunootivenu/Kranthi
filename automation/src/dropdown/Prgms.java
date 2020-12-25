package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Prgms 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://in.ebay.com/");
		
		Thread.sleep(4000);
		
		WebElement ele=s1.findElement(By.id("gh-cat"));
		
		Select t1=new Select(ele);
		
		 boolean b=t1.isMultiple();
		 
		 System.out.println(b);
		
		 t1.selectByIndex(2);
		 
		 Thread.sleep(3000);
		 
		 t1.selectByVisibleText("Books");
		 
		     
		   List<WebElement> ele2=t1.getAllSelectedOptions();
		 
		   if(ele2.size()>=1)
		   {
			   System.out.println("selected options are below");
			   
			   for(WebElement k: ele2)
			   {
				   System.out.println(k.getText());
			   }
		   }
		   
		   Thread.sleep(3000);
		   
		//t1.deselectAll(); cant apply bcz it is single select dropdown 
		 
		 
		
		
		
	
	}

}
