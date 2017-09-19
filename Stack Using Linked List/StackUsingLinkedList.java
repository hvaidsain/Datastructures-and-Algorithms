import java.util.*;
import java.math.*;
import java.io.*;


class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class StackUsingLinkedList{

	public Node push(int data,Node top){
		Node newNode = new Node(data);
		if(top==null){
			return newNode;
		}
		else{
			newNode.next = top;
			top = newNode;
		}
		return top;
	}


	public Node pop(Node top){
		if(top==null){
			return top;
		}
		Node head = top;
		top = top.next;
		head.next=null;
		System.out.println(head.data+" Removed");


		return top;
	}
	public void display(Node top){
		if(top==null){
			System.out.println("Stack is Empty");
		}

		while(top!=null){

			System.out.print(top.data+" ");
			top = top.next;
		}
	}

	public static void main(String[] args) {
		
		Node top = null;

		StackUsingLinkedList st = new StackUsingLinkedList();

		top = st.push(10,top);
		top = st.push(20,top);
		top = st.push(30,top);
		top = st.push(40,top);
		top = st.push(50,top);
		top = st.push(60,top);
		top = st.push(70,top);
		top = st.pop(top);
		top = st.pop(top);
		top = st.pop(top);
		top = st.pop(top);

		st.display(top);


	}
}