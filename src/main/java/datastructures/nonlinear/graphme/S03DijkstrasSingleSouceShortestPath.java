package datastructures.nonlinear.graphme;
//Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph, 
//which may represent, for example, road networks
//Dijkstra’s algorithm is very similar to Prim’s algorithm for minimum spanning tree. 
public class S03DijkstrasSingleSouceShortestPath {
	// A utility function to find the vertex with minimum distance value, 
    // from the set of vertices not yet included in shortest path tree 
    static final int V=9; 
 // Funtion that implements Dijkstra's single source shortest path 
    // algorithm for a graph represented using adjacency matrix 
    // representation 
    void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[V]; // The output array. dist[i] will hold 
                                 // the shortest distance from src to i 
  
        // visited[i] will be true if vertex i is included in shortest 
        // path tree or shortest distance from src to i is finalized 
        Boolean visited[] = new Boolean[V]; 
  
        // Initialize all distances as INFINITE and stpSet[] as false 
        for (int i = 0; i < V; i++) 
        { 
            dist[i] = Integer.MAX_VALUE; 
            visited[i] = false; 
        } 
  
        // Distance of source vertex from itself is always 0 
        dist[src] = 0; 
  
        // Find shortest path for all vertices 
        for (int count = 0; count < V-1; count++) 
        { 
            // Pick the minimum distance vertex from the set of vertices 
            // not yet processed. u is always equal to src in first 
            // iteration. 
            int u = minDistance(dist, visited); 
  
            // Mark the picked vertex as processed 
            visited[u] = true; 
  
            // Update dist value of the adjacent vertices of the 
            // picked vertex. 
            for (int v = 0; v < V; v++) 
  
                // Update dist[v] only if is not in visited, there is an 
                // edge from u to v, and total weight of path from src to 
                // v through u is smaller than current value of dist[v] 
               if(!visited[v] 
               && graph[u][v]!=0 
               &&  dist[u] != Integer.MAX_VALUE 
               && dist[u]+graph[u][v] < dist[v]){
                	
                	dist[v] = dist[u] + graph[u][v]; //called relaxation
                	
               }
        } 
  
        // print the constructed distance array 
        printSolution(dist); 
    }
    //method to return index of the array when Minimum element is found
    //This method is same as find Min element in a given array, with one additional check of visited
    int minDistance(int dist[], Boolean visited[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index=-1; 
  
        for (int i = 0; i < V; i++) 
            if (visited[i] == false && dist[i] <= min) 
            { 
                min = dist[i]; 
                min_index = i; 
            } 
  
        return min_index; 
    } 
    // A utility function to print the constructed distance array 
    void printSolution(int dist[]) 
    { 
        System.out.println("Vertex   Distance from Source"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i+" tt "+dist[i]); 
    } 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
             {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
             {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
             {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
             {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
             {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
             {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
             {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
             {0, 0, 2, 0, 0, 0, 6, 7, 0} 
            }; 
            S03DijkstrasSingleSouceShortestPath t = new S03DijkstrasSingleSouceShortestPath(); 
            System.out.println("------Distances from 0---------");
            t.dijkstra(graph, 0); 
            
            System.out.println("---------Distances from 5---------");
            t.dijkstra(graph, 5); 
	}



}
