package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fra2 
{

	public static void main(String[] args) throws Exception 
	{
WebDriver t2=new ChromeDriver();
t2.get("https://www.dezlearn.com/testingpage/");
t2.manage().window().maximize();

t2.switchTo().frame("contact-iframe");  //frame id
Thread.sleep(4000);

//x-path
t2.findElement(By.xpath(".//*[@id='ninja_forms_field_11']")).sendKeys("lenovo");
Thread.sleep(4000);

t2.switchTo().defaultContent(); //default webpage
Thread.sleep(4000);

t2.switchTo().frame("register-iframe"); //frame name
Thread.sleep(4000);

//cssselector(3rd)
t2.findElement(By.cssSelector("input[type='search']")).sendKeys("mobile");









	}

}
