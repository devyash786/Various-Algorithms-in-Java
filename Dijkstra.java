import java.util.*;
class Dijkstra {

    public static void dijkstra(int[][] graph, int sourceVertex){
        int vertexCount = graph.length;
        boolean[] visitedVertex = new boolean[vertexCount];
        int[] distance = new int[vertexCount];
        for (int i = 0; i < vertexCount; i++){
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
        }
        distance[sourceVertex] = 0; 
        for (int i = 0; i < vertexCount; i++){
            
            int u = findMinDistance(distance, visitedVertex);
            
            visitedVertex[u] = true;
           
            for (int v =0 ; v < vertexCount; v++){
           
                if(!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])){
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
		System.out.println("Shortest path is:");
        for (int i = 0; i < distance.length; i++){
            System.out.println(String.format("Distance from source vertex %s to vertex %s is %s", sourceVertex, i, distance[i]));
        }

    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i =0; i < distance.length; i++){
            
            if(!visitedVertex[i] && distance[i] < minDistance){
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of nodes");
		int n=sc.nextInt();
		System.out.println("Enter Adj Matrix");
		int graph[][] = new int[n][n];
		for(int i=0;i<n;i++)
		   for(int j=0;j<n;j++)
		graph[i][j] = sc.nextInt();
        Dijkstra t = new Dijkstra();
        t.dijkstra(graph, 2);
    }
}