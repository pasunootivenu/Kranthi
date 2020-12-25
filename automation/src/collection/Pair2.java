package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pair2 {

	public static void main(String[] args)
	{
		Map s2=new HashMap();
		
		s2.put(2,"hours");
		s2.put(3,"hours");
		s2.put(4,"practise");
		
		s2.put(2,"job");
	
		Set s3=s2.entrySet();
		
	    Iterator itr=s3.iterator();
	    		
		/*Object obj=s2.get(2);
		System.out.println(obj);*/
		
		
	    while (itr.hasNext())
	    {
	    	Object obj=itr.next();
	    	
	    	Map.Entry entry=(Map.Entry)obj;
	    	
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
		
		
		
		
		
		
		
		
		

	}

}
