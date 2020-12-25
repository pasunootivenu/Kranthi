package example1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class NewTest10 
{
	
  WebDriver t1;	
  @BeforeMethod
  public void f2()
  {
	  t1=new ChromeDriver();
	  t1.get("https://www.cleartrip.com/");
	  t1.manage().window().maximize();
  }
	
@Test
public void f() throws Exception 
{
t1.findElement(By.cssSelector("input#FromTag")).sendKeys("Hyderabad");
	  Thread.sleep(5000);
t1.findElement(By.cssSelector("input[etitle='To']")).sendKeys("bangalore");
}

@AfterMethod
public void f3()
{
  t1.close();  
 }
}
