package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect2 
{

	public static void main(String[] args) throws Exception 
	{

		WebDriver s1=new ChromeDriver();
		s1.navigate().to("https://mdbootstrap.com/docs/jquery/forms/multiselect/");

		Thread.sleep(4000);

Select sel=new Select(s1.findElement(By.xpath("//select[@class='custom-select browser-default']")));

sel.selectByIndex(1);
Thread.sleep(4000);

sel.selectByVisibleText("Two");

  List<WebElement> ele=sel.getAllSelectedOptions();
  
  System.out.println(ele.size());
  
  
   //all selected options
   System.out.println(ele.get(0).getText());
   System.out.println(ele.get(1).getText());
   System.out.println(ele.get(2).getText());
  
 
  List<WebElement> ele1=sel.getOptions();
  System.out.println(ele1.size());
  
  //all options
  System.out.println(ele1.get(0).getText());
  System.out.println(ele1.get(1).getText());
  System.out.println(ele1.get(2).getText());
  System.out.println(ele1.get(3).getText());
                  
                         
  
  
  
                       
  
  
                 
            
   
   
   
  
		
		







	}

}
