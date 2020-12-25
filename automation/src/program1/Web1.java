package program1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Web1 
 {

	public static void main(String[] args) 
	{
WebDriver t1=new ChromeDriver();
t1.get("http://webdatacommons.org/webtables/");
t1.manage().window().maximize();
		
List<WebElement> ele=t1.findElements(By.xpath("//table[1]/tbody/tr[1]/th"));
int n= ele.size();
System.out.println(n);

/*for(int i=0;i<=n-1;i++)
{
	System.out.println(ele.get(i).getText());
}*/
    //or
/*for(WebElement k: ele)
{
	System.out.println(k.getText());
}*/

     //or
Iterator<WebElement> itr=ele.iterator();
/*
System.out.println(itr.next().getText());
System.out.println(itr.next().getText());
System.out.println(itr.next().getText()); */

while(itr.hasNext())
{
	System.out.println(itr.next().getText());
}
 




	}

}
