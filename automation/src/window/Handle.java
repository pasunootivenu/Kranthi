package window;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {

	public static void main(String[] args) throws Exception
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://rameshsoft.com/");
		
		s1.manage().window().maximize();
		
		Thread.sleep(10000);
		
		s1.findElement(By.linkText("Videos")).click();
		
		String current_window=s1.getWindowHandle();
		
		Set<String> all_windows=s1.getWindowHandles();
		
		
		
		for(String windowname: all_windows)
		{
			if(windowname.equalsIgnoreCase(current_window))
			{
				System.out.println("already selenium is focusing");
			}
			else
			{
				s1.switchTo().window(windowname);
				String secwindow=s1.getWindowHandle();
				System.out.println("1st window:"+current_window);
				System.out.println("2nd window:"+secwindow);
				break;
			}
		}
		
WebElement input=s1.findElement(By.xpath("//div[@id='search-input']/input"));
input.clear();
input.sendKeys("rameshsoft practise");



	}

}
