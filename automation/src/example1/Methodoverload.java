package example1;



public class Methodoverload 
{
	
	
	void add(String a,int b,char c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		Methodoverload s1=new Methodoverload();
		s1.add("test", 30, 'j');

	}

}
