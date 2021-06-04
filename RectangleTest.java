//multiple objects by one type only


class Rectangle{
 int length;
 int width;

  void insert(int l,int w)
  {  
    length = l;
    width = w;
  }
   
  void Display()
  {  
      System.out.println(length*width);
  } 
}

class RectangleTest
{ 
    public static void main(String... arg)
    {
       Rectangle r1=new Rectangle(),r2=new Rectangle();
      
       r1.insert(11,9);
       r2.insert(10,3);
       r1.Display();
       r2.Display();
    }
}