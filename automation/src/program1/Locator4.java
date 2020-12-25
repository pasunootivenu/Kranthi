package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locator4
 {

	public static void main(String[] args) throws Exception
	{
		WebDriver t1=new ChromeDriver();
		t1.get("https://www.amazon.com/");
		t1.manage().window().maximize();
		
		Thread.sleep(5000); //5 secs
		
t1.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("samsung");
Thread.sleep(5000); //5 secs
	  
t1.findElement(By.xpath("//input[@value='Go']")).click();
Thread.sleep(5000);
	  
t1.navigate().back();
Thread.sleep(5000);
	  
t1.findElement(By.linkText("Prime Day Deals")).click();
	  
	  
	  
		
	}

}
