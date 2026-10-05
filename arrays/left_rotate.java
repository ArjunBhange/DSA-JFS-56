package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class left_rotate {
	
	public void leftRotate(int n,int arr[],int k) {
		
		/*for(int i=k;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}*/
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[(i+k)%n];
		}
		
		System.out.println(Arrays.toString(temp));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the k positoins");
		int k=sc.nextInt();
		int arr[]=new int[n];	
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		left_rotate lr=new left_rotate();
		
		lr.leftRotate(n,arr,k);
		
	}

}
