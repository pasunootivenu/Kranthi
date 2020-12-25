package logics;

public class max {

	public static void main(String[] args) 
	{
		int b[]={7,2,1,4};
		
		int max=b[0];
		
		for(int i=1;i<=b.length-1;i++)
		{
			
			if(max<b[i])
			{
				max=b[i];
			}
			
			
		}
		System.out.println(max);
		
	}

}
