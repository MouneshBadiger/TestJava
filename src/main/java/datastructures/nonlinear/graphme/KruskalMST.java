package datastructures.nonlinear.graphme;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KruskalMST {
	
	public static void main(String[] args) {
		 Graph2 graph = new Graph2(6);
         graph.addEgde(0, 1, 4);
         graph.addEgde(0, 2, 3);
         graph.addEgde(1, 2, 1);
         graph.addEgde(1, 3, 2);
         graph.addEgde(2, 3, 4);
         graph.addEgde(3, 4, 2);
         graph.addEgde(4, 5, 6);
         graph.MST();
         graph.printMSTEdges();
	}
	

}
class Graph2{
	int V;
	
	PriorityQueue<Edge> queve=new PriorityQueue<Edge>();
	ArrayList<Edge> mstEdges=new ArrayList<Edge>();
	//Edge edge[];
	
	Graph2(int V){
		this.V=V;
	}
	public void addEgde(int src, int dest, int weight) {
		Edge e=new Edge(src,dest,weight);
		queve.add(e);
	}
	class Edge implements Comparable<Edge>{
		int src,dest,weight;	
		
		Edge(int src,int dest,int weight){
			this.src=src;
			this.dest=dest;
			this.weight=weight;
		}
		@Override
		public int compareTo(Edge o) {
			return this.weight-o.weight;
		}
	}
	
	// A utility function to find the subset of an element i 
	int find(int parent[], int i) 
	{ 
		if (parent[i] == -1) 
			return i; 
		return find(parent, parent[i]); 
	} 
	//Find MST
	public void MST() {
		
		
		int parent[]=new int[V];
		for(int i=0;i<V;i++) {
			parent[i]=-1;
		}
		
		int index=0;
		while(index<V-1) {//Fact:MST always has V-1 edges
			Edge edge=queve.poll();
			int x=find(parent,edge.src);
			int y=find(parent,edge.dest);
			
			if(x==y) {
				
			}else {
				parent[x]=y;//union operation
				//since this edge not going to make cycle add it to spanning Tree	
				mstEdges.add(edge);
				index++;
			}
			
		}
	}
	public void printMSTEdges() {
		System.out.println("Printing MST");
		System.out.println("src-dest-weight");
		for(Edge e:mstEdges) {
			System.out.println(e.src+"----"+e.dest+"----:"+e.weight);
		}
	}	
}