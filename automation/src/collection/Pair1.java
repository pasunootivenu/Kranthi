package collection;

import java.util.HashMap;
import java.util.Map;

class Pair1 
{

	public static void main(String[] args)
	{
		Map<Integer,String> s1=new HashMap<Integer, String>();
		
		s1.put(1,"job");
		s1.put(2,"mandatory");
		s1.put(3,"practise");
		//s1.put(3, "have to settle");
		
		System.out.println("KEYS are:"+s1.keySet());
		System.out.println("VALUES ARE:"+s1.values());
		System.out.println("BOTH KEYS AND VALUES ARE:"+s1.entrySet());
		
		System.out.println(s1.getOrDefault("abc","job=life"));
		System.out.println(s1.get("abc"));
		
		
		System.out.println(s1.entrySet());
		
		

	}

}
