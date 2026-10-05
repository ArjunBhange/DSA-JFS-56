package arrays;

import java.util.Scanner;

public class Find_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int target =18;
		int arr[]= {23,89,18,87,49};
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index!=-1 ? "found at index:"+index:"not found");
	}

}
