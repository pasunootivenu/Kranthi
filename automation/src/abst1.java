interface B
{
   void add1();	
}


public class abst1 implements  B
{
public	void add1()
	{
		System.out.println("20");
	}

	public static void main(String[] args) 
	{
		B s1=new abst1();
		
		s1.add1();

	}

}
