package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Dup3 
{

	public static void main(String[] args) 
	{
		
		 List<Integer> s1=new ArrayList<Integer>();
		 
		 s1.add(10);
		 s1.add(20);
		 s1.add(10);
		 s1.add(30);
		 
		 
		 
		 Iterator itr=s1.iterator();
		  
		 System.out.println(itr.next());
		 System.out.println(itr.next());
		 
		/* while(itr.hasNext())
		 {
			 System.out.println(itr.next());
   
		 }*/
		 
		 
		 while(itr.hasNext())
		 {
			 
			 Object obj=new Object();
			 obj=itr.next(); //10
			 
			 System.out.println(obj);
			 
		 }
			 
			 
		 
		 

			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
