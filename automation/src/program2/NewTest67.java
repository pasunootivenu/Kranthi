package program2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest67 
{
WebDriver s1;
	
@BeforeMethod
public void f1()
{
s1=new ChromeDriver();
s1.navigate().to("https://www.freecrm.com/index.html");
}
@Test
public void f3()

{
String t=s1.getTitle();

System.out.println(t);
//to compare expected and actual values we will use "AssertJUnit.assertEquals"
AssertJUnit.assertEquals(t,"Free CRM software in the cloud powers sales and customer service");
}
@Test
 public void f() 
{
   //boolean data type will return "true" and "false" values
boolean k=s1.findElement(By.xpath(".//*[@src='/images/cogtiny1.jpg']")).isDisplayed();
AssertJUnit.assertTrue(k);
   
}
@AfterMethod
public void f2() throws Exception
{
		Thread.sleep(5000);
		s1.close();
	}
}

