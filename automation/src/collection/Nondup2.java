package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Nondup2 
{

	public static void main(String[] args)
	{
		Set<Integer> s1=new HashSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		
		s1.add(20);
		s1.remove(0);
		
		s1.add(40);
		s1.add(50);
		
		s1.remove(1);
		s1.add(60);
		
		Iterator s2=s1.iterator();
		
		while(s2.hasNext()) 
		{
		     	
		Object obj=s2.next();
		
		Integer num=(Integer)obj;
		
		if(num==60)
		{
			System.out.println("it is a big value");
		}
		}
		
	}

}
