package program1;

 class B3 
 {
	 void add(int a) //1 parameter
     {
       System.out.println(a);
     }
    void add(int a,int b) //2 parameters
    {
 
      System.out.println(a+b);
    }
   void add(int a,int b,int c) //3 parameters
    {
      System.out.println(a+b+c);
    }
	public static void main(String[] args) //main method
	{
		B3 t1=new B3(); //object creation
		t1.add(10);
		t1.add(10,20);
		t1.add(10,20,30);

	}

}
