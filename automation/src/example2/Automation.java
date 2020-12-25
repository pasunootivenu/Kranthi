package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Automation 
 {

	public static void main(String[] args) throws Exception 
	{
WebDriver t1=new FirefoxDriver();
t1.get("https://www.cleartrip.com/");
Thread.sleep(5000);
		
t1.findElement(By.cssSelector("input#RoundTrip")).click();
Thread.sleep(4000);
t1.findElement(By.cssSelector("input[etitle='From']")).sendKeys("hyderabad");
Thread.sleep(4000);
t1.findElement(By.cssSelector("input.keyValue[name='destination']")).sendKeys("pune");
Thread.sleep(4000);
t1.findElement(By.cssSelector("input#MultiCity[type='radio']")).click();
		
		

	}

}
