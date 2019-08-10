package test;

import java.util.Stack;

public class StackTests {
	
	public static void main(String[] args) {
		//Stack in java is class and its legacy, we have to use ArrayDeque as an alternative
		Stack<String> myStack=new Stack<String>();
		myStack.push("mounesh");
		myStack.push("badiger");
		myStack.push("kenganure");
		StackTests t=new StackTests();
		myStack.forEach(t::printData);
	}
	 public void printData(String data) {
		 System.out.println(data);
	 }

}
