class Staticmethod{
  int id;
  String name;
  static String college="ITS";
  //int a =10;

 static void change()
  {
   college = "BBDT";
  }

 Staticmethod(int i, String n)
 {
   id=i;
   name=n;
 }
 
 void display()
 {
   System.out.println(id+ " " +name+ " "+college);
 }
 
  public static void main(String arg[])
  {
    Staticmethod.change();
   Staticmethod cc1=new Staticmethod(11,"aaaa");
   Staticmethod cc2=new Staticmethod(22,"bbbb");
   //Staticvariable.college="BDST"; i can change the college in by this line.
   //System.out.println(a); cannot use non static data in static context
   cc1.display();
   cc2.display();
  }

}