import java.util.*;
import java.math.*;
import java.io.*;


class MergeSort{


	public static void mergesort(int a[],int low,int high){     

		if(low<high){

			int mid = (low+high)/2 ;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}

	public static void merge(int a[],int low,int mid,int high){  //Merge Function to merge two sorted arrays

		int temp[]  = new int[high-low+1];

		int left = low;
		int right = mid +1;
		int k = 0;

		while(left<=mid && right<=high){

			if(a[left]<=a[right]){
				temp[k] = a[left];
				left = left+1;
			}
			else if(a[left]>a[right]){
				temp[k] = a[right];
				right = right + 1;
			}
			k=k+1;
		}

		if(left<=mid){
			while(left<=mid){
				temp[k] = a[left];
				k++;
				left++;
			}
		}
		else if(right<=high){
			while(right<=high){
				temp[k] = a[right];
				k++;
				right++;
			}	
		}

		k=0;
		for(int i = low;i<=high;i++){
			a[i] = temp[k];
			k++;
		}

	}



	public static void displayArray(int a[]){     //Function to display array
		int n = a.length;
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Elements:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements in the arrays:");

		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Unsorted list:");

		
		displayArray(a);

		mergesort(a,0,n-1);

		System.out.println("Sorted List:");

		displayArray(a);


	}
}