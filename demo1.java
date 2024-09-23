import java.lang.*;
import java.util.*;
class demo1
{
    public static void main(String s[])
    {
        int a[][]= new int[2][2];
        int i,j,k=0;
        for (i=0;i<2;i++)
          for (j=0;j<2;j++)
           {
         
            a[i][j] =k;
            k++;
           }
        
          for (i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(a[i][j]);
            }
         }
          
        
       
       
    }
}
