package broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Links 
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
       WebDriver t1=new ChromeDriver();
       
       t1.manage().window().maximize();
       t1.manage().deleteAllCookies();
       
       
       t1.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
       t1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
       t1.get("https://www.google.co.in/");
       
       
      //to get the list of all links and images
       
      List<WebElement> linkslist=t1.findElements(By.tagName("a"));//links
      
      linkslist.addAll(t1.findElements(By.tagName("img")));//images
      
      
      List<WebElement> activelinks=new ArrayList<WebElement>(); //activelinks
      
      
      System.out.println(linkslist.size());
      
      for(int i=0;i<linkslist.size();i++) //links
      {
    	  if(linkslist.get(i).getAttribute("href")!=null)  //activelink
    	  {
    		  activelinks.add(linkslist.get(i));
    	  }
      }
      
      System.out.println(activelinks.size());
      
      for(int j=0;j<linkslist.size();j++)
      {
    	
HttpURLConnection connection  =(HttpURLConnection) new URL(linkslist.get(j).getAttribute("href")).openConnection();
connection.connect();
    
 String response=connection.getResponseMessage(); //ok
 connection.disconnect();
 
 System.out.println(linkslist.get(j).getAttribute("href")+"-->"+response);
 
 
 
    
    
      }
      
      
      
      
       
       
       
       
       
       
		

	}

}
