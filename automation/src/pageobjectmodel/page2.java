package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class page2 
{
   WebDriver driver;
	
	@FindBy(xpath="(//input[@class='btn btn-small'])[1]")
	WebElement flight;
	
	public page2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	void chooseflight()
	{
		flight.click();
	}
	
	
	

}
