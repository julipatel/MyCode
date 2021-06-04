class Submatrix{

  public static void main(String arg[])
  {
    int rows,cols;
    int a[][]={
               {1, 2, 4},
               {4, 3, 4},
               {5, 4, 6}
              };

   int b[][]={
               {5, 2, 4},
               {4, 8, 4},
               {5, 3, 6}
              };

      rows = a.length;
      cols = a[0].length;

 int diff[][] = new int[rows][cols];
   
    for(int i=0; i<rows; i++)
     {
       for(int j=0; j<cols; j++)
        {
          diff[i][j]= a[i][j]-b[i][j];
        }
     }

      System.out.println("Substraction of two matrix:");
 
      for(int i=0; i<rows;i++)
       {
         for(int j=0; j<cols; j++)
          {
            System.out.println(diff[i][j]+"");
          }
           System.out.println();
       }
  } 
}