package juneprogramall;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int ar[]= {12,34,45,12,34,67,89,67};
		Set<Integer> unique= new HashSet<Integer>();
		Set<Integer> duplicate= new HashSet<Integer>();
		for(int num:ar) {
			if(!unique.add(num)) {
				duplicate.add(num);
				
			}
		}
		System.out.println(duplicate);

		


	}

}
