package example1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class webtables 
{

	public static void main(String[] args) 
	{
		WebDriver t1=new ChromeDriver();
		t1.get("http://www.webdatacommons.org/webtables/");
		
		List<WebElement> t2=t1.findElements(By.xpath("//table[1]//tbody//tr[2]//td"));

		for(int i=0;i<t2.size();i++)
		{
			System.out.println(t2.get(i).getText());
		}
	
		
		
		
		
		

	}

}
