package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Fra1 
 {

	public static void main(String[] args) throws Exception 
	{
WebDriver t2=new ChromeDriver();
t2.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
t2.manage().window().maximize();
		
t2.switchTo().frame(0); //1st frame
Thread.sleep(5000);
		
t2.findElement(By.linkText("com.thoughtworks.selenium")).click();
Thread.sleep(4000);
		
t2.switchTo().defaultContent(); //default webpage
Thread.sleep(4000);
	    
t2.switchTo().frame(2); //3rd frame
Thread.sleep(4000);
	    
t2.findElement(By.linkText("org.openqa.selenium.edge")).click();
Thread.sleep(4000);
	    
t2.switchTo().defaultContent(); //default webpage
Thread.sleep(4000);
	    
t2.switchTo().frame(0);  //1st frame
Thread.sleep(4000);
	    
t2.findElement(By.linkText("org.openqa.selenium.grid.web")).click();
	    
	    
	    
	    
	    
		
		
	}

}
