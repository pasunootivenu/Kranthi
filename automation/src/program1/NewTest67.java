package program1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest67 
{
  @AfterSuite
  public void f8()
  {
	  System.out.println("after suite");
  }
  @AfterClass
  public void f6()
  {
	  System.out.println("after class");
  }
  @Test
  public void f4() 
  {
	System.out.println("test");  
  }
  @BeforeSuite
  public void f()
  {
	  System.out.println("before suite");
  }
  @BeforeTest
  public void f1()
  {
	 System.out.println("before test"); 
  }
  @AfterTest
  public void f7()
  {
	  System.out.println("after test");
  }
  @BeforeMethod
  public void f3()
  {
	  System.out.println("before method");
  }
  @BeforeClass
  public void f2()
  {
	  System.out.println("before class");
  }
  @AfterMethod
  public void f5()
  {
	  System.out.println("after method");
  }
  
 
	
	  
  
}
