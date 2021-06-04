//Anonymous object 


class Calculation{

  void fact(int n)
  {
    int i,s=1;
    
    for(i=1;i<=n; i++)
     {
       s = s*i;
     }
      System.out.println("factorial no is:" +s);
  }
 
    public static void main(String... arg)
    {
       new Calculation().fact(5);
    }

}