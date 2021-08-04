 #include<stdio.h>
int min(int x,int y)
{
	int a=x>y?y:x;
	return a;
}
int main()
{
	int A[20],amount,i,j;
	int n;
	printf("Enter the No of types of Coins:");
	scanf("%d",&n);
	printf("\nEnter the coins");
	for(int i=1;i<=n;i++)
	{
		printf("\n Enter the type of Coin:");
		scanf("%d",&A[i]);
	}
	printf("\nEnter the amount::");
	scanf("%d",&amount);
    int M[20][20];
    for(i=0;i<=n;i++)
     {for(j=1;j<=amount;j++)
       {
       	 M[0][j]=1000;
	   }
	   M[i][0]=0;
	 }
  for(i=1;i<=n;i++)
     for(j=1;j<=amount;j++)
       {
       	 if(j-A[i]<0)
       	  M[i][j]=M[i-1][j];
       	  else
       	  M[i][j]=min(M[i-1][j],(1+M[i][j-A[i]]));
	   }
	   
	  for(i=1;i<=n;i++)
     {for(j=1;j<=amount;j++)
       {   printf("%d   ",M[i][j]);
	 }
	 printf("\n");
}}
