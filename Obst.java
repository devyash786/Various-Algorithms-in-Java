import java.util.Scanner;
class Obst
{ public static void main(String args[])
 {     Scanner sc= new Scanner(System.in);
       int n,i,j,k,temp=0,min,p=0,x=0,y=0;
       System.out.println("Enter no of nodes: ");
       n=sc.nextInt();
	   int ke[]=new int[n];
	   int f[]=new int[n];
     System.out.println("Enter the key and frequency of each node: ");
      for(i=0;i<n;i++)
     {
      ke[i]=sc.nextInt();
	  f[i]=sc.nextInt();
      }
   int c[][]=new int[n][n];
     for(i=0;i<n;i++)
       {
       for(j=0;j<n;j++)
       {
        if(i==j)
         c[i][j]=f[i];
         else if(i>j)
         c[i][j]=0;
        }
       }
      for(int l=2;l<=n;l++)
      {
       for(i=0;i<n-l+1;i++)
        {
           j=i+l-1;
           min=10000;
           p=0;
          for(k=i;k<=j;k++)
        {
            x=0;
            y=0;
            if(k>i)
            x=c[i][k-1];
            if(k<j)
            y=c[k+1][j];
			temp=x+y;
          if(temp<min)
            min=temp;
            p=p+f[k];
        }
     c[i][j]=min+p;
 }
}
System.out.println("\nThe Optimal cost is :"+c[0][n-1]);
}}