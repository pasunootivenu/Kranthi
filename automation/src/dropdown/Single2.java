package dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Single2 
 {

	public static void main(String[] args) 
	{
		WebDriver t1=new ChromeDriver();
		t1.get("https://www.ebay.com/");
		
		WebElement ele=t1.findElement(By.id("gh-cat")); //storing dropdown address into a webelement object
		
		Select sel=new Select(ele); 
		
		boolean b=sel.isMultiple();
		
		System.out.println(b);
		
		           
	 List<WebElement> list=sel.getOptions();
	 //System.out.println(list.size());
	 
	  int n=list.size();
	 
	 /*System.out.println(list.get(0).getText());
	 System.out.println(list.get(35).getText()); */
	 
	 
	 for(int i=0;i<=n-1;i++)
	 {
		 System.out.println(list.get(i).getText());
	 }
	 
	 for(WebElement k: list)
	 {
		 System.out.println(k.getText());
	 }
	 
	 
	 
	 
		
		}

}
