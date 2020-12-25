package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Css1 
 {

	public static void main(String[] args) throws Exception
	{
WebDriver t1=new ChromeDriver(); 
t1.navigate().to("https://www.cleartrip.com/");
t1.manage().window().maximize();
		
t1.findElement(By.cssSelector("input#RoundTrip")).click();
Thread.sleep(5000);

t1.findElement(By.cssSelector("input[etitle='From']")).sendKeys("hyderabad");
Thread.sleep(4000);
t1.findElement(By.cssSelector("input#ToTag[title='Any worldwide city or airport']")).sendKeys("bangalore");
Thread.sleep(4000);
t1.findElement(By.cssSelector("input.tripType[value='MultiCity']")).click();



	}

}
