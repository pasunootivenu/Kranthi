package program1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collect1 
 {

	public static void main(String[] args) 
	{
		List t1=new ArrayList(); //Non-generic collection
		t1.add(10);
		t1.add("testing");
		t1.add('h');
		t1.add(1.45f);
		
		Iterator t2=t1.iterator();
		
		System.out.println(t2.next());
		System.out.println(t2.next());
		System.out.println(t2.next());
		System.out.println(t2.next());
		
		

	}

}
