package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class messagebox {

	public static void main(String[] args) throws Exception
	{
		WebDriver s1=new ChromeDriver();
		s1.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(4000);
		
		s1.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		
		Thread.sleep(4000);
		
		s1.findElement(By.xpath("//*[@value='Submit']")).click();
		
		Thread.sleep(4000);
		
		
		s1.switchTo().alert().accept(); //ok button
		
		Thread.sleep(4000);
		
		s1.switchTo().alert().accept(); //ok button  
		
		//s1.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		

	}

}
