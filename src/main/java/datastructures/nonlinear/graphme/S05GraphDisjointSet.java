package datastructures.nonlinear.graphme;

class S05GraphDisjointSet 
{ 
	int V, E; // V-> no. of vertices & E->no.of edges 
	Edge edge[]; // /collection of all edges 

	class Edge 
	{ 
		int src, dest; 
	}; 

	// Creates a graph with V vertices and E edges 
	S05GraphDisjointSet(int v,int e) 
	{ 
		V = v; 
		E = e; 
		edge = new Edge[E]; 
		for (int i=0; i<e; ++i) 
			edge[i] = new Edge(); 
	} 


	// The main function to check whether a given graph 
	// contains cycle or not 
	int isCycle( S05GraphDisjointSet graph) 
	{ 
		// Allocate memory for creating V subsets 
		int parent[] = new int[graph.V]; 

		// Initialize all subsets as single element sets 
		for (int i=0; i<graph.V; ++i) 
			parent[i]=-1; 

		// Iterate through all edges of graph, find subset of both 
		// vertices of every edge, if both subsets are same, then 
		// there is cycle in graph. 
		for (int i = 0; i < graph.E; ++i) 
		{ 
			int x = graph.find(parent, graph.edge[i].src); //find the root of source vertex
			int y = graph.find(parent, graph.edge[i].dest); //find the root of destination vertex

			if (x == y) {//if root of the both vertex is same then they belong to same set=>hence there is a cycle
				return 1; 
			}
			else {
				//else make union of both sets
				/*int xset = find(parent, x); not required
				int yset = find(parent, y);*/ 
				parent[x] = y; 
			}
		} 
		return 0; 
	} 
	// A utility function to find the subset of an element i 
		int find(int parent[], int i) 
		{ 
			if (parent[i] == -1) 
				return i; 
			return find(parent, parent[i]); 
		} 


	// Driver Method 
	public static void main (String[] args) 
	{ 
		/* Let us create following graph 
		0 
		| \ 
		|  \ 
		1----2 */
		int V = 3, E = 3; 
		S05GraphDisjointSet graph = new S05GraphDisjointSet(V, E); 

		// add edge 0-1 
		graph.edge[0].src = 0; 
		graph.edge[0].dest = 1; 

		// add edge 1-2 
		graph.edge[1].src = 1; 
		graph.edge[1].dest = 2; 

		// add edge 0-2 
		graph.edge[2].src = 0; 
		graph.edge[2].dest = 2; 

		if (graph.isCycle(graph)==1) 
			System.out.println( "graph contains cycle" ); 
		else
			System.out.println( "graph doesn't contain cycle" ); 
	} 
	
} 

