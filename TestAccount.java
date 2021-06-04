class Account{

    int acc_no;
    String name;
    float amount;

  void insert(int n,String s,float amt)
  {
    acc_no=n; 
    name = s;
    amount = amt;
  }
   
   void deposit(float amt)
  {
   amount=amount+amt;
   System.out.println(amt+ "deposited");
  }
  
  void withdrow(float amt)
 {
   if(amount<amt)
    {
       System.out.println("Insufficient balance");
    }
     else{
            amount=amount+amt;
           System.out.println("Insufficient balance");
         }

  }
   void checkbalance()
   { 
     System.out.println("Total is :" +amount);
   }
   void dispaly()
   {
     System.out.println(acc_no+" "+name+" "+amount);
   }
}

class TestAccount
{
  public static void main(String arg[])
  {
    Account a1=new Account();
    a1.insert(1254652,"aaaaa",20000);
    a1.deposit(1000);
    a1.checkbalance();
    a1.withdrow(22000);
    a1.checkbalance();
  }
}