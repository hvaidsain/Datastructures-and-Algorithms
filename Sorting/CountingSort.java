import java.util.*;
import java.math.*;
import java.io.*;


class CountingSort{

//Time complexity O(n)

//Space complexity O(n+k) ....where k is the range of input and n is number of inputs	

	public static void main(String[] args) {
		
		System.out.println("Enter the no. of Elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp[] = new int[n];
		for(int i=0;i<n;i++){			//Enter elements in the array

			a[i] = sc.nextInt();
		}
		int max = a[0];

		for(int i=1;i<n;i++){			//Finding the maximum range of integers
			
			if(a[i]>max){
				max = a[i];
			}
		}


		int count[] = new int[max+1];	//Count array which will store the how many times that index appeared in the original array

		for(int i=0;i<n;i++){

			count[a[i]]++;
		}
		

		for(int i=1;i<=max;i++){		//Modifying the count array whose index will store the position of the elements
			count[i] = count[i]+count[i-1];
		}

		for(int i=0;i<n;i++){			//Placing the elements in their suitable positions

			temp[count[a[i]]-1] = a[i];
			count[a[i]]--; 
		}

		for(int i=0;i<n;i++){			//Copying the temporary array(sorted) into the original array

			a[i] = temp[i];
		}

		System.out.println("Sorted list:");	//Printing the sorted array

		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}


	}
}