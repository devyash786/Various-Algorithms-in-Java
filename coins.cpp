#include<stdio.h>
int main()
{
	int A[20],amount;
	int n;
	printf("Enter the No of types of Coins:");
	scanf("%d",&n);
	printf("\nEnter the coins");
	for(int i=0;i<n;i++)
	{
		printf("\n Enter the type of Coin:");
		scanf("%d",&A[i]);
	}
	printf("\nEnter the amount");
	scanf("%d",&amount);
	int x=amount,sum=0;
	for(int i=0;i<n;i++)
	{ 
	  int y=amount/A[i];
	  
	  if(y!=0)
	  {
	   printf("\nNo of %d coins are %d",A[i],y);
	   sum=sum+y;
	  }
	  amount=amount%A[i];	
	 } 
	printf("\nTotal coins used are :%d",sum); 
}
