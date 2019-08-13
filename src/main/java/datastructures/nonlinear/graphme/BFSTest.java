package datastructures.nonlinear.graphme;

public class BFSTest {
	
	public static void main(String[] args) {
		System.out.println("----Main----");
		/* Test1 */
		/*
		 * Graph graph=new Graph(5); graph.addEdge(1, 2); graph.addEdge(1, 4);
		 * graph.addEdge(1, 5); graph.addEdge(2, 3);
		 * 
		 * graph.BFS(1);
		 */
		
		/* Test 2 */
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2); 
        System.out.println("Following is Dept First Traversal "+ 
                "(starting from vertex 2)"); 
        g.DFS(2);
	}

}


