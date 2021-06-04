class Staticvariable{
  int id;
  String name;
  static String college="ITS";

 Staticvariable(int i, String n)
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
   Staticvariable  cc1=new Staticvariable(11,"aaaa");
   Staticvariable  cc2=new Staticvariable(22,"bbbb");
   //Staticvariable.college="BDST"; i can change the college in by this line.
   
   cc1.display();
   cc2.display();
  }

}