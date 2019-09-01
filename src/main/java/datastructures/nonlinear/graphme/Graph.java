package datastructures.nonlinear.graphme;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	
		private int V;   // No. of vertices 
	    private LinkedList<Integer> adj[]; //Adjacency Lists 
	    boolean[] visited;//to keep track of visited nodes
	  
	    // Constructor 
	    Graph(int v) 
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
	    
	    void BFS(int s) {//fallows Queue 
	    	boolean[] visited=new boolean[V];
	    	LinkedList<Integer> q=new LinkedList<Integer>();
	    	q.add(s);
	    	
	    	while(q.size()!=0) {
	    		int e=q.poll();
	    		System.out.println(e);
	    		visited[e]=true;
	    		
	    		for(Integer a:adj[e]) {
	    			if(visited[a]==false) {
	    				q.add(a);
	    			}
		    	}
	    	}
	    }
	   
	    void DFS(int s) {//fallows Stack
	    	visited[s]=true;
			System.out.println(s);
			
	    		Iterator<Integer> adList=adj[s].iterator();
		    	while(adList.hasNext()) {
		    		int i=adList.next();
		    		if(visited[i]==false) {
		    			DFS(i);
		    		}
		    	}
	    }

}
