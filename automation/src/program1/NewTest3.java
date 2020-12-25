package program1;

import org.testng.annotations.Test;

public class NewTest3
{
  @Test(priority=3)
  public void d() 
  {
	System.out.println("10");  
  }
  @Test(priority=1)
  public void a() 
  {
	  System.out.println("50");  
  }
  @Test(priority=2)
  public void b() 
  {
	  System.out.println("20");  
  }
}
