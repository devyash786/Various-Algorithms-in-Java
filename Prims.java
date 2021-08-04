import java.util.Scanner;
class Prims
{ 
  public static void main(String args [])
   { Scanner sc=new Scanner(System.in);
    int a=1,b=1,u=1,v=1,n=1,i=1,j=1,ne=1;
    int visited[]=new int[10];
	int min,mincost=0;
	System.out.println("Enter the number of nodes:");
    n=sc.nextInt();
	int cost[][]=new int[n+1][n+1];
    System.out.println("Enter the adjacency matrix:");
    for(i=1;i<=n;i++)
     for(j=1;j<=n;j++){
     cost[i][j]=sc.nextInt();;
if(cost[i][j]==0)
cost[i][j]=999;
}
visited[1]=1;

while(ne < n)
{
for(i=1,min=999;i<=n;i++)
for(j=1;j<=n;j++)
if(cost[i][j]< min)
if(visited[i]!=0)
{ min=cost[i][j];
a=u=i;
b=v=j; }
if(visited[u]==0 || visited[v]==0)
{ System.out.println("Edge::"+(ne++)+" "+"("+a+":"+b+")"+" "+min);
mincost+=min;
visited[b]=1; }
cost[a][b]=cost[b][a]=999;
}
System.out.println(" Minimun cost::"+mincost);
}}