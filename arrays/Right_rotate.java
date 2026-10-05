package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Right_rotate {
	
	public void right_rotate(int n,int[] arr,int k) {
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++) {
			temp[(i+k)%n]= arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the k value");
		int k = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Right_rotate r=new Right_rotate();
		r.right_rotate(n,arr,k);
	}

}
