package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapping 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> t1=new HashMap<Integer,String>();
		
		t1.put(1,"corejava");
		t1.put(2, "automation");
		t1.put(1,"selenium");
		t1.put(1, "manual");
		t1.put(2, "api testing");
		
		
		System.out.println(t1);
		
		System.out.println(t1.get(1)); // manual
		System.out.println(t1.get(2)); //api testing
		
		
		System.out.println(t1.get(3)); //null
		
		System.out.println(t1.getOrDefault(3,"interview"));
		
		
		
		

	}

}
