public class Copyarray{
 
  public static void main(String arg[])
  {
    int [] arry1=new int [] {1,2,3,4,4};
    int arry2[]=new int[arry1.length];

    for(int i=0; i<arry1.length; i++)
    {
      arry2[i]=arry1[i];

    }


    System.out.println("first array is :");

    for(int i=0; i<arry1.length; i++)
   { 
     System.out.println(arry1[i]+" ");
   }
 
   System.out.println();
  
     System.out.println("secoend array is :");
   for(int i=0; i<arry2.length; i++)
    {
      System.out.println(arry2[i]+" ");  
    
    }
 }
}