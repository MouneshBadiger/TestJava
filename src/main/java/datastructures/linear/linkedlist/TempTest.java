package datastructures.linear.linkedlist;
import java.util.*;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TempTest<E>{

	private Node head;
	private Node tail;
	
	class Node<E>{
		Node pre;
		Node next;
		E value;
		Node(E value){
			
			this.value=value;
		}
	}
	
	public void addAtFirst(E ele) {
		Node node=new Node(ele);
		if(head!=null) {
			node.next=head;
			node.pre=null;
			head.pre=node;
			head=node;
		}
		if(tail==null) {
			tail=node;
		}
	}
	
	public void addAtEnd(E ele) {
		
		Node tmp=new Node(ele);
		
		if(tail!=null) {
			tail.next=tmp;
			tmp.pre=tail;
			tail=tmp;
		}
		
		if(head==null) {
			head=tmp;
			tail=tmp;
		}
		
	}
	public void iterateForword() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.value);
			current=current.next;
		}
	}
	public void iterateBackword() {
		Node current=tail;
		while(current!=null) {
			System.out.println(current.value);
			current=current.pre;
		}
	}
	public boolean isCyclic() {
		Node temp=head;
		Node temp1=head;
		while(temp1!=null && temp1.next!=null) {
			temp=temp.next;
			temp1=temp1.next.next;
			if(temp==temp1) {
				return true;
			}
			System.out.println("--");
		}
		if(temp ==temp1 ){ 
			return true;
		} 
		return false;
	}
	public static void main(String[] args) {
		TempTest<Integer> ls=new TempTest<Integer>();
		ls.addAtEnd(9);
		ls.addAtEnd(8);
		ls.addAtEnd(7);
		ls.addAtEnd(5);
		ls.addAtEnd(3);
		ls.addAtEnd(2);
		ls.addAtEnd(2);
		ls.iterateForword();
		System.out.println();
		System.out.println(ls.isCyclic());
		ls.tail.next=ls.head;
		ls.head.pre=ls.tail;
		System.out.println(ls.isCyclic());
	}
	

}
