package collection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class Smallbox 
 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://demoqa.com/alerts");
		
		
		
		s1.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//s1.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
		
		//s1.findElement(By.id("promtButton")).click();
		
		WebElement element = s1.findElement(By.id("promtButton"));
		((JavascriptExecutor) s1).executeScript("arguments[0].click()", element);
		
		Thread.sleep(3000);
		
		Alert s2=s1.switchTo().alert();
		
		s2.sendKeys("prompt alert");
		
		Thread.sleep(3000);
		
		s2.accept();
		
		//s2.dismiss();
		
		
		
		
		

	}

}
