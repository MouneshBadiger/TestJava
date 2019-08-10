package datastructures.linear.linkedlist;

public class MyLinkedList<T> {
	
	 Node<T> head;
	
	
	 class Node<T>{
		T data;
		Node<T> nextNode;
		public Node(T data, Node<T> nextNode) {
			super();
			this.data = data;
			this.nextNode = nextNode;
		}
		
	}
	
	public  void insert(T data) {
		
		if(head==null) {
			head=new Node(data,null);
		}else {
			Node last=head;
			while(last.nextNode!=null) {
				last=last.nextNode;
			}
			last.nextNode=new Node(data,null);
		}
		
	}
	public  void printAllNodes() {
		
		Node nextNode=head;
		while(nextNode!=null) {
			System.out.println(nextNode.data);
			nextNode=nextNode.nextNode;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inserting node");
		MyLinkedList<Integer> list=new MyLinkedList();
		list.insert(18);
		list.insert(99);
		list.insert(34);
		list.insert(13);
		list.insert(77);
		System.out.println("Printing all nodes");
		list.printAllNodes();
		
		MyLinkedList<String> nameList=new MyLinkedList<>();
		nameList.insert("mounesh");
		nameList.insert("badiger");
		nameList.insert("Kenganur");
		
		nameList.printAllNodes();
		
	}

}
