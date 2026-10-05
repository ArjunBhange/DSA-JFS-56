package arrays;

import java.util.Scanner;

public class FindSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[]= {"leela","koti","kushal","sai teja","bharath"};
		String target = sc.next();
		boolean found=false;;
		for(String i:arr) {
			
			if(target.equals(i)) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Present ":"Not Present" );
				
	}

}
