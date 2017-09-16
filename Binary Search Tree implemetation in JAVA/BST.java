import java.util.*;
import java.math.*;
import java.io.*;


class Node {

	int data;
	Node left;
	Node right;


	Node(int data){
		this.data = data;
	}
}


class BST{


/*	public Node newNode(int key){
		Node node = new Node();
		node.data=key;
		node.left=null;
		node.right=null;

		return node;
	}
	*/



	public Node insert(Node root,int key){		//Method to Insert Node in the BST

		Node newNode = new Node(key);
		if(root==null){
			root = newNode;
		}
		else if(key<=root.data){
			root.left=insert(root.left,key);
		}
		else if(key>root.data){
			root.right=insert(root.right,key);
		}
		return root;
	}

	public boolean search(Node root,int key){

		if(root==null){
			return false;
		}
		else if(key==root.data){
			return true;
		}

		else if(key<root.data){
			return search(root.left,key);
		}
		else {
			return search(root.right,key);
		}
	}

	public int min(Node root){

		Node current  = root;
		if(current == null){
			return -1;
		}

		
		if(current.left==null){
			return current.data;
		}

		return min(current.left);


	}

	public int max(Node root){
		Node current = root;
		if(current==null){
			return -1;
		}

		if(current.right==null){
			return current.data;
		}

		return max(current.right);
	}

	public void preOrder(Node root){
		if(root==null){
			return;
		}

		System.out.print(root.data+" ");
		inOrder(root.left);
		inOrder(root.right);
	}

	public void postOrder(Node root){
		if(root==null){
			return;
		}

		
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data+" ");
	}

	public void inOrder(Node root){
		if(root==null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public int height(Node root){

		if(root==null){
			return -1;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);

		return (1+Math.max(leftheight,rightheight));
	}

	public static void main(String[] args) {
		
		BST mytree = new BST();
		Node root = null;

		root=mytree.insert(root,20);
		root=mytree.insert(root,15);
		root=mytree.insert(root,25);
		root=mytree.insert(root,10);
		root=mytree.insert(root,30);
		root=mytree.insert(root,40);
		root=mytree.insert(root,28);

		System.out.println(mytree.search(root,20));
		System.out.println(mytree.search(root,9));
		

		System.out.println(mytree.min(root));

		System.out.println(mytree.max(root));

		mytree.preOrder(root);

		System.out.println();

		mytree.inOrder(root);

		System.out.println();

		mytree.postOrder(root);

		System.out.println();

		System.out.println("height of tree is "+mytree.height(root));



	}
}
