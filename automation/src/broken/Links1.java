package broken;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links1 
{
	
	//private static WebDriver driver=null; //static variable

	public static void main(String[] args) throws  IOException
	{
		String homepage="https://www.zlti.com/";
		//String url="";
		HttpURLConnection huc;
		int respcode=200;
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(homepage);
		
		List<WebElement> links=driver.findElements(By.tagName("a")); //all links
		
		List<WebElement> activelinks=new ArrayList<WebElement>();
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).getAttribute("href")!=null)
           {
	          activelinks.add(links.get(i));
           }

		}
		System.out.println(activelinks.size());
	  
		for(int j=0;j<activelinks.size();j++)
		{
		huc=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		huc.connect();
		
		String response=huc.getResponseMessage();
		 
		huc.disconnect();
		
		System.out.println(activelinks.get(j).getAttribute("href")+"-->"+response);
		      
		}

   
		
		
		

	}

}
