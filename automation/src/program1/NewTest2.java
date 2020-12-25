package program1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

class NewTest2 
{
	
 @AfterSuite
 public void f8()
 {
	System.out.println("AfterSuite"); 
 }
 @BeforeMethod
 public void f3()
 {
	 System.out.println("BeforeMethod");  
 }
  @Test
  public void f4() 
  {
	  System.out.println("Test"); 
  }
  @AfterClass
  public void f6()
  {
	  System.out.println("AfterClass"); 
  }
  @BeforeSuite
  public void f()
  {
	  System.out.println("BeforeSuite");  
  }
  
}

