package program1;

import org.testng.annotations.Test;

public class NewTest5 
{
  @Test(priority=1)
  public void c() 
  {
	 System.out.println("testng with java"); 
  }
  @Test(priority=2)
  public void a()
  {
	 System.out.println("testng class"); 
  }
  @Test(priority=0)
  public void b()
  {
	 System.out.println("testng program"); 
  }
  @befo
  
}
