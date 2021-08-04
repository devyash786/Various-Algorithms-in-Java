import java.util.*;
class Graph1 {
             int V,E; 
			 Edge[] edge;
			 class Edge{
			 int src,dest,weight;
			 Edge(){
     src=dest=weight=0;
   }
}
        Graph1(int nV,int nE){
               V=nV;
			   E=nE;
			   edge = new Edge[E];
           for(int i=0;i<E;i++) {
            edge[i]= new Edge();
             }
            }
       void BellmanFord(Graph1 graph,int source) {
        int V=graph.V;
        int E=graph.E;
        int[] dist = new int[V];
        for(int i=0;i<V;i++) {
         dist[i]=Integer.MAX_VALUE;
}
dist[source]=0;
for(int i=1;i<V;i++) {
for(int j=0;j<E;j++) {
int u=graph.edge[j].src;
int v=graph.edge[j].dest;
int weight=graph.edge[j].weight;
if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]) {
dist[v]=dist[u]+weight;
}
}
}
for(int j=0;j<E;j++) {
int u=graph.edge[j].src;
int v=graph.edge[j].dest;
int weight=graph.edge[j].weight;
if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]) {
System.out.println("Negative Weight Cycle Exists");
return;
}
}
System.out.println("Vertex : Distance from Source");
for(int i=0;i<V;i++) {
System.out.println(i+"\t\t"+dist[i]);
}
}
public static void main(String[] args) {
int V,E,source;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the toal no. of Vertices: ");
V=scan.nextInt();
System.out.println("Enter the toal no. of Edges: ");
E=scan.nextInt();
Graph1 graph = new Graph1(V,E);
for(int i=0;i<E;i++) {
System.out.println("Enter the Source of Edge "+(i+1)+": ");
graph.edge[i].src=scan.nextInt();
System.out.println("Enter the destination of Edge "+(i+1)+": ");
graph.edge[i].dest=scan.nextInt();
System.out.println("Enter the Weight of Edge "+(i+1)+": ");
graph.edge[i].weight=scan.nextInt();
}
System.out.println("Enter the Source Vertex: ");
source=scan.nextInt();
scan.close();
graph.BellmanFord(graph,source);
}}