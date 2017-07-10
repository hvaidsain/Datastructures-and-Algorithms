import java.util.*;
import java.math.*;
import java.io.*;

class Node{

	int data;
	Node next;

	Node (int data){

		this.data = data;
		this.next=null;
	}
}


	 class LinkedList{


		public void display(Node head){				//function to display linked list									

			Node p = head;
			while(p!=null){
				System.out.println(p.data);
				p = p.next;
			}
		}

		public void no_Of_Nodes(Node head){			//function to calculate no of nodes

			int count=0;
			Node current = head;
			while(current!=null){
				
				count++;
				current = current.next;
			}

			System.out.println("Number of Nodes:"+count);
		}

		public Node insertAtPosition(Node head,int position){		//function to insert a nodes at nth position

			int count=1;
			Node current = head;
			Node newNode = new Node(10);
			if(position==1){
				newNode.next = head;
				head = newNode;
				return head;


			}
			while(count<position-1){

				count++;
				current = current.next;
			}

			newNode.next=current.next;
			current.next=newNode;
			return head;


		}

		public Node deleteAtposition(Node head,int position){		//function to delete at nth position
			Node prev = head;
			int count = 1;

			if(position ==1){

				head = prev.next;
				prev.next=null;
				return head;
			}

			while(count<position-1){
				count++;
				prev = prev.next;
			}
			Node after = prev.next;
			prev.next = after.next;
			after.next= null;
			return head;
		}
		public Node insertAtFront(Node head,int value){    //Function to insert node at beginning

			Node newNode = new Node(value);
			newNode.next=head;
			head = newNode;
			return head;		
		}
	public Node insertAtEnd(Node head,int value){		//Function to insert node at end
			Node newNode = new Node(value);
			Node current = head;
			
			while(current.next!=null){
				
				current = current.next;


			}

			current.next = newNode;
			return head;


		}

		public Node deleteLast(Node head){

			Node current = head;
			Node preToLast = null;

			while(current.next!=null){
				preToLast = current;
				current = current.next;

			}

			preToLast.next = null;
			return head;
		}
		public void reversePrint(Node head){      //Function to reverse print the linked list

			Node current = head;

			if(current!=null){
				reversePrint(current.next);
				System.out.println(current.data);

			}
		}

		public Node insertInLinkedList(Node head,int key){

			Node current = head;
			Node newNode = new Node(key);
			
			if(current == null){
				return newNode;
			}

			while(current.next!=null){
				current = current.next;
			}

			current.next = newNode;
			return head;
		}

		public static void main(String[] args) {
			
			LinkedList mylist = new LinkedList();
			Node head = null;

			head = mylist.insertInLinkedList(head,10);
			head = mylist.insertInLinkedList(head,20);
			head = mylist.insertInLinkedList(head,30);
			head = mylist.insertInLinkedList(head,40);
			head = mylist.insertInLinkedList(head,45);
			head = mylist.insertInLinkedList(head,50);




			
			mylist.display(head);
			mylist.no_Of_Nodes(head);

			head = mylist.insertAtPosition(head,3);
			System.out.println("After inserting a node with data 10 at position 3");
			mylist.display(head);

			head= mylist.deleteAtposition(head,2);
			System.out.println("After deleting a node  at position 2");
			mylist.display(head);

			head = mylist.insertAtFront(head,20);
			System.out.println("After Inserting a node  at beginning");
			mylist.display(head);

			head = mylist.insertAtEnd(head,40);
			System.out.println("After Inserting a node  at End");
			mylist.display(head);

			head = mylist.deleteLast(head);
			System.out.println("After deleting a node  at End");
			mylist.display(head);

			System.out.println("Reverse printing of LinkedList");
			mylist.reversePrint(head);



		}
	}
