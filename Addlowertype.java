class Addlowertype{

     public static void main(String arg[])
   
      {

       byte a=20;
       byte b=-10;
   // byte c=a+b;//compile time error bcz a+b=20 will be int so
       byte c=(byte)(a+b);
 
      System.out.println(c);

    }
}