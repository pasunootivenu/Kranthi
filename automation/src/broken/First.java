package broken;



class First 
{
    
	int a=10; // above main method
	int b=20;
	
	public static void main(String[] args) // main method 
	{
		First s1=new First(); //object creation line
		System.out.println(s1.a); //10 value will be printed
		System.out.println(s1.b);
		
		
		System.out.println("corejava"); //print statement (code inside a main method)   
	}

}
