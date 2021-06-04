class Reverseno{
public static void main(String args[])
{  
 int number=123456,reverse=0, reminder; 
  
  while(number!=0)
  {
    reminder=number%10;
    reverse=reverse*10+reminder;
    number=number/10;
  } 
 System.out.print(""+reverse);  

}}
