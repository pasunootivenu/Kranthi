package collection;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;

class pair 
{

	public static void main(String[] args) 
	{
	   Map hashmap=new HashMap();
	   
	   hashmap.put(1,"test");
	   hashmap.put(2,"corejava");
	   hashmap.put(3,"selenium");
	   hashmap.put(1, "testing");
	   hashmap.put(2,"advanced java");
	   hashmap.put("manual","testing");
	   hashmap.put('g',12);
	   hashmap.put(null,null);
	   
	   System.out.println(hashmap);
	   System.out.println(hashmap.get("manual"));
	   System.out.println(hashmap.get(3));
	   
	   //System.out.println(hashmap.get("abc"));
	   
	   System.out.println(hashmap.getOrDefault("abc","job=practise"));
	   
	   System.out.println("KEYS:"+hashmap.keySet()); //set
	   System.out.println("VALUES"+hashmap.values()); //map
	   System.out.println("ENTRYSET"+hashmap.entrySet());
	   
	   
	   
	   
	   
	   
	   

	}

}
