package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class fra2 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver s1=new ChromeDriver();
		s1.get("https://www.dezlearn.com/testingpage/");
		
		Thread.sleep(4000);
		
		s1.switchTo().frame("do-it-iframe"); //frame id(iframe)
		Thread.sleep(4000);
		
		s1.findElement(By.xpath("//*[@type='search']")).sendKeys("mobile");
		
		Thread.sleep(3000);
		
		
		s1.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		s1.switchTo().frame("queries-iframe"); //frame name(iframe)
		
		Thread.sleep(3000);
		
		s1.findElement(By.xpath("(//input[@class='ninja-forms-field nf-element'])[1]")).sendKeys("laptop");
		
		
		
		
		
	}

}
