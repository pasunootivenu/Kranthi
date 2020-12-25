package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Nodup 
{

	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet();
		
		s1.add("test");
		s1.add("corejava");
		s1.add("corejava");
		
		
	    Iterator itr=s1.iterator();
		
		  //String s=itr.next();
		 //Object obj1=itr.next();
		
		while(itr.hasNext())
		{ 
		   Object obj=itr.next();
		   String str=(String)obj; 
		   System.out.println(str);	
		   
		   if(str=="test")
		   {
			   System.out.println("element available");
		   }
		   
	    }
		    
		    
		
		
		
		
		
		
		
		
		
	}

}
