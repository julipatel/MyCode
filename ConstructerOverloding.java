class ConstructerOverloding{

  int id,age;
  String name;
  
 ConstructerOverloding(int i, String n)
 {
  id=i;
  name=n;
 }
 
 ConstructerOverloding(int i, String n, int a)
 {
  id=i;
  name=n;
  age=a;
 }
 void display()
 {
  System.out.println(id+ " " +name+ " " +age);
 }
 
 public static void main(String arg[])
 {
  ConstructerOverloding cs1 =new ConstructerOverloding(01,"aaa");
  ConstructerOverloding cs2 =new ConstructerOverloding(02,"bbb",20);
  cs1.display();
  cs2.display();
 }
}