package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Nondup1 
{

	public static void main(String[] args) 
	{
		Set<String> t1=new HashSet<String>();
		
		t1.add("test1");
		t1.add("corejava");
		t1.add("test");
		t1.add("corejava");
		
		t1.remove("test");
		t1.add("automation");
		
		t1.remove("corejava");
		t1.add("selenium");
		
		//System.out.println(t1);
		
		//System.out.println(t1.getClass());
		
		Iterator itr=t1.iterator();
		
		while (itr.hasNext()) 
		{
		    Object obj=itr.next();
		    String str=(String)obj;
		               
		    
		   if(str.equals("selenium"))
		   {
			 System.out.println("it is a automation tetsing tool");   
		   }
	
		 }
		
	}

}
