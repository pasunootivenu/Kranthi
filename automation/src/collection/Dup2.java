package collection;

import java.util.ArrayList;
import java.util.List;

class Dup2 
 {

	public static void main(String[] args) 
	{
		int a=7;
	     int b=0;
	     
	     for(int i=1;i<=4;i++)
	    {

	        for(int j=1;j<=a;j++)
	        {

	         System.out.print("*");
	        }
	        for(int k=1;k<=b;k++)
	        {

	        System.out.print(" ");
	        }
        
	        System.out.println();
	       a=a-2;
	       b=b+1;
	   }
	  
	  
	  
	  
	  
	  
    
	}

}
