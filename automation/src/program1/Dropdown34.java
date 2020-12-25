package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Dropdown34 
 {

	public static void main(String[] args) 
	{
WebDriver t1=new ChromeDriver();
t1.get("https://www.ebay.com/");
t1.manage().window().maximize();
	  
Select t2=new Select(t1.findElement(By.id("gh-cat")));




	  

	}

}
