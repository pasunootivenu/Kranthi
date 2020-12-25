package logics;

class min1 
{

	public static void main(String[] args) 
	{
	   int a[]={6,2,4,1};
	   
	   int min=a[0];
	   
	   for(int i=1;i<=a.length-1;i++)
	   {
		   if(min>a[i])
		   {
			   min=a[i];
		   }
		  
	   }
	   System.out.println(min);
	}

}
