import java.util.*;
import java.math.*;
import java.io.*;


class LinearSearch{


	//Time complexity O(n).....where n is the size of the input
	//Space Complexity O(1)

	public static boolean search(int a[],int key){  //A function of return type boolean to search element in the array

		int n = a.length;

		for(int i=0;i<n;i++){
			if(key==a[i]){
				return true;
			}
		}
		return false;
	}




	public static void main(String[] args) {			//Driver function
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in the array");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter element to be searched:");
		int key = sc.nextInt();

		System.out.println(search(a,key));
	}
}
