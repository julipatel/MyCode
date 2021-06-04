/*public class Fiboseries{

 public static void main(String arg[])
 {
   int i, n1=0,n2=1,n3;
  System.out.println(n1+" "+n2);
   for(i=2;i<10;++i)
   {
     n3=n1+n2;
    System.out.println(" "+n3);
     n1=n2;
     n2=n3;
     

   }

 }


}*/





class FibonacciExample1{
public static void main(String args[])
{  
 int n1=0,n2=1,n3,i,count=10;  
 System.out.print(n1+" "+n2);//printing 0 and 1  
  
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
 {  
  n3=n1+n2;  
  System.out.print(" "+n3);  
  n1=n2;  
  n2=n3;  
 }  

}}
