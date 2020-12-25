package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Example2 
 {

	public static void main(String[] args) throws Exception 
	{
	WebDriver t1=new ChromeDriver();
	t1.get("https://www.amazon.in/");
	t1.manage().window().maximize();
	
t1.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo");
Thread.sleep(4000);	 //4 secs(waiting time)
//t1.findElement(By.className("nav-input")).click();

t1.findElement(By.className("nav-input")).sendKeys(Keys.ENTER);
		
  }

}
