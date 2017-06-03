import java.util.*;
import java.math.*;
import java.io.*;

class SelectionSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements in the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements in the array");
		for (int i=0;i<n;i++) {

			a[i]=sc.nextInt();
			
		}
		long startTime = System.currentTimeMillis();
		for(int i=0;i<n-1;i++){
			int min=i;
			for (int j=i+1;j<n;j++) {
				if(a[j]<a[min]){
					min=j;
				}

			}
			int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
		}
		

		for (int i=0;i<n;i++) {

			System.out.print(a[i]+" ");
			
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(" totalTime:"+totalTime); //just timing my sorting algorithm for comparison


	}
}
