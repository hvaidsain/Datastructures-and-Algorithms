import java.util.*;
import java.math.*;
import java.io.*;

class BinarySearch{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no: of terms:");
		n = sc.nextInt();
		int a[]=new int[n];
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		System.out.println("Enter elements in the array:");
		for (int i=0;i<n;i++) {

			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the number to be searched for:");
		int num = sc.nextInt();
		while(low<=high){
			if(num==a[mid]){
				System.out.println("The number found at index:"+mid);
				break;
			}

			else if(num>a[mid]){
				low=mid+1;
				mid=(low+high)/2;
			}
			else{
				high=mid-1;
				mid=(low+high)/2;
			}
		}

	}
}