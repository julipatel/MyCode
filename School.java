//initlize object by varible reference

class Student{

  int id;
  String name;

}

class School{

    public static void main(String... arg)
    {
      Student s1 = new Student();
      Student s2 = new Student();
      s1.id=01;
      s1.name="juli";
      s2.name="xyz";
      System.out.println(s1.id + s1.name+" "+s2.name);/*both varible print in same row , 
                                                 ican use with white space with s1.id+ "" +s1.name*/

    }

}