package datastructures.nonlinear.graphme;

import java.util.ArrayList;
import java.util.PriorityQueue;
//Kruskal is used to find the minumum spanning tree, logic is same as Disjoint sets, additionaly it first sorts edges in ascending order.
//Priority Queue is used to to sort elements in Incresing order.
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
