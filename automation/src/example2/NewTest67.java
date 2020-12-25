package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest67 
{
  WebDriver t1; //instance or global variable
  
  @BeforeMethod
  public void f() throws Exception 
  {
	t1=new ChromeDriver();
	t1.get("https://www.freecrm.com/index.html");
	t1.manage().window().maximize();
	Thread.sleep(6000); //6 secs
  }
  
  @Test
  public void f1() throws Exception
  {
boolean b=t1.findElement(By.xpath(".//*[@alt='free crm itunes app']")).isDisplayed();
AssertJUnit.assertTrue(b);
Thread.sleep(7000);
}
 @Test
 public void f2() throws Exception
 {
String s1=t1.getTitle();
AssertJUnit.assertEquals("Free CRM software for any Business",s1);
Thread.sleep(7000);
 }
  
 @AfterMethod
 public void f3()
 {
	 t1.close();
 }
 
 
  
}
