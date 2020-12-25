package program1;

public class Var2 
{
	static  void mul() //static method
	{
		 int s=60;
		 System.out.println(s);
		 
	}
	
	public static void main(String[] args)
	{
		Var2 t1=new Var2();
		Var2.mul(); //calling static method with the class
		

	}

}
