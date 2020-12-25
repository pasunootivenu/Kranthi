package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Loc1 
 {

	public static void main(String[] args) throws Exception 
	{
WebDriver t1=new ChromeDriver();
t1.navigate().to("https://www.amazon.com/");
t1.manage().window().maximize();
	
t1.findElement(By.xpath(".//*[@dir='auto']")).sendKeys("mobiles");
Thread.sleep(4000); //4 secs
t1.findElement(By.xpath("//input[@value='Go']")).click();

	
	

	}

}
