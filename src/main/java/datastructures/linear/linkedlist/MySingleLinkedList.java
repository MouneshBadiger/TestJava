package datastructures.linear.linkedlist;

public class MySingleLinkedList<T> {
	
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
		
		if(head==null) {//If first element make it root node
			head=new Node(data,null);
		}else {//else add it to the last elemens next node
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
	
	/* Function to reverse the linked list */
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.nextNode; 
            current.nextNode = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
  
	
	
	
	public static void main(String[] args) {
		System.out.println("Inserting node");
		MySingleLinkedList<Integer> list=new MySingleLinkedList();
		list.insert(18);
		list.insert(99);
		list.insert(34);
		list.insert(13);
		list.insert(77);
		System.out.println("Printing all nodes");
		list.printAllNodes();
		
		MySingleLinkedList<String> nameList=new MySingleLinkedList<>();
		nameList.insert("mounesh");
		nameList.insert("badiger");
		nameList.insert("Kenganur");
		System.out.println("Printing all nodes");
		nameList.printAllNodes();
		System.out.println("Reversed List");
		nameList.head=nameList.reverse(list.head);
		nameList.printAllNodes();
		
	}
	
	
}
