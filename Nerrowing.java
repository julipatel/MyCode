class Nerrowing{
   
 public static void main(String... arg){
 
     float f= 50.0f;
     //int a=f - complie time error 
     int a=(int)f; //it's called nerrowing (typecasting)
 
  System.out.println(f);
  System.out.println(a);
  

 }
}