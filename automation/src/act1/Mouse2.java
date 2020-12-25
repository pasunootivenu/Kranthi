package act1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		//applied "Actions" class for entire webpage
		Actions t1=new Actions(s1);
		
		// "Electronics" link
		WebElement ele=s1.findElement(By.linkText("Electronics"));
		
		t1.moveToElement(ele).build().perform();
		
		Thread.sleep(6000);
		
		WebElement ele1=s1.findElement(By.linkText("Smart Watches"));
		
		//for "mouse hover" on "Smart Watches" link
		//t1.moveToElement(ele1).build().perform();
		
		//for "mouse hover and click" on "Smart Watches" link
		t1.moveToElement(ele1).click().build().perform();
		

	}

}
