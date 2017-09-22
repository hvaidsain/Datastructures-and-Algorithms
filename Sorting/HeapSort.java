import java.util.*;
import java.math.*;
import java.io.*;

class HeapSort{


	public static void heapSort(int a[]){				//Sorting Method(Heapsort)

		buildMaxHeap(a);

		int temp = 0;

		int n = a.length;

		for(int i=n-1;i>0;i--){

			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			maxHeapify(a,0,i);
		}
	}


	public static void print(int a[]){						//Method to print the array

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}


	public static void buildMaxHeap(int a[]){				//building a max heap from the given array(unsorted)

		int n = a.length;
		for(int i=n/2;i>=0;i--){
			maxHeapify(a,i,n-1);
		}
	}

	public static void maxHeapify(int a[],int i,int n){		//Method to heapify a particular node(used for building a heap)

		int l = 2*i+1;
		int r = 2*i+2;
		int largest = i;

		if(l<n && a[l]>a[largest]){
			largest = l;
		}

		if(r<n && a[r]>a[largest]){
			largest = r;
		}

		int temp = 0;
		if(a[largest]!=a[i]){
			temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;

			maxHeapify(a,largest,n);

		}
	}

	public static void main(String[] args) {					//Driver Method
		
		int a[] = {1,3,2,4,5,7,6,9,8,12,43,14,16,65,18,87};

		buildMaxHeap(a);

		print(a);								//Printing the Max-Heap
							
		heapSort(a);							

		print(a);								//Printing the Sorted Array						
	}
}
