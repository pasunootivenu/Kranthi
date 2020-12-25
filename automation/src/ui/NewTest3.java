package ui;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest3 
{
  @Test
  public void f() 
  {
	  AssertJUnit.assertEquals("testing","manual"); //failed
  }
  @Test
  public void f1() 
  {
	  AssertJUnit.assertEquals("automation","Automation"); //failed
  }
  @Test
  public void f2() 
  {
	  AssertJUnit.assertEquals("automation","automation"); //passed
  }
  
  
}
