package arrays;

import java.util.Scanner;

public class FindEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {13,5,33,90,23};
		/*for(int i:arr) {
			if(i%2==0) {
				System.out.println("Element found "+i);
				return;
			}
		}
		System.out.println("Element Not Found");*/
		boolean found =false;
		for(int i:arr) {
			if(i%2==0) {
				found = true;
				break;
			}
		}
		
		System.out.println(found ? "Found": "Not Found");
	}

}
