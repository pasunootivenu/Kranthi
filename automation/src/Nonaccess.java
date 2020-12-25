
class Nonaccess 
{
    void add1()//method 
    {
    	System.out.println("addition");
    }
    
    static void sub1() //static method
    {
    	System.out.println("substarction");
    }
    
    int a=10;
    static String b="test"; //static variable
	
	
	public static void main(String[] args) 
	{
		Nonaccess s1=new Nonaccess();
		s1.add1();
		
		sub1(); //directly we can call a static method
		Nonaccess.sub1();// we can call by using class
		
		
		System.out.println(s1.a);
		System.out.println(b);
		
		

	}

}
