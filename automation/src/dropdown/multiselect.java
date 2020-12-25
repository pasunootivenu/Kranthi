package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.navigate().to("https://mdbootstrap.com/docs/jquery/forms/multiselect/");
		
		Thread.sleep(4000);
		
	WebElement ele=s1.findElement(By.xpath("//select[@class='custom-select browser-default']"));
	
	Select sel=new Select(ele);
	
	boolean b=sel.isMultiple();
	
	System.out.println(b);
	
	
	sel.selectByIndex(1);
	
	Thread.sleep(3000);
	
	sel.selectByVisibleText("Two");
	
	Thread.sleep(3000);
	
	sel.deselectByIndex(1);
	
	sel.deselectByValue(arg0);
	
	
	
	List<WebElement> ele1=sel.getAllSelectedOptions();
	
	   
	if(ele1.size()>=1)
	{
		
		System.out.println("selected options are as below");
		
		for(WebElement k:ele1)
		{
			System.out.println(k.getText());
		}
	}
		
      Thread.sleep(3000);
      
      sel.deselectAll(); //we can apply bcz it is a multiselect dropdown
	
	
	
		
		
		

	}

}
