package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Css12 
 {

	public static void main(String[] args) throws Exception 
	{
	WebDriver t1=new ChromeDriver();
	t1.navigate().to("https://www.cleartrip.com/");
	t1.manage().window().maximize();
	
	Thread.sleep(5000);
	
	t1.findElement(By.cssSelector("input#RoundTrip")).click();
	Thread.sleep(5000);
	
t1.findElement(By.cssSelector("input#FromTag[type='text']")).sendKeys("Hyd");
Thread.sleep(5000);

t1.findElement(By.cssSelector("input.keyValue[id='ToTag']")).sendKeys("bang");
Thread.sleep(5000);

t1.findElement(By.cssSelector("input[id='MultiCity']")).click();
Thread.sleep(5000);

t1.findElement(By.cssSelector("input#FromTag1[data-idfield='from'][etitle='From']")).sendKeys("pune");

	
	
	
	
	
	
	
	}

}
