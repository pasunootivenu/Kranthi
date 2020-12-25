package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;

public class page4 
{
	WebDriver driver;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement Id;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]")
	WebElement printid;
	
	
	public page4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	void Id()
	{
		if(Id.isDisplayed())
		{
			System.out.println("can see the Id");
		}
		else
		{
			System.out.println("cannot see the Id");
		}
	}
	
	void printId()
	{
		String text=printid.getText();
		System.out.println(text);
		
	}
	
	

}
