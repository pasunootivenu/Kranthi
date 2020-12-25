package window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Handle2 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://rameshsoft.com/");
		
		s1.manage().window().maximize();
		
		Thread.sleep(10000);
		
		s1.findElement(By.linkText("Videos")).click();
		
		String current_window=s1.getWindowHandle();
		
		Set<String> all_windows=s1.getWindowHandles();
		
		Iterator<String> itr=all_windows.iterator();
		
		 while(itr.hasNext())
		 {
			String window=itr.next();
			
			if(window.equalsIgnoreCase(current_window))
			{
				System.out.println("focus on selenium window");
			}
			else 
			{
			  s1.switchTo().window(window);
			  String secwindow=s1.getWindowHandle();
			  System.out.println("1st window:"+current_window);
			  System.out.println("2nd window:"+secwindow);
				break;
				
			}
			
			WebElement input=s1.findElement(By.xpath("//div[@id='search-input']/input"));
			input.clear();
			input.sendKeys("rameshsoft practise");
		}
		
		

	}

}
