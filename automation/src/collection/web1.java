package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web1 {

	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.webdatacommons.org/webtables/");
		
		List<WebElement> ele =driver.findElements(By.xpath("//table[1]/tbody/tr[1]/th"));
		System.out.println(ele.size());
		
		List<WebElement> ele1=driver.findElements(By.xpath("//table[1]/tbody/tr[2]/td"));
		System.out.println(ele1.size());
		
		
		List<WebElement> ele2=driver.findElements(By.xpath("//table[2]/tbody/tr"));
		System.out.println(ele2.size()); 
		
	    List<WebElement> ele3=driver.findElements(By.xpath("//table[3]/tbody/tr[5]/td"));
	    System.out.println(ele3.size()); 
		
		
		                       
		                       
		
		
		
		

	}

}
