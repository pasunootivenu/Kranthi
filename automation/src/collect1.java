
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collect1 
{

	public static void main(String[] args) 
	{
		List s1=new ArrayList(); //non generic collection
		
		s1.add(10);
		s1.add("test");
		s1.add('t');
		s1.add(3.45f);
		
		s1.remove(1);
		s1.add(20);
		s1.add("corejava");
		
		s1.remove(1);
		s1.add(30);
		s1.remove(1);
		
		
	    System.out.println(s1.get(0));
	    System.out.println(s1.get(1));
	    
	    
	    for(int i=0;i<=s1.size();i++)
	    {
	    	System.out.println(s1.get(i));
	    }
	    
	    
	    Iterator s2=s1.iterator();
	    
	    System.out.println(s2.next());
	    System.out.println(s2.next());
	    System.out.println(s2.next());
	    System.out.println(s2.next());
	    
		
	    while(s2.hasNext()) //boolean condition
	    {
	    	System.out.println(s2.next());
	    }
	    
	    
	    
		
		
		   
		
		
		
		

	}

}
