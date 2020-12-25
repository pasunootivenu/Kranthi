package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Automation2 
{

	public static void main(String[] args) throws Exception
	{
WebDriver t1=new ChromeDriver();
t1.get("https://www.cleartrip.com/");
Thread.sleep(4000);

t1.findElement(By.linkText("Currency")).click();
        
	}

}
