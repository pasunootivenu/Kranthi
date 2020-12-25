package act1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Mouse1 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://www.ebay.com/");
		
		Thread.sleep(4000);
		
		s1.findElement(By.linkText("Electronics")).click();
		
		
		
		

	}

}
