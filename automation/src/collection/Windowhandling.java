package collection;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.get("http://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(4000);
		
		s1.findElement(By.xpath("(//*[@class='btn btn-info'])[1]")).click();
		
		Thread.sleep(4000);
		
String win1=s1.getWindowHandle(); // collect only parent window
		
Set<String> windows=s1.getWindowHandles();//collect parent and child windows

Iterator<String> itr=windows.iterator();

String parent=itr.next();//parent window    

String child=itr.next();//child window
      

    


   



		  
		 
		
		 
		
		
	}

}
