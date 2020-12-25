package program1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest63 
{
  	
 WebDriver t1;  //global declaration	
 @BeforeMethod
 public void f1()
 {
	t1=new ChromeDriver();
	t1.get("https://www.freecrm.com/");
	t1.manage().window().maximize();
 }
 @Test
 public void g()
 {
   String b=t1.getTitle(); 
   AssertJUnit.assertEquals("Free CRM software for any Business",b);
 }
  
 @AfterMethod
 public void f2() throws Exception
 {
	 Thread.sleep(7000);
	 t1.close(); 
 }
}
