package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sun.applet.resources.MsgAppletViewer_pt_BR;

class Pair3 
 {

	public static void main(String[] args)
	{
	
  Map s1=new HashMap(); 
  
  s1.put(8,"testing");
  s1.put(3,"selenium");
  //s1.put("java","corejava");
  s1.put(3,"manual");
  
  System.out.println(s1.keySet());
  System.out.println(s1.values());
  System.out.println(s1.entrySet());
  
   Set s2=s1.entrySet();
   
   Iterator s3=s2.iterator();
   
    while(s3.hasNext())
    {
    	Object obj=s3.next();
    	Map.Entry entry=(Map.Entry)obj;
    	
    	System.out.println(entry.getKey()+" "+entry.getValue());
    	
    	     int s=(int)entry.getKey();
    	     
    	     if(s==3)
    	     {
    	    	 System.out.println("job on selenium");
    	     }
    	
    	
    }
  
  
  
  
   
      
  
  
  
	   
	
	

	}

}
