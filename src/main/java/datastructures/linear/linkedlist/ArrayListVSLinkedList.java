package datastructures.linear.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		//List<String> list=new ArrayList<String>();
		long start=System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			list.add("mounesh");
		}
		long end=System.currentTimeMillis();
		System.out.println("total time taken in ms:"+(end-start)/1000+" Size:"+list.size());
	}
}
