package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Example34 
 {

	public static void main(String[] args) throws Exception
	{
	WebDriver t1=new ChromeDriver();
	t1.navigate().to("https://www.ebay.com/");
	t1.manage().window().maximize();
	
	Thread.sleep(5000); //5 secs
	
	t1.findElement(By.partialLinkText("Health")).click();
	Thread.sleep(4000);
	
	t1.navigate().back();
	Thread.sleep(4000);
	
	t1.findElement(By.partialLinkText("Collect")).click();
	Thread.sleep(5000);
	
	t1.navigate().back();
	Thread.sleep(5000);
	
	t1.navigate().forward();
	
	

	}

}
