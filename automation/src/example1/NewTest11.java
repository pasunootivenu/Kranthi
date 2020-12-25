package example1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class NewTest11 
{
	WebDriver t1;
	@BeforeMethod()
	public void f2()
	{
	t1=new ChromeDriver();
	t1.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
	}
  @Test
  public void f() 
  {
	  t1.switchTo().frame(0);
		
		WebElement ele=t1.findElement(By.linkText("org.openqa.selenium.chrome"));
		
		ele.click();
				
		t1.switchTo().defaultContent();
		
		t1.switchTo().frame(2);
		
		t1.findElement(By.linkText("org.openqa.selenium.html5")).click();

	  
  }
  @AfterMethod
  public void f3() throws Exception
  {
	Thread.sleep(8000);
	t1.close();  
  }
}
