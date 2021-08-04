import java.util.*;
class TransitiveClosure
{ public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
      int n,i,j,k;
      System.out.println("Enter the no of Nodes: ");
       n=sc.nextInt();
       int a[][]=new int[n][n];
       System.out.println("Enter Adj. Matrix: ");
       for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
         {
            a[i][j]=sc.nextInt();
         }
        }
       for(k=0;k<n;k++)
        {
       for(i=0;i<n;i++)
        {
       for(j=0;j<n;j++)
       {
         a[i][j]= a[i][j] | (a[i][k] & a[k][j]) ;
       }
       }
       }
      System.out.println("The final adjacency matrix is: \n");
      for(i=0;i<n;i++)
      { 
         for(j=0;j<n;j++)
         {
         System.out.print(a[i][j]+" ");
         }
         System.out.println();
      }
     }
   }
