package program1;

 class Var1 
 {
    static int e=50;  //static variable
    static String d="corejava"; //static variable
  
    void sub()
    {
    System.out.println(e); //accessing static variables inside a method 
    System.out.println(d);
    }
    

	public static void main(String[] args) 
	{
		
	System.out.println(e); //accessing static variables from main method
	System.out.println(d);
	
	Var1 s1=new Var1();
	s1.sub();
	
		
		
 
	}

}
