package collection;

import java.util.ArrayList;
import java.util.List;

public class Dup12 {

	public static void main(String[] args) 
	{
		List s1=new ArrayList();
		
		s1.add(10);
		s1.add(20);
		s1.add(20);
		
		s1.add("test");
		s1.add('t');
		s1.add(2.45f);
		
		s1.remove(3);
		
		System.out.println(s1);
		
		
		
		
		

	}

}
