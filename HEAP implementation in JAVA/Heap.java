import java.util.*;
import java.math.*;
import java.io.*;

class Heap{  

	//Program to build a maxheap from a given unsorted array




	public static void maxHeapify(int a[],int i){

		int l = 2*i+1;
		int r = 2*i+2;

		int largest = i;


		if(l<a.length && a[l]>a[largest]){
			largest = l;
		}

		if(r<a.length && a[r]>a[largest]){
			largest = r;
		}

		if(a[i] != a[largest]){

			int temp = 0;
			temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a,largest);
		}




	}


	public static void buildMaxHeap(int a[]){

		for(int i=(a.length)/2 ; i>=0;i--){
			maxHeapify(a,i);
		}
	}

	public static void main(String[] args) {
		
		int a[] = {2,4,6,1,8,5,9,3,7,20,11};

		buildMaxHeap(a);

		//displaying the max heap

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
