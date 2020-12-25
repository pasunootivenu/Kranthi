package program2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Fra3 
 {

	public static void main(String[] args) throws Exception
	{
WebDriver t1=new ChromeDriver();
t1.get("https://www.dezlearn.com/testingpage/");
Thread.sleep(6000);

 t1.switchTo().frame("contact-iframe"); //frame id
 Thread.sleep(5000);
 
 t1.findElement(By.xpath(".//*[@id='ninja_forms_field_11']")).sendKeys("laptop");
 
 t1.switchTo().defaultContent();
 
 t1.switchTo().frame("register-iframe"); //frame name
 
 Thread.sleep(5000);
 
 
 t1.findElement(By.xpath("//input[@class='search-field']")).sendKeys("mobile");
 
 
 
 
 

	}

}
