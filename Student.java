//objects and class example.

class Student{

   int id=1; // instance variable
   String name;

//main method inside class

   public static void main(String... arg)
   {
       
    Student s1 = new Student(); //class object
    
    //printing value of the object

    System.out.println(s1.id);
    System.out.println(s1.name);
   }

}