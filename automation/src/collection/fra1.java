package collection;

import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fra1 
{
	
	
	public static void main(String[] args) throws Exception 
	 {
		
		WebDriver s1=new ChromeDriver();
		s1.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		Thread.sleep(4000);
		
		s1.switchTo().frame(0); //1st frame
		
		Thread.sleep(3000);
		
		s1.findElement(By.linkText("org.openqa.selenium.injector")).click();
		
		Thread.sleep(3000);
		
		s1.switchTo().defaultContent(); //default webpage

		s1.switchTo().frame(2);//3rd frame
		
		Thread.sleep(3000);
		
		s1.findElement(By.linkText("org.openqa.selenium.interactions")).click();
		
		Thread.sleep(3000);
		
		s1.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		s1.switchTo().frame(0); //1st frame
		
		Thread.sleep(3000);
		
		s1.findElement(By.linkText("org.openqa.selenium.html5")).click();
		
		
		
		
		
		
		
		
	}

}
