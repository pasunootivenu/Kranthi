package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseclass 
{
	WebDriver driver;
	@Test
	void base()
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	driver.manage().window().maximize();
		
	driver.get("https://blazedemo.com/index.php");
	
	driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	
	page1 p1=new page1(driver);
	p1.verifytitle();
	p1.link();
    p1.depart(5);
    p1.destination("London");
    p1.search();
    
    
    page2 p2=new page2(driver);
	p2.chooseflight();
	
	
	page3 p3=new page3(driver);
	
	p3.purchasepage();
	p3.totalcost();
	p3.purchaseflight();
	
	
	
	page4 p4=new page4(driver);
	
	p4.Id();
	p4.printId();
	
	
	
	
	
	

}
}
