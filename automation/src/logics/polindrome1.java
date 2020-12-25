package logics;

class polindrome1 
{

	public static void main(String[] args) 
	{
		
		int n=121,sum=0,r,i;
		
		int temp=n;
		
		
		while(n!=0)
		{
			r=n%10; //2
			sum=(sum*10)+r; // 0
			n=n/10; //12
		}
		if(sum==temp)
		{
			
			
		}
		

	}

}
