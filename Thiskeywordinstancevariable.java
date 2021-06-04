class Thiskeyword{

int rollno;
String name;

Thiskeyword(int rollno, String name)
{ 
  this.rollno=rollno;
  this.name=name;
}
 void display()
  {
    System.out.println(rollno+ " " +name);
  }
}

class Thiskeywordinstancevariable{

 public static void main(String... arg)
 {
   Thiskeyword tw1=new Thiskeyword(01, "aaa");
   Thiskeyword tw2=new Thiskeyword(02, "bbb");
   tw1.display();
   tw2.display();
 }
}