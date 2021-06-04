/*objects and class, here we created two classes and main()
method create in other class */

class Student{

  int id;
  String name="juli"; 

}

class TestStudent{

   public static void main(String... arg)
    {
      Student s1 = new Student();

      System.out.println(s1.id);
      System.out.println(s1.name);
    }
}