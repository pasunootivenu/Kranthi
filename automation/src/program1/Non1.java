package program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Non1 
{

	public static void main(String[] args) 
	{
		List<Integer> t1=new ArrayList<Integer>();
		
		t1.add(10);
		t1.add(20);
		
		t1.remove(1);
		
		t1.add(30);
		
		Iterator<Integer> t2=t1.iterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
		
		List<Character> s1=new ArrayList<Character>();
		s1.add('t');
		s1.add('e');
		
		Iterator<Character> t3=s1.iterator();
		while(t3.hasNext())
		{
			System.out.println(t3.next());
		}
		
		
		
		
		
		
		
		
	}
		

	}


