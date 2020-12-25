package program1;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Dropdown2 
{

	public static void main(String[] args) 
	{
WebDriver t1=new ChromeDriver();
t1.get("https://www.ebay.com/");
t1.manage().window().maximize();
		
Select t2=new Select(t1.findElement(By.id("gh-cat")));
List<WebElement> s1 =t2.getOptions();
System.out.println(s1.size());

/*System.out.println(s1.get(0).getText());      
 System.out.println(s1.get(1).getText());
 System.out.println(s1.get(34).getText());
 System.out.println(s1.get(35).getText()); */

           //or
for(int i=0;i<=s1.size()-1;i++)
{
	System.out.println(s1.get(i).getText());
}
    
          //or
for(WebElement k:s1)
{
	System.out.println(k.getText());
}

        //or
/*Iterator<WebElement>  s2=s1.iterator();

System.out.println(s2.next().getText());
System.out.println(s2.next().getText());    */


            //or
Iterator<WebElement> s2=s1.iterator(); 

while(s2.hasNext())
{
	System.out.println(s2.next().getText());
}


             


		
		
		        
	}

}
