package program1;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NewTest57 
{
  @Test   //failed
  public void f() 
  {
	AssertJUnit.assertEquals("corejava","selenium"); 
  }
  @Test  //failed
  public void f1()
  {
	  AssertJUnit.assertEquals("corejava","Corejava");   
  }
  @Test  //passed
  public void f2()
  {
	  AssertJUnit.assertEquals("manual","manual");    
  }
  
  
}
