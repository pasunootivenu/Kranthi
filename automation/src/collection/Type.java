package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Type 
{
	
	public static void main(String[] args) 
	{
		
Set<Character> s1=new HashSet<Character>();//generic collection

s1.add('r');
s1.add('t');
s1.add('r');
s1.add('i');

  
Iterator<Character> itr=s1.iterator();

/*System.out.println(itr.next());
System.out.println(itr.next());
System.out.println(itr.next());*/


while(itr.hasNext())
{	
   Object obj=itr.next(); //charcter element (object class)
      
    char c=(char)obj; //type casting
   
    if(c=='i') //comparison
    {
    	System.out.println("use this letter");
    }
    else
    {
    	System.out.println("dont use this letter");
    }
    	
	
}









		
		
		
		
		
				
				
	}

}
