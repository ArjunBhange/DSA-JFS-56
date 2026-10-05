package arrays;

public class ReverseArray {
	
	public static void Reverse(int arr[]) {
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,6,8};
		
		
	}

}
