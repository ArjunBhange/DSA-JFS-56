package arrays;

import java.util.Arrays;
import java.util.List;

public class FindEleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list= Arrays.asList("pen","paper","book","pencil");
		String target = "book"; 
		boolean found= false;
		for(String i:list) {
			if(i==target) {
				found = true;
			}
		}
		System.out.println(found ? "Found element":"not found");
			
		//for(int i=0;i<list.size();)
		
	}

}
