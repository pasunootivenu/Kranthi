package logics;

class fibonacci 
{

	public static void main(String[] args)
	{
		int x=1;
		int y=2;
		
		int z,n=10;
		
		System.out.print(x+" "+y);
		
		for(int i=3;i<=n;i++)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
			
		}
		
		
	}

}
