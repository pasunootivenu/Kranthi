package pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


class page1 
{
	WebDriver driver;
	
	
	@FindBy(linkText="destination of the week! The Beach!")
	WebElement link;
	
	@FindBy(name="fromPort")
	WebElement depart;
	
	@FindBy(name="toPort")
	WebElement destination;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement search;
	
	public page1(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	void verifytitle()
	{
		String title=driver.getTitle();
		if(title.equals("Welcome to the Simple Travel Agency!"))
		{
			System.out.println("title is valid");
		}
		else
		{
			System.out.println("title is invalid");
		}
	}
	void link()
	{
		link.click();
		String url=driver.getCurrentUrl();
		if(url.contains("vacation"))
		{
			System.out.println("successfully navigated to webpage");
		}
		else
		{
			System.out.println("not successful");
		}
	    driver.navigate().back();
		
	}
	void depart(int city1)
	{
		Select select1=new Select(depart);
		select1.selectByIndex(city1);
		
	}
	void destination(String city2)
	{
		Select select2=new Select(destination);	
		select2.selectByVisibleText(city2);
		
	}
	void search()
	{
		search.click();
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
