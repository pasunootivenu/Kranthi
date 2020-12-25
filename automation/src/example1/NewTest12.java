package example1;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NewTest12 
{
  @Test(dependsOnMethods="b")
  public void a()  //execute and passed
  {
	AssertJUnit.assertEquals("corejava","corejava");  
  }
  @Test(dependsOnMethods="d") 
  public void b() //executed and passed
  {
	  AssertJUnit.assertEquals("selenium","selenium");  
  }
  
  @Test
  public void d() //executed and passed
  {
	  AssertJUnit.assertEquals("manual","manual");
  }
  @Test(dependsOnMethods="a")
  public void e()
  {
	 AssertJUnit.assertEquals("python","python"); 
  }
}
