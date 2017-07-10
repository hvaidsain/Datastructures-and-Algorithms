import java.util.*;
import java.math.*;
import java.io.*;

class MyStack{

	int a[];
	int top;
	int n;

	MyStack(int n){
		this.n = n;
		a = new int[n];
		this.top = -1;
	}




	public void push(int value){		//Funtion to push element in the stack
		if(top == n-1){
			System.out.println("Stack overflow!!");
		}
		else{
			top++;
			a[top] = value;
		}

	}

	public void display(){				//Function to display elements in Stack				

		if(top<0){
			System.out.println("Stack Empty");
		}

		else{

			for(int i=0;i<=top;i++){
				System.out.println(a[i]);
			}
		}
	}

	public int pop(){					//Function to pop elements from stack
		if(top<0){
			System.out.println("Stack Empty");
			return -1;
		}
		else{
			int x = a[top];
			top--;
			return x;
		}
		
	}

	public int peek(){					//Function to peek at top of the stack

		if(top<0){
			System.out.println("Stack empty");
			return -1;
		}
		
			return a[top];
		
	}
}

class Stack {							//Driver class

	public static void main(String[] args) {
		
		MyStack st = new MyStack(20);

		st.peek();
		st.display();
		st.pop();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);

		
		st.display();
		
		System.out.println("Popped Element:"+st.pop());
		System.out.println("Popped Element:"+st.pop());
		System.out.println("Popped Element:"+st.pop());

		st.display();
		


	}
}