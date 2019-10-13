package datastructures.nonlinear.tree;

import java.util.Stack;

// A Java program to introduce Binary Tree
/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
	boolean isLeaf() {
	      return left == null ? right == null : false;
	      //return (left==null && right==null) ? true : false;
	 }
} 
public class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 

	// Constructors 
	BinaryTree(int key) 
	{ 
		root = new Node(key); 
	} 

	BinaryTree() 
	{ 
		root = null; 
	} 
	public int height(Node node) {
        if (node == null) return -1;
        //return 0 if you consider nodes to count height

        return Math.max(height(node.left), height(node.right)) + 1;
    }
	/* Returns true if binary tree with root as root is height-balanced */
    boolean isBalanced(Node node) 
    { 
        int lh; /* for height of left subtree */
  
        int rh; /* for height of right subtree */
  
        /* If tree is empty then return true */
        if (node == null) 
            return true; 
  
        /* Get the height of left and right sub trees */
        lh = height(node.left); 
        rh = height(node.right); 
  
        if (Math.abs(lh - rh) <= 1
            && isBalanced(node.left) 
            && isBalanced(node.right)) 
            return true; 
  
        /* If we reach here then tree is not height-balanced */
        return false; 
    } 
	 /* Given a binary tree, print its nodes according to the 
    "bottom-up" postorder traversal. */
  void printPostorder(Node node) 
  { 
      if (node == null) 
          return; 

      // first recur on left subtree 
      printPostorder(node.left); 

      // then recur on right subtree 
      printPostorder(node.right); 

      // now deal with the node 
      System.out.print(node.key + " "); 
  } 

  /* Given a binary tree, print its nodes in inorder*/
  void printInorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first recur on left child */
      printInorder(node.left); 

      /* then print the data of node */
      System.out.print(node.key + " "); 

      /* now recur on right child */
      printInorder(node.right); 
  } 

  /* Given a binary tree, print its nodes in preorder*/
  void printPreorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first print data of node */
      System.out.print(node.key + " "); 

      /* then recur on left sutree */
      printPreorder(node.left); 

      /* now recur on right subtree */
      printPreorder(node.right); 
  } 
  /**
   * Java method to visit tree nodes in PreOrder traversal without recursion.
   */
  public void preOrderWithoutRecursion() {
    Stack<Node> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      Node current = nodes.pop();
      System.out.printf("%s ", current.key);

      if (current.right != null) {
        nodes.push(current.right);
      }
      if (current.left != null) {
        nodes.push(current.left);
      }
    }
  }
  	public static void printLeaves(Node node) {
	    // base case
	    if (node == null) {
	      return;
	    }

	    if (node.isLeaf()) {
	      System.out.printf("%s ", node.key);
	    }

	    printLeaves(node.left);
	    printLeaves(node.right);

	  }
  	 /* Function to search for an element recursively */
    private boolean search(Node r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.key;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
  	/* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 

	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		/*create root*/
		tree.root = new Node(1); 

		/* following is the tree after above statement 

			1 
			/ \ 
		null null	 */

		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 

		/* 2 and 3 become left and right children of 1 
			   		1 
				 /	 \ 
			    2	  3 
			   / \	  / \ 
		     null null null null */


		tree.root.left.left = new Node(4); 
		/* 4 becomes left child of 2 
				   1 
				 /	 \ 
			    2	  3 
			   / \	  / \ 
		      4 null null null 
		     / \ 
		   null null 
		*/
		System.out.println("height of root node:"+tree.height(tree.root));

        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(tree.root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(tree.root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(tree.root); 
        System.out.println();
        if (tree.isBalanced(tree.root)) 
            System.out.println("Tree is balanced"); 
        else
            System.out.println("Tree is not balanced"); 
	} 
} 
