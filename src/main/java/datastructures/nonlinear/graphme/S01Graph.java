package datastructures.nonlinear.graphme;

import java.util.LinkedList;

public class S01Graph {
	
		private int V;   // No. of vertices 
	    private LinkedList<Integer> adj[]; //Adjacency Lists 
	    boolean[] visited;//to keep track of visited nodes
	  
	    // Constructor 
	    S01Graph(int v) 
	    { 
	        V = v; 
	        visited=new boolean[V];
	        adj = new LinkedList[v];
	        
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    // Function to add an edge into the graph 
	    void addEdge(int v,int w) 
	    { 
	        adj[v].add(w); 
	    } 
	    
	    /**
	     * Step 1: Create a Queue to hold unvisited vertex
	     * Step 2: Initiale Queue with given verted
	     * Step 3: Take vertex from queue and mark is visited
	     * step 4: Iterate over all vertex connected to polled vertex. If they are not visited add them to queue
	     * step 5: Repeat Process untill queue is empty.  
	     * @param s
	     */
	    void BFS(int s) {//fallows Queue 
	    	boolean[] visited=new boolean[V];
	    	LinkedList<Integer> q=new LinkedList<Integer>();
	    	q.add(s);
	    	
	    	while(q.size()!=0) {
	    		int i=q.poll();
	    		System.out.println(i);
	    		visited[i]=true;
	    		
	    		for(Integer a:adj[i]) {
	    			if(visited[a]==false) {
	    				q.add(a);
	    			}
		    	}
	    	}
	    }
	   
	    /**
	     * Step 1 : visit given vertex
	     * step 2 : Iterate over all connected vertex and call DFS if node is not visited
	     * @param s
	     */
	    void DFS(int s) {//fallows Stack
	    	visited[s]=true;
			System.out.println(s);
	    	for(Integer i:adj[s]) {
	    		if(visited[i]==false) {
	    			DFS(i);
	    		}
	    	}
	    }

}
