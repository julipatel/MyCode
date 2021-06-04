//initlize object by method

class Student{

  int id;
  String name;
   
  void studentRecords(int r, String s)
  {
    id=r;
    name=s;
  }
 
  void displayrecords()
  {
    System.out.println(id+" "+name);
  }

}

class StudentMethod{

    public static void main(String... arg)
    {
      Student s1 = new Student(); //student class execute
 
      s1.studentRecords(01,"juli");

      s1.displayrecords();

    }

}