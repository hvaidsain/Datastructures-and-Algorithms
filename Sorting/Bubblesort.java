import java.util.*;
import java.math.*;
import java.io.*;

class Bubblesort{

	//A very simple algorithm....compares the elements in the list..if they r out of order then they are swapped
	//Advantage of Bubblesort is that it can used to check if an array is already sorted
	//By using a swap variable the the best case time complexity of bubblesort can be improved to O(n)

	public static void sort(int a[]){

		int temp=0;

		int n = a.length;
		for(int i=0;i<n;i++){
			int swap = 0;
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = 1;
				}
			}
			if(swap==0){
				break;
			}
		}
	}

	

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		//enter elements in array
		for (int i=0;i<n ;i++ ) {
			a[i] = sc.nextInt();
		}

		sort(a);
		for (int i=0;i<n ;i++ ) {
			System.out.println(a[i]);
		}
	}
}