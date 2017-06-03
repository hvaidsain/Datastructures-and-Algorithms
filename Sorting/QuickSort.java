import java.util.*;
import java.math.*;
import java.io.*;


class QuickSort{

	public static void quickSort(int a[],int p,int r){

		int q;
		if(p<r){

			q = partion(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}

	}
	public static int partion(int a[],int p,int r){

		
		int x = a[r];
		int temp=0;
		int i=p-1;
		for(int j=p;j<r;j++){

			if (a[j]<=x) {
				i=i+1;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				
			}
		}
		temp=a[r];
		a[r]=a[i+1];
		a[i+1]=temp;
					
		return i+1;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Element in the array:");
		for (int i = 0;i<n ;i++ ) {

			a[i]=sc.nextInt();
			
		}
		long startTime = System.currentTimeMillis();
		quickSort(a,0,n-1);
		long endTime = System.currentTimeMillis();

		System.out.println("Sorted Array is:");
		for (int i = 0;i<n ;i++ ){

			System.out.println(a[i]);
		}
		
		long totalTime = endTime - startTime;

		System.out.println("totalTime:"+totalTime);

	}
}
