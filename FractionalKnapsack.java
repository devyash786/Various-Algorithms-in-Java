import java.util.*;
class FractionalKnapsack
{ public static void main(String args[])
   {  Scanner sc=new Scanner(System.in);
        int n,i,j;
       double wsum=0.0,profit=0.0,wt=0.0,x=0.0;
       System.out.println("Enter no. of pieces: ");
       n=sc.nextInt();
      double w[]=new double[n];
	  double r[]=new double[n];
	  double v[]=new double[n];
     System.out.println("Enter weight and price of each piece: ");
       for(i=0;i<n;i++)
        {
       w[i]=sc.nextDouble();
	   v[i]=sc.nextDouble();
	   r[i]=v[i]/w[i];
	   wsum=wsum+w[i];
	   profit=profit+v[i];
	   }
    System.out.println("Enter the capacity : ");
     wt=sc.nextDouble();
     if(wsum<=wt)
    System.out.println("Max profit that can be achieved is :"+profit);
     else
     {
      profit=0.0;
      wsum=0.0;
      for(i=0;i<n-1;i++)
       {
        for(j=0;j<n-i-1;j++)
        {
          if(r[j]<r[j+1])
           {
           double swap=r[j];
           r[j]=r[j+1];
           r[j+1]=swap;
           double temp=w[j];
           w[j]=w[j+1];
           w[j+1]=swap;
		   }
		   }
         }
        i=0;
       while(wsum<wt)
      {
        if(w[i]<=wt-wsum)
        x=w[i];
        else
        x=wt-wsum;
        profit=profit+(x*r[i]);
        wsum=wsum+x;
         i++;
}
System.out.println("\nMax profit is :"+profit);
}
}
     }
   
