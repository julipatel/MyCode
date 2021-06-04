class Copyconstructor{
  int id;
  String name;

 Copyconstructor(int i, String n)
 {
   id=i;
   name=n;
 }
 
 Copyconstructor(Copyconstructor c)
 {
  id=c.id;
  name=c.name;
 }

  Copyconstructor(){} //copying value one object to another without use of constructor
 
 void display()
 {
   System.out.println(id+ " " +name);
 }
 
  public static void main(String arg[])
  {
   Copyconstructor cc1=new Copyconstructor(11,"aaaa");
   Copyconstructor cc2=new Copyconstructor(cc1);
   Copyconstructor cc3=new Copyconstructor();
   cc3.id=cc2.id;
   cc3.name=cc2.name;
   cc1.display();
   cc2.display();
   cc3.display();
  }

}