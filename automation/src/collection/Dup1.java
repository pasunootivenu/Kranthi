package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Dup1 
{

	public static void main(String[] args) 
	{
		List<Integer> s1=new ArrayList<Integer>();

		s1.add(10);
		s1.add(20);
		s1.add(10);
		s1.add(20);
		s1.add(30);

		Iterator itr=s1.iterator();

		while(itr.hasNext())
		{
			Object obj=itr.next();

			Integer t1=(Integer)obj;

			System.out.println(t1);
			
			if(t1==20)
			{
				System.out.println("second element");
			}


		}

	}

}