package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Act1 
 {

	public static void main(String[] args) throws Exception
	{
		WebDriver t1=new ChromeDriver();
		t1.get("https://www.ebay.com/");
		t1.manage().window().maximize();
		
		Thread.sleep(5000);
	
	//address of a "Electronics" link	
	WebElement s1=t1.findElement(By.linkText("Electronics"));
	
	Actions t2=new Actions(t1);
	t2.moveToElement(s1).build().perform();
	
	Thread.sleep(8000);
	
	//address of a "iPhOne" link
	WebElement s2=t1.findElement(By.linkText("iPhone"));
	t2.moveToElement(s2).click().build().perform();
	
	
	
	
	
	
	
	
	
		

	}

}
