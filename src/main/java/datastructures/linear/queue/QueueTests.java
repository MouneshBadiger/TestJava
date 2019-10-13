package datastructures.linear.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QueueTests {
	
	public static void main(String[] args) {
		//LinkedList as Queve is normal queue we can access elements from both the end as implements Deque also
		Queue<String> myQueue=new LinkedList<String>(Arrays.asList("second","first","third"));
		System.out.println("LinkedList as Queve");
		myQueue.forEach(System.out::println);
		
		//PriorityQueue as Queve is Sorted Queue
		
		Queue<Integer> pQueue=new PriorityQueue<>(Arrays.asList(4,2,1,5,8,1,22,7,67,24));
		System.out.println();
		pQueue.add(10);
		pQueue.add(-3);
		System.out.println("PriorityQueue as Queve");
		//pQueue.forEach(System.out::println);
		while(pQueue.size()>0) {
			System.out.println(pQueue.poll());
		}
		
		//ArrayDeque as queue we can access elements from both the end as implements Deque also,rest is same as normal queve
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
