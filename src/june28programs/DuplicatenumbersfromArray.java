package june28programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicatenumbersfromArray {

	public static void main(String[] args) {
		
		int arr[]= {45,56,78,78,98,66,55,66,78,56,45};
		Set<Integer> unique= new HashSet<Integer>();
		Set<Integer> duplicate= new HashSet<Integer>();
		for(int num:arr) {
			if(!unique.add(num)) {
				duplicate.add(num);

			}
		}
		System.out.println(duplicate);

		

	}

}
