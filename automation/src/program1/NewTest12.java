package program1;

import org.testng.annotations.Test;

public class NewTest12 
{
  @Test(priority=3)
  public void c() 
  {
	  System.out.println("10");
  }
  @Test(priority=1)
  public void c2() 
  {
	  System.out.println("20");
  }
  
  @Test(priority=0)
  public void c3() 
  {
	  System.out.println("30");
  }
  
}
