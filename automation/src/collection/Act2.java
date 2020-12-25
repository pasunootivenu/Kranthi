package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act2 {

	public static void main(String[] args) throws Exception
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://www.ebay.com/");
		
		Actions act=new Actions(s1);
		
		WebElement ele=s1.findElement(By.xpath("(//a[@class='gh-p'])[2]"));
		
		Thread.sleep(5000);
		
		//act.contextClick().build().perform();
		
		act.moveToElement(ele).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		
		
		
		
		
		
		
		

	}

}
