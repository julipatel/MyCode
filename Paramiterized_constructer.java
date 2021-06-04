class Paramiterized_constructer{
  
 int id;
 String name;

  // creating paramiterized constructer (constructer name always same as class name)
  
 Paramiterized_constructer(int i ,String s)
 {
  id=i;
  name=s;
 }
  
 void display()
 {
  System.out.println(id+ " " +name);
 }

 public static void main(String arg[])
 {
  Paramiterized_constructer s1 = new Paramiterized_constructer(111,"aaa");
  s1.display();
 }

}