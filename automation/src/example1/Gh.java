package example1;

class Gh1
{
	int mul()//parent class method(overriden or skiped)
	{
		return 10;
	}
   
    	
}
class  Gh2 extends Gh1
{
	String sub()
	{
		return "corejava";
	}
	int mul()
	{
		return 100;
	}
}

class Gh extends Gh2
 {
	 int mul()//child class(executed)
    {
	  return 50;
	}
	char div()
	{
		return 'e';
	}
	 

	public static void main(String[] args)
	{
		
		Gh2 s2=new Gh2();
		System.out.println(s2.mul());
		System.out.println(s2.sub());
		
		Gh s1=new Gh();
		System.out.println(s1.mul());
		System.out.println(s1.div());
		System.out.println(s1.sub());

	}

}
