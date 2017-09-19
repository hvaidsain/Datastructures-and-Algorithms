import java.util.*;
import java.math.*;
import java.io.*;


class Node{

	int data;
	Node next;

	Node(int data){

		this.data = data;
		this.next=null;
	}
}

class QueueUsingLinkedList{

	Node head = null;
	Node tail = null;

	public void enque(int data){

		Node newNode = new Node(data);
		if(tail== null){
			
			tail = newNode;
			head = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void deque(){

		if(head == null){
			System.out.println("Queue Empty");
		}
		else{
			Node current;

			current = head;
			head = head .next;
			System.out.println("Element removed:"+current.data);
			current = null;
		}
	}

	public void display(){

		Node current = head ; 
		while(current!=null){
			System.out.println(current.data+" ");
			current = current.next;
		}
	}


	public static void main(String[] args) {
		
		QueueUsingLinkedList l = new QueueUsingLinkedList();
		l.deque();
		l.enque(10);
		l.enque(20);
		l.enque(30);
		l.enque(40);
		l.enque(50);
		l.enque(60);
		l.enque(70);
		l.display();
		l.deque();
		l.deque();
		l.display();


	}
}