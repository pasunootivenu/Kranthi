package example1;

 class B45 
{
	 int x;  //instance variable
	 int y;
	 
	 B45(int x,int y)  //parameterised constructor method
	 {
		 this.x=x;
		 this.y=y;
	 }  

	public static void main(String[] args) 
	{
		B45 t1=new B45(10,20);  //object creation
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		B45 t2=new B45(30,40);
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		
	}

}
