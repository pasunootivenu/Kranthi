package example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws Exception
	{

 WebDriver t1=new ChromeDriver();
 t1.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/homepage");
 Thread.sleep(4000);
 
 t1.findElement(By.xpath("//div[text()='Recruiters']")).click();
 
 Thread.sleep(5000);
 
 t1.findElement(By.xpath("//div[text()='Companies']")).click();
 
 Set<String> s1=t1.getWindowHandles();
 
 List<String> s2=new ArrayList<String>(s1);
 
 Thread.sleep(5000);
 
 System.out.println(s2.size());
 
String close=s2.get(0); //2nd window


 
 t1.switchTo().window(close).close();
 
 
 //for(String )
 
 
 
 
 //Iterator< String> itr=s1.iterator();
 
/*String main=itr.next();

String child1=itr.next();

String child2=itr.next();

Thread.sleep(5000);

System.out.println("main window"+main);

System.out.println("CHILD window1"+child1);
System.out.println("CHILD window2"+child2);
  
t1.switchTo().window(child2).close(); */
 
/* 
 for(String k:s1)
 {
	 t1.switchTo().window(k);
	 String title=t1.getTitle();
	 
	 System.out.println(title);
	 
	if(title.equalsIgnoreCase("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com"))
	{
		t1.close(); 
	}
	 
 }*/



    

	}

}
