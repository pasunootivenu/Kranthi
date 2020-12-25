package program1;

 class Fib1 
 {

 public static void main(String[] args)
{
 int a=1,b=1,c,i,count=8;
 //To print 1 and 1
 System.out.print(a+" "+b);
 //to print from 2 to 55
 for(i=1;i<=count;i++)
 {
   c=a+b;
   System.out.print(" "+c);
   a=b;
   b=c;
 }
 
}
 }
