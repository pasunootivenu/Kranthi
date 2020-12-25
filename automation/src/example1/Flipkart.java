package example1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws Exception
	{
		WebDriver t1=new ChromeDriver();
		t1.manage().window().maximize();
		t1.get("https://www.flipkart.com/mobile-accessories/cases-and-covers/pr?sid=tyy,4mr,q2u&otracker=nmenu_sub_Electronics_0_Mobile%20Cases");
		//Thread.sleep(10000);
        
		/*try
		{
			
		}
		catch(NoSuchElementException e)
		{
			
		}*/
		
		WebElement ele=t1.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0']"));
		
		WebDriverWait wait=new WebDriverWait(t1,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='_1Nyybr  _30XEf0']")));
		
		
		ele.click();

		t1.findElement(By.xpath("//a[@title='Hupshy Flip Cover for Samsung Galaxy M01 Core']")).click();


	}

}
