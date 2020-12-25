package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class page3 
{
   
	  WebDriver driver;
	  
	  @FindBy(xpath="//p[2]")
	  WebElement purchasepage; 
	  
	  @FindBy(xpath="//p[5]")
	  WebElement totalcost;
	  
	  @FindBy(xpath="//input[@class='btn btn-primary']")
	  WebElement purchaseflight;
	  
	  
	  
	  public page3(WebDriver driver)
	  {
		 this.driver=driver;
		 
		 PageFactory.initElements(driver,this);
		 
	  }
	  
	  void  purchasepage()
	  {
		  
		  if(purchasepage.isDisplayed())
			{
				System.out.println("navigated to flight purchase page");
			}
			else
			{
				System.out.println("not navigated to purchase page ");
			}
		  
	  }
	  
	  void totalcost()
	  {
		  String text=totalcost.getText();
			
			System.out.println(text);
			
			if(text.contains("Total Cost: "))
			{
				System.out.println("valid price field");
			}
			else
			{
				System.out.println("invalid price field");
			}
			
		  
	  }
	  
	  void purchaseflight()
	  {
		  purchaseflight.click();
	  }
	  
	  
	  
	  
	
		
		
		     
		
		 
	   
		
	
	

}

