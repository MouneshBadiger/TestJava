package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTests {
	
	public static void main(String[] args) {
		//LinkedList as Queve is normal queue
		Queue<String> myQueue=new LinkedList<String>(Arrays.asList("second","first","third"));
		System.out.println("LinkedList as Queve");
		myQueue.forEach(System.out::println);
		//PriorityQueue as Queve is Sorted Queue
		Queue<String> pQueue=new PriorityQueue<String>(Arrays.asList("second","first","third"));
		System.out.println();
		pQueue.add("abc");
		System.out.println("PriorityQueue as Queve");
		pQueue.forEach(System.out::println);
		//ArrayDeque as queue we can access elements from both the end,rest is same as normal queve
		ArrayDeque<String> dQueue=new ArrayDeque<String>(Arrays.asList("second","first","third"));
		System.out.println();
		dQueue.add("abc");
		System.out.println("ArrayDeque as Queve");
		dQueue.forEach(System.out::println);
		System.out.println("ArrayDeque after removing last in element");
		dQueue.removeLast();
		//dQueue.remove("first"); we can remove specific element
		dQueue.forEach(System.out::println);
		
		
		
	}

}
