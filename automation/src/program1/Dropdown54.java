package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Dropdown54 
 {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver t1=new ChromeDriver();
		t1.get("https://www.ebay.com/");
		t1.manage().window().maximize();
		
		Thread.sleep(5000);
		
	Select t2=new Select(t1.findElement(By.id("gh-cat")));
	t2.selectByVisibleText("Books");
	Thread.sleep(5000);
	t2.selectByIndex(2);
	
	
	
		

	}

}
