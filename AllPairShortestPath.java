import java.util.Scanner;
class AllPairShortestPath
{ 
   int min(int a,int b)
   {
    if(a<b)
     return a;
     else if(a==b)
     return a;
     else
     return b;
}
  public static void main(String args[])
 {  Scanner sc=new Scanner(System.in);
    AllPairShortestPath m=new AllPairShortestPath();
           int n,i,j,k;  
		   System.out.println("Enter the no of Nodes: ");
           n=sc.nextInt();
           int a[][]=new int[n][n];
		   System.out.println("Enter Adjacency Matrix: ");
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
             a[i][j]=m.min(a[i][j],a[i][k]+a[k][j]);
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