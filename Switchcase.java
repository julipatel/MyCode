public class Switchcase{

   public static void main(String... arg)
   {

    int clgyear=2;
    char branch='c';
    String subject="";
    switch(clgyear)
    { 
      case 1:
         subject="computer sc,maths";
         break;
     case 2:
         switch(branch)
         {
           case 'c':subject="computer sc";
           break;
           case 'ec':subject="robotics";
           break;
         }
     case 3:
         switch(branch)
         {
           case 'c':subject="c++";
           break;
           case 'ec':subject="switch programming";
           break;
         }
    
      default: System.out.println("invalid");
    }
  }
}