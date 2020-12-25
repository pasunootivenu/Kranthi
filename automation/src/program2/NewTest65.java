package program2;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NewTest65 
{

	  @Test
	  public void login() //executed and passed
	  {
	   AssertJUnit.assertEquals("xyz","xyz");	  
	  }

	  
	  @Test(dependsOnMethods={"advancedsearch"})
	  public void logout() //skipped
	  {
	   AssertJUnit.assertEquals("abcder","abcder");	  
	  }

	  
	  @Test(dependsOnMethods={"login"})
	  public void search() //executed and failed
	  {
	  AssertJUnit.assertEquals("abcd","xyz");	  
	  }

	  
	  @Test
	  public void advancedsearch() //executed and failed
	  {
		AssertJUnit.assertEquals("abcd","xyz");  
	  }
}
