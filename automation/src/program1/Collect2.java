package program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collect2 
 {

	public static void main(String[] args) 
	{
		List<Integer> s1=new ArrayList<Integer>(); //generic collection
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		
		Iterator<Integer> s2=s1.iterator();
		
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}

	}

}
