package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselct1 
{

	public static void main(String[] args) throws Exception 
	{
		
WebDriver j1=new ChromeDriver(); // to open chromebrowser

j1.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");


   Select sel=new Select(j1.findElement(By.xpath("//*[@class='custom-select browser-default']")));
   
   
    boolean b =sel.isMultiple();
    
    System.out.println(b);
    
    
    sel.selectByIndex(1);
    
    Thread.sleep(3000);
    
    sel.selectByVisibleText("Two");
    
    Thread.sleep(3000);
    
    sel.selectByValue("3");
    
    
    Thread.sleep(3000);
    
    sel.deselectByIndex(0);
    
    Thread.sleep(3000);
    
    sel.deselectByVisibleText("One");
    
    Thread.sleep(3000);
    
    sel.deselectByValue("2");
    
    
    Thread.sleep(3000);
    
    sel.deselectByIndex(3);
    
   
     
     
     

		
		
		

	}

}
